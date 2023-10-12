/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author HP
 */
public class TampilanNilai {

   
    public static void main(String[] args) {
      
        MasterNilai N = new MasterNilai();
        
         //Prosedur
        N.penilaian(90, "Resha", "");
        
        //Fungsi
        System.out.println(N.HasilNilai(80, "Resha", ""));
        
        //Static Prosedur
        MasterNilai.NilaiKuliah(60, "Resha", "");
        
        //Static Fungsi
        System.out.println(MasterNilai.PenilaianKuliah(40, "Resha", ""));

    }
    
}
