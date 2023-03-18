/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vues;

import Entities.Eleve;

/**
 *
 * @author ninou
 */
public class FrmEleveAcceuil extends javax.swing.JFrame {

    /**
     * Creates new form FrmEleveAcceuil
     */
    static Eleve eleve;
    
    public FrmEleveAcceuil() {
        initComponents();
    }
    
    public FrmEleveAcceuil(Eleve unEleve){
        initComponents();
        eleve = unEleve;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEleveplanning = new javax.swing.JButton();
        btnEleveVoirStats = new javax.swing.JButton();
        txtMoniteurNomConnexion = new javax.swing.JScrollPane();
        txtEleveConnecte = new javax.swing.JTextPane();
        btnEleveModifierInformation = new javax.swing.JButton();
        lblEleveNomConnexion = new javax.swing.JLabel();
        btnEleveNouvelleLecon = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnEleveplanning.setText("Visualiser mon planning ");
        btnEleveplanning.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEleveplanningMouseClicked(evt);
            }
        });

        btnEleveVoirStats.setText("Voir mes statistiques");
        btnEleveVoirStats.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEleveVoirStatsMouseClicked(evt);
            }
        });

        txtEleveConnecte.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtEleveConnecte.setEnabled(false);
        txtMoniteurNomConnexion.setViewportView(txtEleveConnecte);

        btnEleveModifierInformation.setText("Modifier mes informations personnelles");
        btnEleveModifierInformation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEleveModifierInformationMouseClicked(evt);
            }
        });

        lblEleveNomConnexion.setText("Vous êtes connecté en tant que  :");

        btnEleveNouvelleLecon.setText("S'inscrire à une nouvelle leçon");
        btnEleveNouvelleLecon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEleveNouvelleLeconMouseClicked(evt);
            }
        });
        btnEleveNouvelleLecon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEleveNouvelleLeconActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ESPACE ELEVE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEleveModifierInformation)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnEleveplanning, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(btnEleveVoirStats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEleveNouvelleLecon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(98, 98, 98))))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEleveNomConnexion, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMoniteurNomConnexion, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblEleveNomConnexion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtMoniteurNomConnexion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(btnEleveplanning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEleveNouvelleLecon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEleveVoirStats)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnEleveModifierInformation)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEleveplanningMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEleveplanningMouseClicked
        // TODO add your handling code here:

         FrmElevePlanning frm= new FrmElevePlanning(eleve);
        frm.setVisible(true);
    }//GEN-LAST:event_btnEleveplanningMouseClicked

    private void btnEleveVoirStatsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEleveVoirStatsMouseClicked
        FrmEleveStatLecon frm = new FrmEleveStatLecon(eleve);
        frm.setVisible(true);
    }//GEN-LAST:event_btnEleveVoirStatsMouseClicked

    private void btnEleveNouvelleLeconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEleveNouvelleLeconMouseClicked
        FrmEleveInscriptionLecon frm = new FrmEleveInscriptionLecon(eleve);
        frm.setVisible(true);
    }//GEN-LAST:event_btnEleveNouvelleLeconMouseClicked

    private void btnEleveNouvelleLeconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEleveNouvelleLeconActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEleveNouvelleLeconActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        txtEleveConnecte.setText(eleve.getNom() + " " + eleve.getPrenom());
    }//GEN-LAST:event_formWindowOpened

    private void btnEleveModifierInformationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEleveModifierInformationMouseClicked
        // TODO add your handling code here:
        FrmEleveModificationInformation frm= new FrmEleveModificationInformation(eleve);
        frm.setVisible(true);
    }//GEN-LAST:event_btnEleveModifierInformationMouseClicked

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
            java.util.logging.Logger.getLogger(FrmEleveAcceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEleveAcceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEleveAcceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEleveAcceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEleveAcceuil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEleveModifierInformation;
    private javax.swing.JButton btnEleveNouvelleLecon;
    private javax.swing.JButton btnEleveVoirStats;
    private javax.swing.JButton btnEleveplanning;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblEleveNomConnexion;
    private javax.swing.JTextPane txtEleveConnecte;
    private javax.swing.JScrollPane txtMoniteurNomConnexion;
    // End of variables declaration//GEN-END:variables
}
