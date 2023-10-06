/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Percabangan;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class PraktikPercabangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Percabangan Kelulusan
        String nama;
        int nilai;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nama = ");
        nama = in.nextLine();
        System.out.print("Masukkan nilai = ");
        nilai = in.nextInt();
        
        if (nilai >= 70){
            System.out.println(nama + " ANDA DINYATAKAN LULUS ");
        }else{
            System.out.println(nama + " ANDA DINYATAKAN TIDAK LULUS ");
        }
      
    }
    
}
