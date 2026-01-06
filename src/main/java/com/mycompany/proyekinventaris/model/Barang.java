package com.mycompany.proyekinventaris.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "barang")
public class Barang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String namaBarang;
    private int stok;
    private double harga;

    public Barang() {}

    public Barang(String namaBarang, int stok, double harga) {
        this.namaBarang = namaBarang;
        this.stok = stok;
        this.harga = harga;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNamaBarang() { return namaBarang; }
    public void setNamaBarang(String namaBarang) { this.namaBarang = namaBarang; }
    public int getStok() { return stok; }
    public void setStok(int stok) { this.stok = stok; }
    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }
}
