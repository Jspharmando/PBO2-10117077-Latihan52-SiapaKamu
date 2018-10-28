package com.company;

/**
 * @author
 * NAMA     : Joseph Armando Carvallo
 * KELAS    : PBO2
 * NIM      : 10117077
 * Deskripsi Program : Menampilkan diri Anda menggunakan sifat inheritance dan polymorphism
 **/

public class Manusia {
    protected String nama;
    protected int umur;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void siapaKamu() {
        System.out.println("Saya manusia");
    }
}