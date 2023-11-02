/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasEnkapsulasi;

/**
 *
 * @author HP
 */
public class RunPerpustakaan {
    public static void main(String[] args) {
       Perpustakaan perpus = new Perpustakaan();
       
       perpus.peminjaman();
       perpus.setNoId("2255201014");
       perpus.setNamaBuku("Bumi Manusia");
       perpus.setPenulis("Pramoedya Ananta Toer");
       
       perpus.jenisbuku("Novel");
       System.out.println("Peminjam : " + perpus.tampilan());
    }
    
}
