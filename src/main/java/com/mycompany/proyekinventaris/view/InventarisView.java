package com.mycompany.proyekinventaris.view;

import com.mycompany.proyekinventaris.model.Barang;
import com.mycompany.proyekinventaris.service.BarangService;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class InventarisView extends javax.swing.JFrame {

    private final BarangService barangService;
    private Long selectedId = null;

    public InventarisView(BarangService service) {
        this.barangService = service;
        initComponents();
        setupTableListener();
        loadTableData();
    }

    private void loadTableData() {
        List<Barang> listBarang = barangService.getAllBarang();
        TabelBarangModel tableModel = new TabelBarangModel(listBarang);
        tabelBarang.setModel(tableModel);
    }

    private void clearFields() {
        fieldNama.setText("");
        fieldStok.setText("");
        fieldHarga.setText("");
        selectedId = null;
        tabelBarang.clearSelection();
    }
    
    private void setupTableListener() {
        tabelBarang.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tabelBarang.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting() && tabelBarang.getSelectedRow() != -1) {
                int selectedRow = tabelBarang.getSelectedRow();
                selectedId = (Long) tabelBarang.getValueAt(selectedRow, 0);
                fieldNama.setText(tabelBarang.getValueAt(selectedRow, 1).toString());
                fieldStok.setText(tabelBarang.getValueAt(selectedRow, 2).toString());
                fieldHarga.setText(tabelBarang.getValueAt(selectedRow, 3).toString());
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fieldNama = new javax.swing.JTextField();
        fieldStok = new javax.swing.JTextField();
        fieldHarga = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelBarang = new javax.swing.JTable();
        btnClear = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistem Inventaris Toko");

        jLabel1.setText("Nama Barang");
        jLabel2.setText("Stok");
        jLabel3.setText("Harga");

        btnSimpan.setText("Simpan Baru");
        btnSimpan.addActionListener(evt -> btnSimpanActionPerformed(evt));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(evt -> btnUpdateActionPerformed(evt));

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(evt -> btnHapusActionPerformed(evt));

        tabelBarang.setModel(new javax.swing.table.DefaultTableModel(new Object [][] {}, new String [] {}));
        jScrollPane1.setViewportView(tabelBarang);

        btnClear.setText("Clear Form");
        btnClear.addActionListener(evt -> btnClearActionPerformed(evt));
        
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel4.setText("Manajemen Data Barang");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fieldNama)
                                .addComponent(fieldStok)
                                .addComponent(fieldHarga)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnSimpan)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fieldNama, javax.swing.GroupLayout.PREFERRED_size, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fieldStok, javax.swing.GroupLayout.PREFERRED_size, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fieldHarga, javax.swing.GroupLayout.PREFERRED_size, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnUpdate)
                    .addComponent(btnHapus)
                    .addComponent(btnClear))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_size, 200, javax.swing.GroupLayout.PREFERRED_size)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {                                          
        try {
            String nama = fieldNama.getText();
            int stok = Integer.parseInt(fieldStok.getText());
            double harga = Double.parseDouble(fieldHarga.getText());
            if (nama.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nama barang tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Barang barang = new Barang(nama, stok, harga);
            barangService.addBarang(barang);
            JOptionPane.showMessageDialog(this, "Barang baru berhasil disimpan!");
            loadTableData();
            clearFields();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Stok dan Harga harus berupa angka!", "Error Input", JOptionPane.ERROR_MESSAGE);
        }
    }                                         

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (selectedId == null) {
            JOptionPane.showMessageDialog(this, "Pilih data dari tabel yang ingin di-update!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            String nama = fieldNama.getText();
            int stok = Integer.parseInt(fieldStok.getText());
            double harga = Double.parseDouble(fieldHarga.getText());
            Barang barang = new Barang(nama, stok, harga);
            barang.setId(selectedId); // Set ID untuk operasi update
            barangService.updateBarang(barang);
            JOptionPane.showMessageDialog(this, "Data barang berhasil di-update!");
            loadTableData();
            clearFields();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Stok dan Harga harus berupa angka!", "Error Input", JOptionPane.ERROR_MESSAGE);
        }
    }                                         

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if (selectedId == null) {
            JOptionPane.showMessageDialog(this, "Pilih data dari tabel yang ingin dihapus!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            barangService.deleteBarang(selectedId);
            loadTableData();
            clearFields();
        }
    }                                        

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {                                         
        clearFields();
    }                                        

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField fieldHarga;
    private javax.swing.JTextField fieldNama;
    private javax.swing.JTextField fieldStok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelBarang;
    // End of variables declaration                   
}
