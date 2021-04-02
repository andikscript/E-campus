package com.ecampus.ecampus.Model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Prodi {
    private String idProdi;
    private String namaProdi;
    private String jurusan;

    @Id
    @Column(name = "id_prodi")
    public String getIdProdi() {
        return idProdi;
    }

    public void setIdProdi(String idProdi) {
        this.idProdi = idProdi;
    }

    @Basic
    @Column(name = "nama_prodi")
    public String getNamaProdi() {
        return namaProdi;
    }

    public void setNamaProdi(String namaProdi) {
        this.namaProdi = namaProdi;
    }

    @Basic
    @Column(name = "jurusan")
    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prodi prodi = (Prodi) o;
        return Objects.equals(idProdi, prodi.idProdi) && Objects.equals(namaProdi, prodi.namaProdi) && Objects.equals(jurusan, prodi.jurusan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProdi, namaProdi, jurusan);
    }
}
