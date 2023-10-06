/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TypeData;

/**
 *
 * @author HP
 */
public class PraktikTipeData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Tipe Data String
        String nama, nim, alamat;
        
        //Tipe Data int
        int umur, semester;
        
        //Tipe Data double
        double tb, bb;
        
        //Tipe Data char
        char kelas;
        
        //Variable
        nama = "Resha Yuana Putri Endrianto";
        nim = "2255201014";
        semester = 3;
        kelas = 'A';
        alamat = "Desa Tingal Garum";
        umur = 20;
        tb = 157.5;
        bb = 65.4;
        
        System.out.println("Nama         = " + nama);
        System.out.println("NIM          = " + nim);
        System.out.println("Semester     = " + semester);
        System.out.println("Kelas        = " + kelas);
        System.out.println("Alamat       = " + alamat);
        System.out.println("Umur         = " + umur + " tahun ");
        System.out.println("Tinggi Badan = " + tb + " cm ");
        System.out.println("Berat Badan  = " + bb + " kg ");
    }
    
}
