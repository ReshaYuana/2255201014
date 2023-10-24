/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5.TugasOverriding;

/**
 *
 * @author HP
 */
public class Omnivora extends Hewan{
       @Override
       public void berkaki(){
        System.out.println("Hewan ini berkaki dua ");
        System.out.println("----------------------------------------------");
    } 
       
     void menampilkan(){
        System.out.println("Nama hewan:" + nama_hewan);
        System.out.println("Ciri-ciri :" + ciri_ciri);
    }

    void jenis_hewan(){
        System.out.println("Hewan ini berjenis Omnivora ");
    }
}
