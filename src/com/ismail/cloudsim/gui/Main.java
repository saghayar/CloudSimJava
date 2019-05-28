package com.ismail.cloudsim.gui;

import com.ismail.cloudsim.gui.host.HostTableModel;
import com.ismail.cloudsim.gui.host.CreateHost;
import com.ismail.cloudsim.gui.host.DeleteConfirm;
import com.ismail.cloudsim.gui.host.EditHost;
import com.ismail.cloudsim.gui.vm.CreateVM;
import com.ismail.cloudsim.gui.vm.VMTableModel;
import java.awt.Color;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.cloudbus.cloudsim.Cloudlet;
import org.cloudbus.cloudsim.Datacenter;
import org.cloudbus.cloudsim.DatacenterBroker;
import org.cloudbus.cloudsim.DatacenterCharacteristics;
import org.cloudbus.cloudsim.Host;
import org.cloudbus.cloudsim.Log;
import org.cloudbus.cloudsim.Pe;
import org.cloudbus.cloudsim.Storage;
import org.cloudbus.cloudsim.UtilizationModel;
import org.cloudbus.cloudsim.UtilizationModelFull;
import org.cloudbus.cloudsim.Vm;
import org.cloudbus.cloudsim.VmAllocationPolicySimple;
import org.cloudbus.cloudsim.core.CloudSim;

