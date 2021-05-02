package com.ecampus.ecampus.Service;

import com.ecampus.ecampus.Exception.ResourceNotFoundException;
import com.ecampus.ecampus.Model.Mahasiswa;

import java.util.List;
import java.util.Optional;

public interface MahasiswaService {

    Optional<Mahasiswa> getMahasiswa(String nim) throws ResourceNotFoundException;

    List<Mahasiswa> getAllMahasiswa();

    Mahasiswa addMahasiswa(Mahasiswa mahasiswa);

    Mahasiswa updateMahasiswa(String nim, Mahasiswa mahasiswa);

    Optional<Mahasiswa> deleteMahasiswa(String nim);
}
