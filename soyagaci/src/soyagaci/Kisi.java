/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soyagaci;

import java.util.Date;

/**
 *
 * @author Acer
 */
public class Kisi {
    protected int id;
    protected String ad;
    protected String soyad;
    protected Date dogumTarihi;
    protected String anne_adi;
    protected String baba_adi;
    protected String kan_grubu;
    protected String meslek;
    protected String kizlik_soyadi;
    protected String cinsiyet;
    

    public Kisi() {
    }

    public Kisi(int id, String ad, String soyad, Date dogumTarihi, String anne_adi, String baba_adi, String kan_grubu, String meslek, String kizlik_soyadi, String cinsiyet) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.dogumTarihi = dogumTarihi;
        this.anne_adi = anne_adi;
        this.baba_adi = baba_adi;
        this.kan_grubu = kan_grubu;
        this.meslek = meslek;
        this.kizlik_soyadi = kizlik_soyadi;
        this.cinsiyet = cinsiyet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public Date getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(Date dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public String getAnne_adi() {
        return anne_adi;
    }

    public void setAnne_adi(String anne_adi) {
        this.anne_adi = anne_adi;
    }

    public String getBaba_adi() {
        return baba_adi;
    }

    public void setBaba_adi(String baba_adi) {
        this.baba_adi = baba_adi;
    }

    public String getKan_grubu() {
        return kan_grubu;
    }

    public void setKan_grubu(String kan_grubu) {
        this.kan_grubu = kan_grubu;
    }

    public String getMeslek() {
        return meslek;
    }

    public void setMeslek(String meslek) {
        this.meslek = meslek;
    }

    public String getKizlik_soyadi() {
        return kizlik_soyadi;
    }

    public void setKizlik_soyadi(String kizlik_soyadi) {
        this.kizlik_soyadi = kizlik_soyadi;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }
    
    
}
