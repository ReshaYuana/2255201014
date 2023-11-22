/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPolimorfismeDinamis;

/**
 *
 * @author HP
 */
public class CDaudio extends AturanPeminjaman{
    int hari;
    int denda;
    
    public CDaudio(int hari, int denda){
        this.hari = hari;
        this.denda = denda;
    }
    
    @Override
    public void Aturan(){
        System.out.println("\nDenda keterlambatan pengembalian CDaudio");
        int dendaCDaudio = denda * hari;
        System.out.println("Membayar denda sebesar : $" + dendaCDaudio);
    }
    
}
