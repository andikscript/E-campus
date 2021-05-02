package com.ecampus.ecampus.Implement;

import com.ecampus.ecampus.Model.Mahasiswa;
import com.ecampus.ecampus.Repository.MahasiswaRepository;
import com.ecampus.ecampus.Service.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.List;
import java.util.Optional;

@Service
public class MahasiswaImplement implements MahasiswaService {

    @Autowired
    private MahasiswaRepository mahasiswaRepository;

    @Override
    public Optional<Mahasiswa> getMahasiswa(String nim) {
        return mahasiswaRepository.findById(nim);
    }

    @Override
    public List<Mahasiswa> getAllMahasiswa() {
        return mahasiswaRepository.findAll();
    }

    @Override
    public Mahasiswa addMahasiswa(Mahasiswa mahasiswa) {
        return mahasiswaRepository.save(mahasiswa);
    }

    @Override
    public Mahasiswa updateMahasiswa(String nim, Mahasiswa mahasiswa) {
        Optional<Mahasiswa> m = mahasiswaRepository.findById(nim);
        Mahasiswa t = m.get();
        t.setNama(mahasiswa.getNama());
        t.setProdi(mahasiswa.getProdi());
        return mahasiswaRepository.save(t);
    }

    @Override
    public Optional<Mahasiswa> deleteMahasiswa(String nim) {
        Optional<Mahasiswa> m = mahasiswaRepository.findById(nim);
        mahasiswaRepository.deleteById(nim);
        return m;
    }
}

