/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.Bashekim;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import Helper.*;
import Model.Clinic;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import Helper.Item;


/**
 *
 * @author Hasan Emre
 */
public class BashekimGUI extends javax.swing.JFrame {
    
    private DefaultTableModel doctorModel = null;
    private Object[] doctorData = null;
    private DefaultTableModel clinicModel = null;
    private Object[] clinicData = null;
    private JPopupMenu clinicMenu = null;

    
    static Bashekim bashekim = new Bashekim();
    static Clinic clinic = new Clinic();
    
    
    public BashekimGUI(Bashekim bashekim)throws SQLException {
       
        initComponents();
        Karsilama.setText("Hoşgeldiniz, Sayın " + bashekim.getName());
        
        
        doctorModel = new DefaultTableModel();
        Object[] colDoktorName  =new Object[4];
        colDoktorName[0] = "ID";
        colDoktorName[1] = "Ad Soyad";
        colDoktorName[2] = "TC NO";
        colDoktorName[3] = "Sifre";
        doctorModel.setColumnIdentifiers(colDoktorName);
        doctorData = new Object[4];
        
        for(int i=0; i<bashekim.GetDoctorList().size(); i++){
            
            doctorData[0] = bashekim.GetDoctorList().get(i).getId();
            doctorData[1] = bashekim.GetDoctorList().get(i).getName();
            doctorData[2] = bashekim.GetDoctorList().get(i).getTcno();
            doctorData[3] = bashekim.GetDoctorList().get(i).getPassword();
            doctorModel.addRow(doctorData);
      
        }
        Doktorlartablosu.setModel(doctorModel);
        Doktorlartablosu.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                try{
                    DYkullanici_id.setText(Doktorlartablosu.getValueAt(Doktorlartablosu.getSelectedRow(),0).toString());
       
                }catch(Exception ex){
                    
                }
            }
        });
        
        
      
        
        
        Doktorlartablosu.getModel().addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if(e.getType() == TableModelEvent.UPDATE){
                    int selectId = Integer.parseInt(Doktorlartablosu.getValueAt(Doktorlartablosu.getSelectedRow(), 0).toString());
                    String selectName = Doktorlartablosu.getValueAt(Doktorlartablosu.getSelectedRow(), 3).toString();
                    String selectTcno = Doktorlartablosu.getValueAt(Doktorlartablosu.getSelectedRow(), 1).toString();
                    String selectPass = Doktorlartablosu.getValueAt(Doktorlartablosu.getSelectedRow(), 2).toString();
               
                    try {
                        bashekim.updateDoctor(selectId, selectName, selectPass, selectTcno);
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(BashekimGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
            }
        });
            
        
        
          clinicModel = new DefaultTableModel();
        Object[] colClinic = new Object[2];
        colClinic[0] = "ID";
        colClinic[1] = "Poliklinik Adı";
        clinicModel.setColumnIdentifiers(colClinic);
        clinicData = new Object[2];
        
        for(int i=0; i<clinic.getlist().size(); i++){
            clinicData[0] = clinic.getlist().get(i).getId();
            clinicData[1] = clinic.getlist().get(i).getName();
            clinicModel.addRow(clinicData);
        }
        
        polkilinikler_tablosu.setModel(clinicModel);
       
        clinicMenu = new JPopupMenu();
        JMenuItem updateMenu = new JMenuItem("Güncelle");
        JMenuItem deleteMenu = new JMenuItem("Sil");
        clinicMenu.add(updateMenu);
        clinicMenu.add(deleteMenu);
        polkilinikler_tablosu.setComponentPopupMenu(clinicMenu);
        
        updateMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)   {
                int selId = Integer.parseInt(polkilinikler_tablosu.getValueAt(polkilinikler_tablosu.getSelectedRow(), 0).toString());
             
                Clinic selectClinic;
                try {
                    selectClinic = clinic.getFetch(selId);
                    GuncelleGUI guncelleGUI = new GuncelleGUI(selectClinic);
                    guncelleGUI.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    guncelleGUI.setVisible(true);
                    guncelleGUI.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosed(WindowEvent e) {

                            try {
                                updateClinicModel();
                            } catch (SQLException ex) {
                                Logger.getLogger(BashekimGUI.class.getName()).log(Level.SEVERE, null, ex);
                            }

                        }
                   
                    });
                    
                    
                } catch (SQLException ex) {
                    Logger.getLogger(BashekimGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
        
        
        
        deleteMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(Helper.confirm("sure")){
                    int selId = Integer.parseInt(polkilinikler_tablosu.getValueAt(polkilinikler_tablosu.getSelectedRow(), 0).toString());
                    try {
                        if(clinic.deleteClinic(selId)){
                            Helper.showqMsg("success");
                            updateClinicModel();
                        }
                        else{
                            Helper.showqMsg("error");
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                    
                }
                
                
                
            }
        });
        
        
        //doktorların comboboxa eklenmesi
        for(int i=0; i<bashekim.GetDoctorList().size(); i++){
            SelectDoctor.addItem(new Item(bashekim.GetDoctorList().get(i).getId(), bashekim.GetDoctorList().get(i).getName()));
        }
        
        
        
        
        
        polkilinikler_tablosu.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                
                Point point = e.getPoint();
                int selectedRow = polkilinikler_tablosu.rowAtPoint(point);
                polkilinikler_tablosu.setRowSelectionInterval(selectedRow, selectedRow);
                
            }
        
            
        
        });
        
        
    }

    private BashekimGUI() {
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        w_panel = new javax.swing.JPanel();
        Karsilama = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        DYadSoyad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        DYsifre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        DYtcno = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        DYkullanici_id = new javax.swing.JTextField();
        DYsil = new javax.swing.JButton();
        DoktorlarPaneli = new javax.swing.JScrollPane();
        Doktorlartablosu = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        polkilinikler_tablosu = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel5 = new javax.swing.JLabel();
        Ppoliklinik_adi = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        SelectDoctor = new javax.swing.JComboBox<>();
        addDoctor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        w_panel.setBackground(new java.awt.Color(255, 255, 255));

        Karsilama.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Karsilama.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                KarsilamaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jButton1.setText("ÇIKIŞ YAP");

        jLabel1.setText("Ad Soyad");

        jLabel2.setText("Şifre");

        jLabel3.setText("T.C. No");

        jButton2.setBackground(new java.awt.Color(51, 255, 204));
        jButton2.setText("Ekle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Kullanıcı Id");

        DYsil.setBackground(new java.awt.Color(102, 255, 204));
        DYsil.setText("Sil");
        DYsil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DYsilActionPerformed(evt);
            }
        });

        Doktorlartablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        DoktorlarPaneli.setViewportView(Doktorlartablosu);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(DoktorlarPaneli, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DYsil, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DYkullanici_id, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(DYsifre, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DYadSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DYtcno, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(14, 14, 14)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DYadSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DYtcno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DYsifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton2)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DYkullanici_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DYsil))
                    .addComponent(DoktorlarPaneli, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Doktor Yönetimi", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 255));

        polkilinikler_tablosu.setBackground(new java.awt.Color(245, 245, 245));
        polkilinikler_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(polkilinikler_tablosu);

        jLabel5.setText("Poliklinik Adı");

        jButton3.setBackground(new java.awt.Color(51, 255, 204));
        jButton3.setText("Ekle");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        addDoctor.setBackground(new java.awt.Color(51, 255, 204));
        addDoctor.setText("Ekle");
        addDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDoctorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ppoliklinik_adi)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(SelectDoctor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ppoliklinik_adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                        .addComponent(SelectDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addDoctor)
                        .addGap(36, 36, 36))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Poliklinikler", jPanel2);

        javax.swing.GroupLayout w_panelLayout = new javax.swing.GroupLayout(w_panel);
        w_panel.setLayout(w_panelLayout);
        w_panelLayout.setHorizontalGroup(
            w_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, w_panelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Karsilama, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, w_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        w_panelLayout.setVerticalGroup(
            w_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(w_panelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(w_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Karsilama, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(w_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(w_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KarsilamaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_KarsilamaAncestorAdded
       
        
    }//GEN-LAST:event_KarsilamaAncestorAdded

    private void DYsilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DYsilActionPerformed

        if(DYkullanici_id.getText().length() == 0){
            Helper.showqMsg("Lütfen geçerli doktor tanımlayınız...");
        }
        else{

            if(Helper.confirm("sure")){
                try {
                    int selectedId = Integer.parseInt(DYkullanici_id.getText());
                    boolean control = bashekim.deleteDoctor(selectedId);
                    if(control){
                        Helper.showqMsg("success");
                        updateDoctorModel();
                        DYkullanici_id.setText(null);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(BashekimGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }//GEN-LAST:event_DYsilActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if(DYadSoyad.getText().length() == 0  ||  DYtcno.getText().length() == 0   ||  DYsifre.getText().length() == 0 ){
            Helper.showqMsg("fill");
        }
        else{
            try {
                boolean control  = bashekim.addDoctor(DYtcno.getText(), DYsifre.getText(), DYadSoyad.getText());
                if(control == true){
                    Helper.showqMsg("success");
                    DYtcno.setText(null);
                    DYsifre.setText(null);
                    DYadSoyad.setText(null);
                    updateDoctorModel();
                }
            } catch (SQLException ex) {
                Logger.getLogger(BashekimGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        
        if(Ppoliklinik_adi.getText().length() == 0){
            Helper.showqMsg("fill");
        }
        else{
            try {
                if(clinic.addClinic(Ppoliklinik_adi.getText())){
                    Helper.showqMsg("success");
                    Ppoliklinik_adi.setText(null);
                    updateClinicModel();
                }
            } catch (SQLException ex) {
                Logger.getLogger(BashekimGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void addDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addDoctorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BashekimGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BashekimGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BashekimGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BashekimGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BashekimGUI frame;
                try {
                    frame = new BashekimGUI(bashekim);
                    frame.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(BashekimGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }
    
    
    public void updateDoctorModel() throws SQLException{
        DefaultTableModel clearTable = (DefaultTableModel) Doktorlartablosu.getModel();
        clearTable.setRowCount(0);
        
        for(int i=0; i<bashekim.GetDoctorList().size(); i++){
            
            doctorData[0] = bashekim.GetDoctorList().get(i).getId();
            doctorData[1] = bashekim.GetDoctorList().get(i).getName();
            doctorData[2] = bashekim.GetDoctorList().get(i).getTcno();
            doctorData[3] = bashekim.GetDoctorList().get(i).getPassword();
            doctorModel.addRow(doctorData);
      
        }
        
    }
    
    
    
    public void updateClinicModel () throws SQLException{
        
        DefaultTableModel tableClear = (DefaultTableModel) polkilinikler_tablosu.getModel();
        tableClear.setRowCount(0);
        
        for( int i=0; i<clinic.getlist().size(); i++ ){
            clinicData[0] = clinic.getlist().get(i).getId();
            clinicData[1] = clinic.getlist().get(i).getName();
            clinicModel.addRow(clinicData);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DYadSoyad;
    private javax.swing.JTextField DYkullanici_id;
    private javax.swing.JTextField DYsifre;
    private javax.swing.JButton DYsil;
    private javax.swing.JTextField DYtcno;
    private javax.swing.JScrollPane DoktorlarPaneli;
    private javax.swing.JTable Doktorlartablosu;
    private javax.swing.JLabel Karsilama;
    private javax.swing.JTextField Ppoliklinik_adi;
    private javax.swing.JComboBox<String> SelectDoctor;
    private javax.swing.JButton addDoctor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable polkilinikler_tablosu;
    private javax.swing.JPanel w_panel;
    // End of variables declaration//GEN-END:variables
}
