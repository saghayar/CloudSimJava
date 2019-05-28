/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ismail.cloudsim.gui;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.cloudbus.cloudsim.CloudletSchedulerTimeShared;
import org.cloudbus.cloudsim.Host;
import org.cloudbus.cloudsim.Pe;
import org.cloudbus.cloudsim.Vm;
import org.cloudbus.cloudsim.VmSchedulerTimeShared;
import org.cloudbus.cloudsim.provisioners.BwProvisionerSimple;
import org.cloudbus.cloudsim.provisioners.PeProvisionerSimple;
import org.cloudbus.cloudsim.provisioners.RamProvisionerSimple;

/**
 *
 * @author SAMIR
 */
public class DB {

    private Connection connection = null;
    private Statement statement = null;

    private void connect() {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloudsimdb", "root", "1234");
            statement = connection.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "DB");
            e.printStackTrace();
        }
    }

    private void close() {
        try {
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Host> getHostList() {
        try {
            connect();
            ResultSet rs = statement.executeQuery("Select * From Host");
            List<Host> data = new ArrayList<>();
            while (rs.next()) {
                int hostId = rs.getInt("id");
                data.add(
                        new Host(hostId,
                                new RamProvisionerSimple(Integer.parseInt(rs.getString("ram"))),
                                new BwProvisionerSimple(Long.parseLong(rs.getString("bw"))),
                                Long.parseLong(rs.getString("storage")),
                                getPeList(hostId),
                                new VmSchedulerTimeShared(getPeList(hostId))));
            }
            return data;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            close();
        }
    }
    public List<Host> getHostListById(int id) {
        try {
            connect();
            ResultSet rs = statement.executeQuery("Select * From Host where dc_id="+id);
            List<Host> data = new ArrayList<>();
            while (rs.next()) {
                int hostId = rs.getInt("id");
                data.add(
                        new Host(hostId,
                                new RamProvisionerSimple(Integer.parseInt(rs.getString("ram"))),
                                new BwProvisionerSimple(Long.parseLong(rs.getString("bw"))),
                                Long.parseLong(rs.getString("storage")),
                                getPeList(hostId),
                                new VmSchedulerTimeShared(getPeList(hostId))));
            }
            return data;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            close();
        }
    }

    public List<Vm> getVMList() {
        try {
            connect();
            ResultSet rs = statement.executeQuery("Select * From VM");
            List<Vm> data = new ArrayList<>();
            while (rs.next()) {
                int vmid = rs.getInt("id");
                int brokerId = rs.getInt("userid");
                double mips = rs.getInt("mips");
                int pesNumber = rs.getInt("pecount");
                int ram = rs.getInt("ram");
                long bw = Long.parseLong(rs.getString("bw"));
                long size = Long.parseLong(rs.getString("size"));
                String vmm = rs.getString("vmm");
                Vm vm = new Vm(vmid, brokerId, mips, pesNumber, ram, bw, size, vmm,
                        new CloudletSchedulerTimeShared());
                data.add(vm);
            }
            return data;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            close();
        }
    }

    public List<Vm> getVMListByDataCenter(int id) {
        try {
            connect();
            ResultSet rs = statement.executeQuery("Select * From VM WHERE dc_id=" + id);
            List<Vm> data = new ArrayList<>();
            while (rs.next()) {
                int vmid = rs.getInt("id");
                int brokerId = rs.getInt("userid");
                double mips = rs.getInt("mips");
                int pesNumber = rs.getInt("pecount");
                int ram = rs.getInt("ram");
                long bw = Long.parseLong(rs.getString("bw"));
                long size = Long.parseLong(rs.getString("size"));
                String vmm = rs.getString("vmm");
                Vm vm = new Vm(vmid, brokerId, mips, pesNumber, ram, bw, size, vmm,
                        new CloudletSchedulerTimeShared());
                data.add(vm);
            }
            return data;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            close();
        }
    }

    public List<Pe> getPeList(int hostid) {
        try {
            connect();
            ResultSet rs = statement.executeQuery("Select * From Pe where hostid =" + hostid);
            List<Pe> data = new ArrayList<>();
            while (rs.next()) {
                data.add(new Pe(0, new PeProvisionerSimple(rs.getInt("mips"))));
            }
            return data;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            close();
        }
    }
////write with Prepared Statement prevent Sql injection attack 

    public void createHost(Host h) {
        try {
            connect();
            PreparedStatement pr = connection.prepareStatement("INSERT INTO HOST VALUES(?,?,?,?,?,?)");
            System.out.println("GET id " + h.getId());
            pr.setInt(1, h.getId());
            pr.setString(2, String.valueOf(h.getStorage()));
            pr.setString(3, String.valueOf(h.getRam()));
            pr.setString(4, String.valueOf(h.getBw()));
            pr.setString(5, "Time Shared");
            pr.setInt(6, 1);
            pr.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }
    }

    public void createVM(Vm v) {
        try {
            connect();
            PreparedStatement pr = connection.prepareStatement("INSERT INTO Vm VALUES(?,?,?,?,?,?,?,?,?)");
            pr.setInt(1, v.getId());
            pr.setString(2, String.valueOf(v.getMips()));
            pr.setString(3, String.valueOf(v.getSize()));
            pr.setString(4, String.valueOf(v.getRam()));
            pr.setString(5, String.valueOf(v.getBw()));
            pr.setString(6, String.valueOf(v.getNumberOfPes()));
            pr.setString(7, String.valueOf(v.getVmm()));
            pr.setString(8, String.valueOf(v.getUserId()));
            pr.setInt(9, getMaxId("datacenter") - 1);
            pr.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }
    }

    public void createCost(String pCost, String memCost, String storageCost, String bandWidthCost, int dataCentetId) {
        try {
            connect();
            PreparedStatement pr = connection.prepareStatement("INSERT INTO COST VALUES(?,?,?,?,?,?)");
            pr.setInt(1, getMaxId("Cost"));
            pr.setString(2, pCost);
            pr.setString(3, memCost);
            pr.setString(4, storageCost);
            pr.setString(5, bandWidthCost);
            pr.setInt(6, dataCentetId);
            pr.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }
    }

    public void createDataCenter(String dtName, String arch, String os, String vmm, String timezone, String sc_interval) {
        try {
            connect();
            PreparedStatement pr = connection.prepareStatement("INSERT INTO datacenter VALUES(?,?,?,?,?,?,?)");
            pr.setInt(1, getMaxId("Datacenter"));
            pr.setString(2, dtName);
            pr.setString(3, arch);
            pr.setString(4, os);
            pr.setString(5, vmm);
            pr.setString(6, timezone);
            pr.setString(7, sc_interval);
            pr.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }
    }

    public void editHost(Host h) {
        try {
            connect();
            PreparedStatement pr = connection.
                    prepareStatement("UPDATE HOST SET ram=?,storage=?,bw=?"
                            + ",vm_schulder=? where id=" + h.getId());

            pr.setString(1, String.valueOf(h.getStorage()));
            pr.setString(2, String.valueOf(h.getRam()));
            pr.setString(3, String.valueOf(h.getBw()));
            pr.setString(4, "Time Shared");
            pr.execute();
            System.out.println("Updated  " + h.getId());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }
    }

    public int getMaxId(String tableName) {
        try {
            connect();
            int max = 1;
            ResultSet rs = statement.executeQuery("Select max(id) From " + tableName);
            rs.next();
            max = rs.getInt(1);
//            System.out.println("max id = " + max);

            rs.close();
            close();
            return max + 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            close();
        }
    }

    public Host findHostById(int hostId) {
        try {
            connect();
            ResultSet rs = statement.executeQuery("Select * From Host where id =" + hostId);
            Host h = null;
            while (rs.next()) {
                h = new Host(hostId,
                        new RamProvisionerSimple(Integer.parseInt(rs.getString("ram"))),
                        new BwProvisionerSimple(Long.parseLong(rs.getString("bw"))),
                        Long.parseLong(rs.getString("storage")),
                        getPeList(hostId),
                        new VmSchedulerTimeShared(getPeList(hostId)));

            }
            return h;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            close();
        }
    }

    public void createCloudlet(long length, int numberOfPees, long fileSize, long outputSize) {
        try {
//            connect();
//            PreparedStatement pr = connection.prepareStatement("INSERT INTO COST VALUES(?,?,?,?,?)");
//            pr.setInt(1, getMaxId("cloudlet"));
//            pr.setInt(2, Integer.parseInt(length));
//            pr.setInt(3, numberOfPees);
//            pr.setInt(4, );
//            pr.setInt(5, vmm);
//            pr.setInt(6, timezone);
//            pr.setInt(7, sc_interval);
//            pr.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }
    }

    public void createPe(Pe pe, int hostid) {
        try {
            connect();
            PreparedStatement pr = connection.prepareStatement("INSERT INTO Pe VALUES(?,?,?)");

            pr.setInt(1, pe.getId());
            pr.setInt(2, pe.getMips());
            pr.setInt(3, hostid);
            pr.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }

    }

    public void deleteHost(int hostId) {
        try {
            connect();
            statement.executeUpdate("Delete from host where id=" + hostId);
            statement.executeUpdate("Delete from pe where hostid=" + hostId);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }

    }

    public static void main(String[] args) {

        DB db = new DB();
        for (Vm vm : db.getVMListByDataCenter(db.getMaxId("datacenter"))) {
            System.out.println("________________________" + vm.getBw());

        }

    }

}
