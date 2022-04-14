/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.purnamahardisaputra.pertemuan3.unguided;

/**
 *
 * @author purna
 */

//PURNAMA HARDI SAPUTRA
//20102123
//S1IF-08 M
public class Pegawai {
    
    private int nip;
    private String nama, alamat;
    private int jumlahLembur;
    private double gajiPokok, totalGaji, gaji;
    float lemburan;
    
    public Pegawai(){
        
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getJumlahLembur() {
        return jumlahLembur;
    }

    public void setJumlahLembur(int jumlahLembur) {
        this.jumlahLembur = jumlahLembur;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public double getTotalGaji() {
        return totalGaji;
    }

    public void setTotalGaji(double totalGaji) {
        this.totalGaji = totalGaji;
    }
    
    public void setTotal(int jumlahlembur, double gajiPokok){
        totalGaji = gajiPokok + (gajiPokok * jumlahLembur * 0.01);
    }
    
    public void tampil(){
        System.out.println("NIP Pegawai : " + getNip());
        System.out.println("Nama Pegawai : " + getNama());
        System.out.println("Alamat Pegawai : " + getAlamat());
        System.out.println("Jumlah Hari Lembur : " + getJumlahLembur());
        System.out.println("Gaji Pokok : " + getGajiPokok());
        System.out.println("Total Gaji: " + getTotalGaji());
    }
    
    public static void main(String[] args) {
        Pegawai pegawai = new Pegawai();
        pegawai.setNip(20102123);
        pegawai.setNama("Purnama Hardi Saputra");
        pegawai.setAlamat("Jln. Bank, Papua Barat");
        pegawai.setJumlahLembur(10);
        pegawai.setGajiPokok(1000000);
        pegawai.setTotal(10, 1000000);
        pegawai.tampil();
    }
    
}