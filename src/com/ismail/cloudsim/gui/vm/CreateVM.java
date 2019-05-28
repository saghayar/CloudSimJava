package com.ismail.cloudsim.gui.vm;

import com.ismail.cloudsim.gui.DB;
import org.cloudbus.cloudsim.CloudletSchedulerTimeShared;
import org.cloudbus.cloudsim.Vm;

public class CreateVM extends javax.swing.JDialog {

    DB db = new DB();

    public CreateVM(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        txtSizeVm.setText("1000");
        txtmipsvm.setText("1000");
        txtramvm.setText("512");
        txtPeCountVm.setText("1");
        txtVmmVm.setText("Xen");
        txtuseridvm.setText("1");
        txtbwvm.setText("1000");
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbVmSchulderVm = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btnCreateVm = new javax.swing.JButton();
        txtmipsvm = new javax.swing.JTextField();
        txtramvm = new javax.swing.JTextField();
        txtbwvm = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSizeVm = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPeCountVm = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtVmmVm = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtuseridvm = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Mips");

        jLabel2.setText("RAM");

        jLabel3.setText("Bw");

        jLabel4.setText("Cloudlet  schulder");

        cbVmSchulderVm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Time Shared" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Add Vm");

        btnCreateVm.setText("Create");
        btnCreateVm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateVmActionPerformed(evt);
            }
        });

        txtmipsvm.setText(" ");

        txtramvm.setText(" ");
        txtramvm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtramvmActionPerformed(evt);
            }
        });

        txtbwvm.setText(" ");

        jLabel7.setText("Size");

        txtSizeVm.setText(" ");

        jLabel8.setText("peCount");

        txtPeCountVm.setText(" ");

        jLabel9.setText("vmm");

        txtVmmVm.setText(" ");
        txtVmmVm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVmmVmActionPerformed(evt);
            }
        });

        jLabel6.setText("userid");

        txtuseridvm.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCreateVm, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtmipsvm)
                    .addComponent(txtramvm)
                    .addComponent(txtbwvm)
                    .addComponent(txtuseridvm, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSizeVm)
                            .addComponent(txtPeCountVm)
                            .addComponent(txtVmmVm))
                        .addGap(82, 82, 82))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbVmSchulderVm, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(73, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtmipsvm))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtramvm))
                        .addGap(3, 3, 3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbVmSchulderVm))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtSizeVm))
                        .addGap(7, 7, 7)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPeCountVm, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel3)
                        .addComponent(txtbwvm)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtVmmVm)
                    .addComponent(txtuseridvm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(32, 32, 32)
                .addComponent(btnCreateVm)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int vmid, brokerId, pesNumber, ram;
    long bw, size;
    double mips;
    String vmm;

    private void btnCreateVmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateVmActionPerformed
        vmid = db.getMaxId("Vm");
        brokerId = Integer.parseInt(txtuseridvm.getText().trim());
        pesNumber = Integer.parseInt(txtPeCountVm.getText().trim());
        ram = Integer.parseInt(txtramvm.getText().trim());
        bw = Long.parseLong(txtbwvm.getText().trim());
        size = Long.parseLong(txtSizeVm.getText().trim());
        mips = Double.parseDouble(txtmipsvm.getText().trim());
        vmm = txtVmmVm.getText().trim();

        Vm vm = new Vm(vmid, brokerId, mips, pesNumber, ram, bw, size, vmm, new CloudletSchedulerTimeShared());
        db.createVM(vm);
        setVisible(Boolean.FALSE);
    }//GEN-LAST:event_btnCreateVmActionPerformed

    private void txtVmmVmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVmmVmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVmmVmActionPerformed

    private void txtramvmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtramvmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtramvmActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            CreateVM dialog = new CreateVM(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateVm;
    private javax.swing.JComboBox<String> cbVmSchulderVm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtPeCountVm;
    private javax.swing.JTextField txtSizeVm;
    private javax.swing.JTextField txtVmmVm;
    private javax.swing.JTextField txtbwvm;
    private javax.swing.JTextField txtmipsvm;
    private javax.swing.JTextField txtramvm;
    private javax.swing.JTextField txtuseridvm;
    // End of variables declaration//GEN-END:variables
}
