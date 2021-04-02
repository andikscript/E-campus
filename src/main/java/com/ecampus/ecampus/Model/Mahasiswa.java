package com.ecampus.ecampus.Model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    private Timestamp created;

    @Id
    @Column(name = "nim")
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    @Basic
    @Column(name = "nama")
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Basic
    @Column(name = "prodi")
    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    @Basic
    @Column(name = "created")
    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mahasiswa mahasiswa = (Mahasiswa) o;
        return Objects.equals(nim, mahasiswa.nim) && Objects.equals(nama, mahasiswa.nama) && Objects.equals(prodi, mahasiswa.prodi) && Objects.equals(created, mahasiswa.created);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nim, nama, prodi, created);
    }
}
