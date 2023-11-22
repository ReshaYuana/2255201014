/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_ReshaYuana;

/**
 *
 * @author HP
 */
public class TiketDiskon extends Tiket {
     private double diskon;

    public TiketDiskon(Film film, double harga, double diskon) {
        super(film, harga - (harga * diskon / 100));
        this.diskon = diskon;
    }

    @Override
    public double hitungTotalHarga(int jumlah) {
        return getHarga() * jumlah;
    }
}
