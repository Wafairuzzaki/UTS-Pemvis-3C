/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package utspemvis3c;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Iruzzend
 */
public class Game104 extends javax.swing.JFrame {

    /**
     * Creates new form Game104
     */

    public Game104() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Gunting = new javax.swing.JRadioButton();
        Batu = new javax.swing.JRadioButton();
        Kertas = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon("C:\\Users\\123\\Downloads\\ini icon\\image1-2.png")), "SUIT GAME", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Montserrat SemiBold", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(new java.awt.GridLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pilihan");

        jButton1.setText("Mulai");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Gunting.setText("Gunting");

        Batu.setText("Batu");

        Kertas.setText("Kertas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(Gunting)
                        .addGap(47, 47, 47)
                        .addComponent(Batu)
                        .addGap(50, 50, 50)
                        .addComponent(Kertas)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Gunting)
                    .addComponent(Batu)
                    .addComponent(Kertas))
                .addGap(66, 66, 66)
                .addComponent(jButton1)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    int maxrandom=3;
    Random r=new Random();
    int kata=0;
    int komputer=0;
    int skor=0;
    
    if (Gunting.isSelected())
    {
    kata=r.nextInt(maxrandom);
        switch (kata) {
            case 0:
                JOptionPane.showMessageDialog(null,"Suit Anda = Batu\n"+"Suit Komputer = Batu\n"+"Seri karena suit sama\n");
                break;
            case 1:
                JOptionPane.showMessageDialog(null,"Suit Anda = Batu\n"+"Suit Komputer = Gunting\n"+"Anda Menang\n");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Suit Anda = Batu\n"+"Suit Komputer = Kertas\n"+"Anda Kalah\n");
                break;
            default:
                break;
        }
    if (Batu.isSelected())
    {
    kata=r.nextInt(maxrandom);
        switch (kata) {
            case 0:
                JOptionPane.showMessageDialog(null,"Suit Anda = Batu\n"+"Suit Komputer = Batu\n"+"Seri karena suit sama\n");
                break;
            case 1:
                JOptionPane.showMessageDialog(null,"Suit Anda = Batu\n"+"Suit Komputer = Gunting\n"+"Anda Menang\n");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Suit Anda = Batu\n"+"Suit Komputer = Kertas\n"+"Anda Kalah\n");
                break;
            default:
                break;
        }
    if (Kertas.isSelected())
    {
    kata=r.nextInt(maxrandom);
        switch (kata) {
            case 0:
                JOptionPane.showMessageDialog(null,"Suit Anda = Batu\n"+"Suit Komputer = Batu\n"+"Seri karena suit sama\n");
                break;
            case 1:
                JOptionPane.showMessageDialog(null,"Suit Anda = Batu\n"+"Suit Komputer = Gunting\n"+"Anda Menang\n");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Suit Anda = Batu\n"+"Suit Komputer = Kertas\n"+"Anda Kalah\n");
                break;
            default:
                break;
        }
        

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Game104.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game104.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game104.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game104.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game104().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Batu;
    private javax.swing.JRadioButton Gunting;
    private javax.swing.JRadioButton Kertas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
