package com.ecampus.ecampus.Controller;

import com.ecampus.ecampus.Exception.ResourceNotFoundException;
import com.ecampus.ecampus.Model.Mahasiswa;
import com.ecampus.ecampus.Service.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MahasiswaApi {

    @Autowired
    private MahasiswaService mahasiswaService;

    @GetMapping("/mahasiswa/{nim}")
    public Optional<Mahasiswa> getMahasiswa(@PathVariable(value = "nim") String nim) throws ResourceNotFoundException {
        return mahasiswaService.getMahasiswa(nim);
    }

    @GetMapping("/mahasiswa")
    public List<Mahasiswa> getAllMahasiswa() {
        return mahasiswaService.getAllMahasiswa();
    }

    @PostMapping("/mahasiswa")
    public Mahasiswa addMahasiswa(@RequestBody Mahasiswa mahasiswa) {
        return mahasiswaService.addMahasiswa(mahasiswa);
    }
}
