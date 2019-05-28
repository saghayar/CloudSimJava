/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ismail.cloudsim.gui.vm;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import org.cloudbus.cloudsim.Host;
import org.cloudbus.cloudsim.Vm;

/**
 *
 * @author ismayil
 */
public class VMTableModel extends AbstractTableModel {

    private List<Vm> hostList = null;

    private final String head[] = {"ID", "MIPS", "SIZE", "RAM", "BANDWIDTH", "NUMBEROFPEES", "VMM", "USERID"};

    public VMTableModel(List<Vm> list) {
        this.hostList = list;

    }

    @Override
    public String getColumnName(int column) {
        return head[column];
    }

    @Override
    public int getColumnCount() {
        return head.length;

    }

    @Override
    public int getRowCount() {
        return hostList.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            return hostList.get(rowIndex).getId();
        } else if (columnIndex == 1) {
            return hostList.get(rowIndex).getMips();
        } else if (columnIndex == 2) {
            return hostList.get(rowIndex).getSize();
        } else if (columnIndex == 3) {
            return hostList.get(rowIndex).getRam();
        } else if (columnIndex == 4) {
            return hostList.get(rowIndex).getBw();
        } else if (columnIndex == 5) {
            return hostList.get(rowIndex).getNumberOfPes();
        } else if (columnIndex == 6) {
            return hostList.get(rowIndex).getVmm();
        } else if (columnIndex == 7) {
            return hostList.get(rowIndex).getUserId();
        } else {
            return "Time Shared";
        }

    }

}
