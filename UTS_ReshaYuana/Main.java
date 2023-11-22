 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_ReshaYuana;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Bioskop bioskop = new Bioskop();

        bioskop.tambahTiket(new Tiket(new Film("Avengers: Endgame", "Action"), 50000), 2);
        bioskop.tambahTiket(new TiketDiskon(new Film("Frozen II", "Animation"), 45000, 10), 3); // 10% diskon

        bioskop.prosesPemesanan();
    } 
    }

