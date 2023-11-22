/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_ReshaYuana;

/**
 *
 * @author HP
 */
public class Tiket {
    private Film film;
    private double harga;

    public Tiket(Film film, double harga) {
        this.film = film;
        this.harga = harga;
    }

    public Film getFilm() {
        return film;
    }

    public double getHarga() {
        return harga;
    }

    public double hitungTotalHarga(int jumlah) {
        return harga * jumlah;
    }
}
