/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan4_BangunDatar;

/**
 *
 * @author HP
 */
public class Segitiga extends BangunDatar {
    int alas;
    int tinggi;
    
    @Override
    int luas(){
        int luas = (int) (0.5*alas*tinggi);
        System.out.println("Menghitung luas segitiga" );
        System.out.println("alas     : " + alas);
        System.out.println("tinggi   : " + tinggi);
        System.out.println("Rumus  : 0.5*alas*tinggi");
        System.out.println("Jadi luas segitiga : " + luas);
        return luas;
    }
}
