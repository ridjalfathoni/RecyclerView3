package id.sch.smktelkom_mlg.learn.recyclerview3.model;

/**
 * Created by Ridjal Fathoni on 21/11/2016.
 */

import java.io.Serializable;

public class Hotel implements Serializable {
    public String judul;
    public String deskripsi;
    public String detail;
    public String lokasi;
    public String foto;

    public Hotel(String judul, String deskripsi, String detail, String lokasi, String foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.detail = detail;
        this.lokasi = lokasi;
        this.foto = foto;
    }
}