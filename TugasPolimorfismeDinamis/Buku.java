/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPolimorfismeDinamis;

/**
 *
 * @author HP
 */
public class Buku extends AturanPeminjaman{
    int hari;
    int denda;
    
    public Buku (int hari, int denda){
        this.hari = hari;
        this.denda = denda;
    }
     
    @Override
    public void Aturan(){
        System.out.println("\nDenda keterlambatan pengembalian buku");
        int dendaBuku = denda * hari;
        System.out.println("Membayar denda sebesar : $" + dendaBuku);
    }
}
