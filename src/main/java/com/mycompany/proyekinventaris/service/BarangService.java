package com.mycompany.proyekinventaris.service;

import com.mycompany.proyekinventaris.model.Barang;
import com.mycompany.proyekinventaris.repository.BarangRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BarangService {
    @Autowired
    private BarangRepository repository;

    public List<Barang> getAllBarang() {
        return repository.findAll();
    }

    public Barang addBarang(Barang barang) {
        return repository.save(barang);
    }

    public Barang updateBarang(Barang barang) {
        return repository.save(barang);
    }

    public void deleteBarang(Long id) {
        repository.deleteById(id);
    }
}
