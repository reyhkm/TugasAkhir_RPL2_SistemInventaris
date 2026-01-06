package com.mycompany.proyekinventaris.repository;

import com.mycompany.proyekinventaris.model.Barang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarangRepository extends JpaRepository<Barang, Long> {
    // Spring Data JPA akan otomatis menyediakan method CRUD
}
