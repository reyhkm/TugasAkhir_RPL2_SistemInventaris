package com.mycompany.proyekinventaris.view;

import com.mycompany.proyekinventaris.model.Barang;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TabelBarangModel extends AbstractTableModel {
    private List<Barang> listBarang;
    private final String[] columnNames = {"ID", "Nama Barang", "Stok", "Harga"};

    public TabelBarangModel(List<Barang> listBarang) {
        this.listBarang = listBarang;
    }

    @Override
    public int getRowCount() { return listBarang.size(); }

    @Override
    public int getColumnCount() { return columnNames.length; }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Barang barang = listBarang.get(rowIndex);
        switch (columnIndex) {
            case 0: return barang.getId();
            case 1: return barang.getNamaBarang();
            case 2: return barang.getStok();
            case 3: return barang.getHarga();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    
    public void setData(List<Barang> listBarang) {
        this.listBarang = listBarang;
        fireTableDataChanged();
    }
}
