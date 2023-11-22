/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPolimorfismeDinamis;

/**
 *
 * @author HP
 */
public class RunAturan {
    public static void main(String[] args) {
        
        AturanPeminjaman aturan = new AturanPeminjaman();
        Buku buku = new Buku(2,10000);
        Majalah majalah = new Majalah (3,5000);
        CDaudio cdA = new CDaudio (5,7000);
        
        aturan.Aturan();
        buku.Aturan();
        majalah.Aturan();
        cdA.Aturan(); 
    }
}
