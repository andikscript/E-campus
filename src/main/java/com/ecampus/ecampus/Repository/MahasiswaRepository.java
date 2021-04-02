package com.ecampus.ecampus.Repository;

import com.ecampus.ecampus.Model.Mahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MahasiswaRepository extends JpaRepository<Mahasiswa, String> {
}
