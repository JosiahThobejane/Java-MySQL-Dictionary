/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josionary;

/**
 *
 * @author Josiah
 */
public class ManageData extends javax.swing.JFrame {

    /**
     * Creates new form ManageData
     */
    public ManageData() {
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

        deleteAllBTN = new javax.swing.JButton();
        deleteWordBTN = new javax.swing.JButton();
        updateWordBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manage Dictionary");

        deleteAllBTN.setText("DELETE ALL WORDS");
        deleteAllBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAllBTNActionPerformed(evt);
            }
        });

        deleteWordBTN.setText("DELETE WORD");
        deleteWordBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteWordBTNActionPerformed(evt);
            }
        });

        updateWordBTN.setText("UPDATE WORD");
        updateWordBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateWordBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(updateWordBTN)
                            .addComponent(deleteWordBTN)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(deleteAllBTN)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(deleteWordBTN)
                .addGap(18, 18, 18)
                .addComponent(updateWordBTN)
                .addGap(18, 18, 18)
                .addComponent(deleteAllBTN)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateWordBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateWordBTNActionPerformed
        UpdateWord uw = new UpdateWord();
    }//GEN-LAST:event_updateWordBTNActionPerformed

    private void deleteWordBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteWordBTNActionPerformed
        DeleteWord dw = new DeleteWord();
        dw.show();
    }//GEN-LAST:event_deleteWordBTNActionPerformed

    private void deleteAllBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAllBTNActionPerformed
        Engine engine = new Engine();
        //this deletes all words in the database lol.....
        engine.deleteAll();
    }//GEN-LAST:event_deleteAllBTNActionPerformed

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
            java.util.logging.Logger.getLogger(ManageData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteAllBTN;
    private javax.swing.JButton deleteWordBTN;
    private javax.swing.JButton updateWordBTN;
    // End of variables declaration//GEN-END:variables
}
