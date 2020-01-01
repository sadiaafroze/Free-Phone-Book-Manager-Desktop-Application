
package gui;
import database.ConnectToDatabase;
import javax.swing.JOptionPane;


public class Call extends javax.swing.JFrame {
   
    
    private static String personName;

    public Call() {
        initComponents();
        this.initializeFieldComponent();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tlName = new javax.swing.JPanel();
        jlCalling = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        plName = new javax.swing.JLabel();
        bEnd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlCalling.setText("Calling....");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        plName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        plName.setText("jLabel2");

        bEnd.setText("End Call");
        bEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEndActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tlNameLayout = new javax.swing.GroupLayout(tlName);
        tlName.setLayout(tlNameLayout);
        tlNameLayout.setHorizontalGroup(
            tlNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tlNameLayout.createSequentialGroup()
                .addGroup(tlNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlCalling, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tlNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bEnd)
                        .addGroup(tlNameLayout.createSequentialGroup()
                            .addGap(123, 123, 123)
                            .addComponent(jLabel1))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tlNameLayout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addComponent(plName, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        tlNameLayout.setVerticalGroup(
            tlNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tlNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlCalling, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(bEnd)
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tlName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tlName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEndActionPerformed
        try {
            
            this.dispose();
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_bEndActionPerformed

    public static void setPersonName(String personName) {
        Call.personName = personName;
    }
    private void initializeFieldComponent() {

        try {
            this.plName.setText(personName);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }
     public static void launch() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Call().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEnd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jlCalling;
    private javax.swing.JLabel plName;
    private javax.swing.JPanel tlName;
    // End of variables declaration//GEN-END:variables
}
