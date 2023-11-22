/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_ReshaYuana;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Bioskop implements Pemesanan {
    private List<Tiket> tiketList;
    private double total;

    public Bioskop() {
        tiketList = new ArrayList<>();
    }

    public void tambahTiket(Tiket tiket, int jumlah) {
        tiketList.add(tiket);
        total += tiket.hitungTotalHarga(jumlah);
    }

    @Override
    public void prosesPemesanan() {
        Scanner scanner = new Scanner(System.in);
        for (Tiket tiket : tiketList) {
            System.out.println(tiket.getFilm().getJudul() + " - Rp " + tiket.getHarga());
        }
        System.out.println("Total: Rp " + total);
        System.out.print("Bayar: ");
        double bayar = scanner.nextDouble();
        System.out.println("Kembalian: Rp " + (bayar - total));
        scanner.close();
    }
}
