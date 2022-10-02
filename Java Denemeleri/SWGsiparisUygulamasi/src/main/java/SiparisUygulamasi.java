
import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Hasan Emre
 */
public class SiparisUygulamasi extends javax.swing.JFrame {

    Map<String,Integer> siparisler = new LinkedHashMap<String,Integer>();
    
    /**
     * Creates new form SiparisUygulamasi
     */
    public SiparisUygulamasi() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu_alani = new javax.swing.JLabel();
        zurna = new javax.swing.JCheckBox();
        iskender = new javax.swing.JCheckBox();
        ayran = new javax.swing.JCheckBox();
        salata = new javax.swing.JCheckBox();
        sipariş = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu_alani.setText("Menü: ");

        zurna.setText("Zurna Tavuk Dürüm 33 TL");

        iskender.setText("İskender 80 TL");

        ayran.setText("Ayran 7 TL");

        salata.setText("Salata 12 TL");

        sipariş.setText("Sipariş Ver");
        sipariş.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siparişActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menu_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ayran)
                                    .addComponent(zurna)
                                    .addComponent(salata)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(sipariş, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(133, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(109, 109, 109)
                    .addComponent(iskender)
                    .addContainerGap(298, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(menu_alani)
                .addGap(68, 68, 68)
                .addComponent(zurna)
                .addGap(18, 18, 18)
                .addComponent(salata)
                .addGap(18, 18, 18)
                .addComponent(ayran)
                .addGap(32, 32, 32)
                .addComponent(sipariş, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(95, 95, 95)
                    .addComponent(iskender)
                    .addContainerGap(339, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void siparisleriGoster(){
        
        String message = "";
        int tutar = 0;
        
        if(siparisler.isEmpty()){
            message = "Siparişleriniz bulunmamaktadır...";
        }
        else{
            message += "Siparişler\n";
            for(Map.Entry<String,Integer> entry : siparisler.entrySet()){
                message += entry.getKey() + "\n";
                tutar += entry.getValue() ;
            }
            
            message += "\nToplam tutar: " + tutar;
        }
        
        JOptionPane.showMessageDialog(this, message);
        
    }
    
    private void siparişActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siparişActionPerformed
        
        if(iskender.isSelected()){
            siparisler.put("İskender",80);
        }
        else{
            siparisler.remove("İskender");
        }
        
        
        if(zurna.isSelected()){
            siparisler.put("Zurna Tavuk Döner",33);
        }
        else{
            siparisler.remove("Zurna Tavuk Döner");
        }
          
          
        if(salata.isSelected()){
            siparisler.put("Salata",12);
        }
        else{
            siparisler.remove("Salata");
        }
            
              
        if(ayran.isSelected()){
            siparisler.put("Ayran",7);
        }
        else{
            siparisler.remove("Ayran");
        }
       
        siparisleriGoster();
        
    }//GEN-LAST:event_siparişActionPerformed

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
            java.util.logging.Logger.getLogger(SiparisUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SiparisUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SiparisUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SiparisUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SiparisUygulamasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ayran;
    private javax.swing.JCheckBox iskender;
    private javax.swing.JLabel menu_alani;
    private javax.swing.JCheckBox salata;
    private javax.swing.JButton sipariş;
    private javax.swing.JCheckBox zurna;
    // End of variables declaration//GEN-END:variables
}