
package gui;

import database.ConnectToDatabase;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.ContactModel;

public class MainFrame extends javax.swing.JFrame {

    private final DefaultTableModel defaultTableModel;
    private ResultSet resultSet = null;
    private List<ContactModel> contactModels;
    private ContactModel contactModel;
    private String sql;

    public MainFrame() {
        initComponents();

        this.defaultTableModel = (DefaultTableModel) this.tblContactList.getModel();
        this.contactModels = new ArrayList<>();
        this.getContactsFromDatabase();
        this.initializeContactList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        pOne = new javax.swing.JPanel();
        bAddNew = new javax.swing.JButton();
        bEdit = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfSearchBox = new javax.swing.JTextField();
        cbSearchBy = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblContactList = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfDetailsInformation = new javax.swing.JTextArea();
        jCall = new javax.swing.JButton();
        jMessage = new javax.swing.JButton();
        mbOne = new javax.swing.JMenuBar();
        jmFile = new javax.swing.JMenu();
        jmiAddNewEntry = new javax.swing.JMenuItem();
        jmiRefresh = new javax.swing.JMenuItem();
        jmiEditAEntry = new javax.swing.JMenuItem();
        jmiDeleteAEntry = new javax.swing.JMenuItem();
        jmiQuit = new javax.swing.JMenuItem();
        jmHelp = new javax.swing.JMenu();
        jmiNeedHelp = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Phone Book Manager");

        bAddNew.setText("Add New");
        bAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddNewActionPerformed(evt);
            }
        });

        bEdit.setText("Edit");
        bEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditActionPerformed(evt);
            }
        });

        bDelete.setText("Delete");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });

        jLabel1.setText("Search");

        tfSearchBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSearchBoxKeyReleased(evt);
            }
        });

        cbSearchBy.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "By Name", "By Phone Number", "By Email" }));

        tblContactList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Primary Phone Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblContactList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblContactListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblContactList);

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        jLabel2.setText("Details Information");

        tfDetailsInformation.setColumns(20);
        tfDetailsInformation.setRows(5);
        jScrollPane2.setViewportView(tfDetailsInformation);

        jCall.setText("Call");
        jCall.setEnabled(false);
        jCall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCallActionPerformed(evt);
            }
        });

        jMessage.setText("Message");
        jMessage.setEnabled(false);
        jMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMessageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pOneLayout = new javax.swing.GroupLayout(pOne);
        pOne.setLayout(pOneLayout);
        pOneLayout.setHorizontalGroup(
            pOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(pOneLayout.createSequentialGroup()
                        .addComponent(bAddNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bDelete)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pOneLayout.createSequentialGroup()
                        .addComponent(jCall, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jMessage)
                        .addGap(9, 9, 9)))
                .addGroup(pOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pOneLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSearchBox, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSearchBy, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pOneLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pOneLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );

        pOneLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bAddNew, bDelete, bEdit});

        pOneLayout.setVerticalGroup(
            pOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAddNew)
                    .addComponent(bEdit)
                    .addComponent(bDelete)
                    .addComponent(jLabel1)
                    .addComponent(tfSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSearchBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pOneLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE))
                    .addGroup(pOneLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCall)
                            .addComponent(jMessage))))
                .addContainerGap())
        );

        jmFile.setText("File");

        jmiAddNewEntry.setText("Add New Entry");
        jmiAddNewEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAddNewEntryActionPerformed(evt);
            }
        });
        jmFile.add(jmiAddNewEntry);

        jmiRefresh.setText("Refresh");
        jmiRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRefreshActionPerformed(evt);
            }
        });
        jmFile.add(jmiRefresh);

        jmiEditAEntry.setText("Edit A Entry");
        jmiEditAEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEditAEntryActionPerformed(evt);
            }
        });
        jmFile.add(jmiEditAEntry);

        jmiDeleteAEntry.setText("Delete A Entry");
        jmiDeleteAEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDeleteAEntryActionPerformed(evt);
            }
        });
        jmFile.add(jmiDeleteAEntry);

        jmiQuit.setText("Quit");
        jmiQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiQuitActionPerformed(evt);
            }
        });
        jmFile.add(jmiQuit);

        mbOne.add(jmFile);

        jmHelp.setText("Help");

        jmiNeedHelp.setText("Need Help ?");
        jmHelp.add(jmiNeedHelp);

        mbOne.add(jmHelp);

        setJMenuBar(mbOne);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initializeContactList() {

        try {

            this.clearTable();

            for (ContactModel cm : this.contactModels) {

                this.defaultTableModel.addRow(new Object[]{
                    cm.getName(),
                    cm.getNumbers()[0]
                });
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void getContactsFromDatabase() {

        try {

            this.contactModels.clear();

            this.sql = "SELECT * FROM numbers ORDER BY name ASC";

            this.resultSet = ConnectToDatabase.getResult(this.sql);

            this.initializeContactModel();
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void initializeContactModel() throws SQLException {

        try {

            while (this.resultSet.next()) {

                this.contactModel = new ContactModel();

                this.contactModel.setAddress(this.resultSet.getString("address"));
                this.contactModel.setEmailID(this.resultSet.getString("mail"));
                this.contactModel.setName(this.resultSet.getString("name"));
                this.contactModel.setNumbers(this.resultSet.getString("numbers"));
                this.contactModel.setWebsite(this.resultSet.getString("website"));

                this.contactModels.add(this.contactModel);
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void clearTable() {

        try {

            for (int i = this.defaultTableModel.getRowCount() - 1; i >= 0; i--) {

                this.defaultTableModel.removeRow(i);
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }


    private void jmiQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiQuitActionPerformed

        try {

            System.exit(0);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_jmiQuitActionPerformed

    private void bAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddNewActionPerformed

        try {

            AddEntry.launch();
            this.jmiRefreshActionPerformed(evt);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
        try {
            
            this.tfDetailsInformation.setText("");
            this.contactModels.clear();
            this.getContactsFromDatabase();
            this.initializeContactModel();
            this.initializeContactList();
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_bAddNewActionPerformed

    private void bEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditActionPerformed

        try {

            int index = this.tblContactList.getSelectedRow();

            if (index >= 0) {

                this.contactModel = this.contactModels.get(index);

                String numbers = "";
                for (String num : this.contactModel.getNumbers()) {

                    if (!(num.trim() == null && "".equals(num.trim()))) {

                        numbers += (num + ",");
                    }
                }

                EditEntry.setAddress(this.contactModel.getAddress());
                EditEntry.setEmailID(this.contactModel.getEmailID());
                EditEntry.setNumbers(numbers);
                EditEntry.setPersonName(this.contactModel.getName());
                EditEntry.setWebsite(this.contactModel.getWebsite());

                EditEntry.launch();
                this.jmiRefreshActionPerformed(evt);
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_bEditActionPerformed

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed

        try {

            int index = this.tblContactList.getSelectedRow();
            
            this.sql = "DELETE FROM numbers WHERE name = \""
                    + this.defaultTableModel.getValueAt(index, 0) + "\"";
            
            DeleteEntry.setSql(sql);
            
            DeleteEntry.launch();

            this.tfDetailsInformation.setText("");
            this.jmiRefreshActionPerformed(evt);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_bDeleteActionPerformed

    private void jmiAddNewEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAddNewEntryActionPerformed

        this.bAddNewActionPerformed(evt);
        this.jmiRefreshActionPerformed(evt);
    }//GEN-LAST:event_jmiAddNewEntryActionPerformed

    private void jmiEditAEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEditAEntryActionPerformed

        this.bEditActionPerformed(evt);
        this.jmiRefreshActionPerformed(evt);
    }//GEN-LAST:event_jmiEditAEntryActionPerformed

    private void jmiDeleteAEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDeleteAEntryActionPerformed

        this.bDeleteActionPerformed(evt);
        this.jmiRefreshActionPerformed(evt);
    }//GEN-LAST:event_jmiDeleteAEntryActionPerformed

    private void tblContactListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblContactListMouseClicked

        try {

            String display;
            String numbers = "";
            int index = this.tblContactList.getSelectedRow();

            this.contactModel = this.contactModels.get(index);

            for (String x : this.contactModel.getNumbers()) {

                numbers += (x + "\n");
            }

            display = "Name: " + this.contactModel.getName() + "\n\n"
                    + "Numbers:\n"
                    + numbers + "\n\n"
                    + "Email:\n" + this.contactModel.getEmailID() + "\n\n"
                    + "Address:\n" + this.contactModel.getAddress() + "\n\n"
                    + "Website:\n" + this.contactModel.getWebsite();

            this.tfDetailsInformation.setText(display);
            this.setAccountButtonsActive(true);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tblContactListMouseClicked

    private void jmiRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRefreshActionPerformed

        try {
            
            this.tfDetailsInformation.setText("");
            this.contactModels.clear();
            this.getContactsFromDatabase();
            this.initializeContactModel();
            this.initializeContactList();
            this.setAccountButtonsActive(false);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jmiRefreshActionPerformed

    private void tfSearchBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchBoxKeyReleased

        try {

            String searchKey = this.tfSearchBox.getText();
            this.tfDetailsInformation.setText("");

            this.sql = "SELECT * FROM numbers ORDER BY name ASC";

            switch ((String) this.cbSearchBy.getSelectedItem()) {

                case "By Name": {

                    this.sql = "SELECT * FROM numbers WHERE name LIKE "
                            + "\"" + searchKey + "%\" ORDER BY name ASC";
                    break;
                }
                case "By Phone Number": {

                    this.sql = "SELECT * FROM numbers WHERE numbers LIKE "
                            + "\"%" + searchKey + "%\" ORDER BY name ASC";
                    break;
                }
                case "By Email": {

                    this.sql = "SELECT * FROM numbers WHERE mail LIKE "
                            + "\"" + searchKey + "%\" ORDER BY name ASC";
                    break;
                }
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        } finally {

            try {

                this.contactModels.clear();

                this.resultSet = ConnectToDatabase.getResult(this.sql);

                this.initializeContactModel();
                this.initializeContactList();
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_tfSearchBoxKeyReleased

    private void setAccountButtonsActive(boolean active) {
            this.jCall.setEnabled(active);
            this.jMessage.setEnabled(active);
    }
    private void jCallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCallActionPerformed
        try {

            int index = this.tblContactList.getSelectedRow();

            if (index >= 0) {

                this.contactModel = this.contactModels.get(index);

                String numbers = "";
                for (String num : this.contactModel.getNumbers()) {

                    if (!(num.trim() == null && "".equals(num.trim()))) {

                        numbers += (num + ",");
                    }
                }

                
                Call.setPersonName(this.contactModel.getName());

                Call.launch();
                this.jmiRefreshActionPerformed(evt);
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jCallActionPerformed

    private void jMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMessageActionPerformed
        try {

            int index = this.tblContactList.getSelectedRow();

            if (index >= 0) {

                this.contactModel = this.contactModels.get(index);

                String numbers = "";
                for (String num : this.contactModel.getNumbers()) {

                    if (!(num.trim() == null && "".equals(num.trim()))) {

                        numbers += (num + ",");
                    }
                }

                
                Message.setPersonName(this.contactModel.getName());

                Message.launch();
                this.jmiRefreshActionPerformed(evt);
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jMessageActionPerformed

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
            @Override
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAddNew;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bEdit;
    private javax.swing.JComboBox cbSearchBy;
    private javax.swing.JButton jCall;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JButton jMessage;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu jmFile;
    private javax.swing.JMenu jmHelp;
    private javax.swing.JMenuItem jmiAddNewEntry;
    private javax.swing.JMenuItem jmiDeleteAEntry;
    private javax.swing.JMenuItem jmiEditAEntry;
    private javax.swing.JMenuItem jmiNeedHelp;
    private javax.swing.JMenuItem jmiQuit;
    private javax.swing.JMenuItem jmiRefresh;
    private javax.swing.JMenuBar mbOne;
    private javax.swing.JPanel pOne;
    private javax.swing.JTable tblContactList;
    private javax.swing.JTextArea tfDetailsInformation;
    private javax.swing.JTextField tfSearchBox;
    // End of variables declaration//GEN-END:variables
}
