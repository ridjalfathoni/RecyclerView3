package id.sch.smktelkom_mlg.learn.recyclerview3.model;

/**
 * Created by Ridjal Fathoni on 21/11/2016.
 */

import android.graphics.drawable.Drawable;

public class Hotel {
    public String judul;
    public String deskripsi;
    public Drawable foto;

    public Hotel(String judul, String deskripsi, Drawable foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.foto = foto;
    }
}