package gui;

import database.ConnectToDatabase;
import javax.swing.JOptionPane;


public class EditEntry extends javax.swing.JFrame {

    private static String address;
    private static String emailID;
    private static String personName;
    private static String numbers;
    private static String website;

    public EditEntry() {
        initComponents();

        this.lPanelTitle.setText("Edit this contact");
        this.initializeFieldComponent();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pAddEditEntry = new javax.swing.JPanel();
        lPanelTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfEmailID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfNumbers = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfAddress = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        tfWebsite = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bSaveEdit = new javax.swing.JButton();
        bClose = new javax.swing.JButton();
        bReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lPanelTitle.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        lPanelTitle.setText("Panel Title");

        jLabel1.setText("Enter Name:");

        tfName.setToolTipText("Enter a name for this contact");
        tfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameActionPerformed(evt);
            }
        });

        jLabel2.setText("Numbers:");

        tfNumbers.setColumns(20);
        tfNumbers.setRows(5);
        jScrollPane1.setViewportView(tfNumbers);

        jLabel3.setText("[Seperate By");

        jLabel4.setText("comma if more");

        jLabel5.setText("than one.");

        tfAddress.setColumns(20);
        tfAddress.setRows(5);
        jScrollPane2.setViewportView(tfAddress);

        jLabel6.setText("Address:");

        jLabel7.setText("Email ID:");

        jLabel8.setText("Website:");

        bSaveEdit.setText("Save Edit");
        bSaveEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveEditActionPerformed(evt);
            }
        });

        bClose.setText("Close");
        bClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCloseActionPerformed(evt);
            }
        });

        bReset.setText("Reset");
        bReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pAddEditEntryLayout = new javax.swing.GroupLayout(pAddEditEntry);
        pAddEditEntry.setLayout(pAddEditEntryLayout);
        pAddEditEntryLayout.setHorizontalGroup(
            pAddEditEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAddEditEntryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pAddEditEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pAddEditEntryLayout.createSequentialGroup()
                        .addComponent(bSaveEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bClose))
                    .addGroup(pAddEditEntryLayout.createSequentialGroup()
                        .addGroup(pAddEditEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(pAddEditEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfWebsite)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                            .addComponent(tfName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfEmailID)
                            .addComponent(jScrollPane1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pAddEditEntryLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pAddEditEntryLayout.setVerticalGroup(
            pAddEditEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAddEditEntryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lPanelTitle)
                .addGap(18, 18, 18)
                .addGroup(pAddEditEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(pAddEditEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pAddEditEntryLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addGroup(pAddEditEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pAddEditEntryLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pAddEditEntryLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addGroup(pAddEditEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(pAddEditEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfWebsite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(pAddEditEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSaveEdit)
                    .addComponent(bClose)
                    .addComponent(bReset))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pAddEditEntry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pAddEditEntry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void setAddress(String address) {
        EditEntry.address = address;
    }

    public static void setEmailID(String emailID) {
        EditEntry.emailID = emailID;
    }

    public static void setPersonName(String personName) {
        EditEntry.personName = personName;
    }

    public static void setNumbers(String numbers) {
        EditEntry.numbers = numbers;
    }

    public static void setWebsite(String website) {
        EditEntry.website = website;
    }

    private void initializeFieldComponent() {

        try {

            this.tfAddress.setText(EditEntry.address);
            this.tfEmailID.setText(EditEntry.emailID);
            this.tfName.setText(EditEntry.personName);
            this.tfNumbers.setText(EditEntry.numbers);
            this.tfWebsite.setText(EditEntry.website);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }


    private void bCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCloseActionPerformed

        try {

            this.dispose();
        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_bCloseActionPerformed

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed

        try {

            this.tfAddress.setText("");
            this.tfEmailID.setText("");
            this.tfName.setText("");
            this.tfNumbers.setText("");
            this.tfWebsite.setText("");
        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_bResetActionPerformed

    private void bSaveEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveEditActionPerformed

        try {

            String sql = "UPDATE numbers SET "
                    + "name = \"" + this.tfName.getText().trim() + "\", "
                    + "numbers = \"" + this.tfNumbers.getText().trim() + "\", "
                    + "address = \"" + this.tfAddress.getText().trim() + "\", "
                    + "mail = \"" + this.tfEmailID.getText().trim() + "\", "
                    + "website = \"" + this.tfWebsite.getText().trim() + "\" "
                    + "WHERE name = \"" + EditEntry.personName + "\"";

            ConnectToDatabase.getResult(sql);

            this.dispose();
        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_bSaveEditActionPerformed

    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNameActionPerformed

    static void launch() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EditEntry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bClose;
    private javax.swing.JButton bReset;
    private javax.swing.JButton bSaveEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lPanelTitle;
    private javax.swing.JPanel pAddEditEntry;
    private javax.swing.JTextArea tfAddress;
    private javax.swing.JTextField tfEmailID;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextArea tfNumbers;
    private javax.swing.JTextField tfWebsite;
    // End of variables declaration//GEN-END:variables
}