/**
 *
 * @author Ismayil
 *
 *
 *
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     *
     */
    DB db = new DB();
    private static List<Cloudlet> cloudletList = new ArrayList<Cloudlet>();
    private static List<Vm> vmlist = new ArrayList<Vm>();
    Datacenter datacenter = null;
    double processingUnitCost, costPerMem, costPerStorage, bwCost, schedulingInterval, timeZone;
    String dataCenterName, arch, os, vmm;
    List<Host> hosts = new ArrayList();

    public Main() {
        initComponents();
        txtVmm.setText("Xen");
        txtDTNAme.setText("DataCenter1");
        txtTimeZone.setText("10.0");
        spProcessingost.setText("0.1");
        spMemoryCost.setText("0.05");
        spStorageCost.setText("0.001");
        jTextField1.setText("0.1");

        int num_user = 1; // number of cloud users
        Calendar calendar = Calendar.getInstance();
        boolean trace_flag = false; // mean trace events

        // Initialize the CloudSim library
        CloudSim.init(num_user, calendar, trace_flag);
//   DataCenter Charateristic TAB
//        tab.setEnabledAt(1, false);
//        tab.setEnabledAt(2, false);
//        tab.setEnabledAt(3, false);
//        tab.setEnabledAt(4, false);
        cbArch.addItem("x86");
        cbArch.addItem("x64");
        cbOS.addItem("Linux");
        cbOS.addItem("Unix");
        cbOS.addItem("Windows");

//        tab.setEnabledAt(1, false);
//        tab.setEnabledAt(2, false);
//        tab.setEnabledAt(3, false);
//        tab.setEnabledAt(4, false);
        ///HOST TAB
        refreshHosts();
        refreshVMs();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        tab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbArch = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbOS = new javax.swing.JComboBox();
        txtTimeZone = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtVmm = new javax.swing.JTextField();
        btnStep1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        spSchulderInterval = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        txtDTNAme = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblHostCount = new javax.swing.JLabel();
        lblPeCount = new javax.swing.JLabel();
        lblmpis = new javax.swing.JLabel();
        lblstorage = new javax.swing.JLabel();
        lblTotalRam = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHost = new javax.swing.JTable();
        btnRemove = new javax.swing.JButton();
        btnEditHost = new javax.swing.JButton();
        btnAddHost = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btnStep3 = new javax.swing.JButton();
        spProcessingost = new javax.swing.JTextField();
        spMemoryCost = new javax.swing.JTextField();
        spStorageCost = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVM = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        btnCreateVM = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnSimulate = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Settings", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel2.setText("Arcitecture");

        jLabel3.setText("Time zone");

        jLabel4.setText("OS");

        txtTimeZone.setText(" ");

        jLabel1.setText("VMM");

        txtVmm.setText(" ");

        btnStep1.setText("Next");
        btnStep1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStep1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Scheduling interval ");

        jLabel6.setText("Datacenter name");

        txtDTNAme.setText(" ");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnStep1))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbArch, 0, 157, Short.MAX_VALUE)
                                    .addComponent(cbOS, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(spSchulderInterval))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel6))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTimeZone)
                            .addComponent(txtVmm)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(txtDTNAme, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(61, 61, 61))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbArch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtTimeZone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtVmm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spSchulderInterval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(txtDTNAme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(btnStep1))
        );

        jLabel8.setText("Host count");

        jLabel9.setText("Processing unit count");

        jLabel10.setText("Processing capacity (MIPS)");

        jLabel11.setText("Storage capacity");

        jLabel12.setText("Total amount of RAM");

        lblHostCount.setText("0");

        lblPeCount.setText("0");

        lblmpis.setText("0");

        lblstorage.setText("0");

        lblTotalRam.setText("0");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(62, 62, 62)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotalRam)
                    .addComponent(lblstorage)
                    .addComponent(lblmpis)
                    .addComponent(lblHostCount)
                    .addComponent(lblPeCount))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblHostCount))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblPeCount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblmpis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lblstorage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lblTotalRam))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab.addTab("Datacenter Characteristic ", jPanel1);

        tblHost.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblHost);

        btnRemove.setText("Delete");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnEditHost.setText("Update");
        btnEditHost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditHostActionPerformed(evt);
            }
        });

        btnAddHost.setText("Add");
        btnAddHost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddHostActionPerformed(evt);
            }
        });

        jButton3.setText("Next");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(btnAddHost)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditHost)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRemove))
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton3)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemove)
                    .addComponent(btnEditHost)
                    .addComponent(btnAddHost))
                .addGap(0, 47, Short.MAX_VALUE))
        );

        tab.addTab("Hosts", jPanel3);

        jLabel18.setText("Processing cost (per second)");

        jLabel19.setText("Memory cost (per MB)");

        jLabel20.setText("Storage cost (per MB)");

        jLabel21.setText("Bandwidth cost (per MB)");

        jLabel22.setText("(Cost per MPIS :1.0416666666666668E-5)");

        btnStep3.setText("Next");
        btnStep3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStep3ActionPerformed(evt);
            }
        });

        spProcessingost.setText(" ");

        spMemoryCost.setText(" ");

        spStorageCost.setText(" ");

        jTextField1.setText(" ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnStep3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spProcessingost)
                            .addComponent(spMemoryCost)
                            .addComponent(spStorageCost)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22)
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(jLabel22))
                    .addComponent(spProcessingost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(spMemoryCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(spStorageCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(btnStep3)
                .addContainerGap(263, Short.MAX_VALUE))
        );

        tab.addTab("Costs", jPanel4);

        jButton1.setText("Remove");

        tblVM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblVM);

        jButton2.setText("Edit");

        btnCreateVM.setText("Add");
        btnCreateVM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateVMActionPerformed(evt);
            }
        });

        jButton4.setText("Next");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCreateVM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jButton4)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(btnCreateVM))
                .addContainerGap())
        );

        tab.addTab("Virtual machines", jPanel5);

        btnSimulate.setText("Simulate");
        btnSimulate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimulateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(btnSimulate, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(223, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(btnSimulate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(304, Short.MAX_VALUE))
        );

        tab.addTab("Simulate", jPanel6);

        jMenu1.setText("File");

        jMenuItem1.setText("jMenuItem1");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("About");

        jMenuItem2.setText("Purpose");
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tab)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimulateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimulateActionPerformed
        try {            
            int dt_id = db.getMaxId("datacenter"); 
            DatacenterCharacteristics characteristics
                    = new DatacenterCharacteristics(
                            arch,
                            os,
                            vmm,
                            hosts,
                            timeZone,
                            processingUnitCost,
                            costPerMem,
                            costPerStorage,
                            bwCost
                    );
            LinkedList<Storage> storageList = new LinkedList<Storage>();
            datacenter = new Datacenter(
                    "DataCenter1",
                    characteristics,
                    new VmAllocationPolicySimple(hosts),
                    storageList,
                    0);
            DatacenterBroker broker = createBroker();
            int brokerId = broker.getId();
            vmlist = db.getVMListByDataCenter(dt_id - 1);
            broker.submitVmList(vmlist);
            
            // Fifth step: Create one Cloudlet
            cloudletList = new ArrayList<Cloudlet>();
            // Cloudlet properties
            int id = 0;
            long length = 400000;
            long fileSize = 300;
            long outputSize = 300;
            UtilizationModel utilizationModel = new UtilizationModelFull();
            Cloudlet[] cloudlet = new Cloudlet[vmlist.size() + 1];
            for (Vm vm : vmlist) {
                id++;
                System.out.println("VM>>>>>>" + id);
                cloudlet[id] = new Cloudlet(id, length, vm.getNumberOfPes(), fileSize, outputSize, utilizationModel, utilizationModel, utilizationModel);
                cloudlet[id].setUserId(brokerId);
                cloudlet[id].setVmId(vm.getId());

                cloudletList.add(cloudlet[id]);
            }
            System.out.println("Cloudlet  LIST : " + cloudletList);
            // add the cloudlet to the list
            // submit cloudlet list to the broker
            broker.submitCloudletList(cloudletList);
            // Sixth step: Starts the simulation
            CloudSim.startSimulation();
            List<Cloudlet> newList = broker.getCloudletReceivedList();
            CloudSim.stopSimulation();
            //Final step: Print results when simulation is over
            printCloudletList(newList);
            // Print the debt of each user to each datacenter
            datacenter.printDebts();
            Log.printLine("CloudSimExample1 finished!");
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSimulateActionPerformed

    private void btnStep3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStep3ActionPerformed
        // TODO add your handling code here:
        processingUnitCost = Double.parseDouble(spProcessingost.getText().trim());
        costPerMem = Double.parseDouble(spMemoryCost.getText().trim());
        costPerStorage = Double.parseDouble(spStorageCost.getText().trim());
        bwCost = Double.parseDouble(jTextField1.getText().trim());

        System.out.println("Hosts   :  " + hosts.size());

        ///create dt in db
        db.createDataCenter(
                dataCenterName,
                arch,
                os,
                vmm,
                String.valueOf(timeZone),
                String.valueOf(schedulingInterval)
        );
        int dcId = db.getMaxId("Cost");
        db.createCost(
                String.valueOf(processingUnitCost),
                String.valueOf(costPerMem),
                String.valueOf(costPerStorage),
                String.valueOf(bwCost),
                dcId
        );
//        JOptionPane.showMessageDialog(this, "DataCenter Created \nDatacenter : " + dataCenterName);

        tab.setSelectedIndex(3);

    }//GEN-LAST:event_btnStep3ActionPerformed

    private void btnAddHostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddHostActionPerformed
        CreateHost ch = new CreateHost(this, true);
        ch.setVisible(true);
        refreshHosts();
        hosts.add(ch.h);
        for (Host h : hosts) {
            System.out.println("host's pee :" + h.getPeList().size());
            for (Pe p : h.getPeList()) {
                System.out.println(p.getMips());
            }
        }
    }//GEN-LAST:event_btnAddHostActionPerformed

    private void btnEditHostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditHostActionPerformed
        // TODO add your handling code here:
        EditHost du = new EditHost(this, true, Integer.parseInt(tblHost.getValueAt(tblHost.getSelectedRow(), 0).toString()));
        du.setVisible(true);
        refreshHosts();
    }//GEN-LAST:event_btnEditHostActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        DeleteConfirm confirm = new DeleteConfirm(this, true, Integer.parseInt(tblHost.getValueAt(tblHost.getSelectedRow(), 0).toString()));
        confirm.setVisible(true);
        refreshHosts();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnStep1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStep1ActionPerformed

        boolean isOk = true;
        if (txtVmm.getText().trim().length() == 0) {
            txtVmm.setForeground(Color.black);
            txtVmm.setBackground(Color.yellow);
            isOk = false;
        } else {
            txtVmm.setForeground(Color.black);
            txtVmm.setBackground(Color.white);
        }
        if (txtDTNAme.getText().trim().length() == 0) {
            txtDTNAme.setForeground(Color.black);
            txtDTNAme.setBackground(Color.yellow);
            isOk = false;
        } else {
            txtDTNAme.setForeground(Color.black);
            txtDTNAme.setBackground(Color.white);
        }
        if (txtTimeZone.getText().trim().length() == 0) {
            txtTimeZone.setForeground(Color.black);
            txtTimeZone.setBackground(Color.yellow);
            isOk = false;
        } else {
            txtTimeZone.setForeground(Color.black);
            txtTimeZone.setBackground(Color.white);
        }

        if (isOk) {
            arch = cbArch.getSelectedItem().toString();//fkjgdofjgkd
            os = cbOS.getSelectedItem().toString();//dfgjkl
            vmm = txtVmm.getText();
            timeZone = Double.parseDouble(txtTimeZone.getText().trim());
            schedulingInterval = Double.parseDouble(spSchulderInterval.getModel().getValue().toString().trim());
            dataCenterName = txtDTNAme.getText().trim();

            tab.setEnabledAt(1, true);
            tab.setSelectedIndex(1);
        } else {
            JOptionPane.showMessageDialog(this, "All fields are required");
        }
    }//GEN-LAST:event_btnStep1ActionPerformed

    private void btnCreateVMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateVMActionPerformed
        CreateVM vm = new CreateVM(this, true);
        vm.setVisible(true);
        refreshVMs();

    }//GEN-LAST:event_btnCreateVMActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        tab.setSelectedIndex(2);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        tab.setSelectedIndex(4);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddHost;
    private javax.swing.JButton btnCreateVM;
    private javax.swing.JButton btnEditHost;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSimulate;
    private javax.swing.JButton btnStep1;
    private javax.swing.JButton btnStep3;
    private javax.swing.JComboBox<String> cbArch;
    private javax.swing.JComboBox<String> cbOS;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblHostCount;
    private javax.swing.JLabel lblPeCount;
    private javax.swing.JLabel lblTotalRam;
    private javax.swing.JLabel lblmpis;
    private javax.swing.JLabel lblstorage;
    private javax.swing.JTextField spMemoryCost;
    private javax.swing.JTextField spProcessingost;
    private javax.swing.JSpinner spSchulderInterval;
    private javax.swing.JTextField spStorageCost;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JTable tblHost;
    private javax.swing.JTable tblVM;
    private javax.swing.JTextField txtDTNAme;
    private javax.swing.JTextField txtTimeZone;
    private javax.swing.JTextField txtVmm;
    // End of variables declaration//GEN-END:variables

    private static DatacenterBroker createBroker() {
        DatacenterBroker broker = null;
        try {
            broker = new DatacenterBroker("Broker");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return broker;
    }

    private static void printCloudletList(List<Cloudlet> list) {
        int size = list.size();
        Cloudlet cloudlet;

        String indent = "    ";
        Log.printLine();
        Log.printLine("========== OUTPUT ==========");
        Log.printLine("Cloudlet ID" + indent + "STATUS" + indent
                + "Data center ID" + indent + "VM ID" + indent + "Time" + indent + "Start Time" + indent + "Finish Time");

        DecimalFormat dft = new DecimalFormat("###.##");
        for (int i = 0; i < size; i++) {
            cloudlet = list.get(i);
            Log.print(indent + cloudlet.getCloudletId() + indent + indent);

            if (cloudlet.getCloudletStatus() == Cloudlet.SUCCESS) {
                Log.print("SUCCESS");
                Log.printLine(indent + indent + cloudlet.getResourceId() + indent + indent + indent + cloudlet.getVmId()
                        + indent + indent + dft.format(cloudlet.getActualCPUTime()) + indent + indent + dft.format(cloudlet.getExecStartTime())
                        + indent + indent + dft.format(cloudlet.getFinishTime()));
            }
        }
    }

    private void refreshHosts() {
        List<Host> hosts = db.getHostList();
        int hostSize = hosts.size();
        HostTableModel hostTableModel = new HostTableModel(hosts);
        tblHost.setModel(hostTableModel);
        tblHost.setAutoCreateRowSorter(true);
        tblHost.setShowGrid(true);
        tblHost.setGridColor(Color.green);

        int totalRam = 0;
        int totalStorage = 0;
        int peCount = 0;
        int mpisCount = 0;
        for (Host h : hosts) {
            totalRam += h.getRamProvisioner().getRam();
            totalStorage += h.getStorage();
            List<Pe> pees = db.getPeList(h.getId());
            peCount += pees.size();
            mpisCount = pees.stream().map((pee) -> pee.getMips()).reduce(mpisCount, Integer::sum);
        }

        lblHostCount.setText("" + hostSize);
        lblTotalRam.setText(totalRam + "");
        lblPeCount.setText(peCount + "");
        lblstorage.setText(totalStorage + "");
        lblmpis.setText(mpisCount + "");
    }

    private void refreshVMs() {
        List<Vm> hosts = db.getVMList();
        VMTableModel hostTableModel = new VMTableModel(hosts);
        tblVM.setModel(hostTableModel);
        tblVM.setAutoCreateRowSorter(true);
        tblVM.setShowGrid(true);
        tblVM.setGridColor(Color.green);
    }
}
