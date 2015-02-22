package com.yodiyanwar.model;

/**
 *
 * @author Yodi Yanwar
 */
public class Mahasiswa {
    private Integer id;
    private Long npm;
    private String nama;
    private String jurusan;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getNpm() {
        return npm;
    }

    public void setNpm(Long npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    
    
}
