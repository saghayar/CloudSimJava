/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ismail.cloudsim.gui.host;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import org.cloudbus.cloudsim.Host;

/**
 *
 * @author ismayil
 */
public class HostTableModel extends AbstractTableModel {

    private List<Host> hostList = null;

    private final String head[] = {"ID", "STORAGE", "RAM", "BW", "VM_SCHEDULING"};

    public HostTableModel(List<Host> list) {
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
            return hostList.get(rowIndex).getStorage();
        } else if (columnIndex == 2) {
            return hostList.get(rowIndex).getRam();
        } else if (columnIndex == 3) {
            return hostList.get(rowIndex).getBw();
        } else {
            return "Time Shared";
        }

    }

}
