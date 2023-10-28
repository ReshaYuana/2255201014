/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan4_BangunDatar;

/**
 *
 * @author HP
 */
public class Persegi extends BangunDatar {
    int sisi;

    @Override
    int luas(){
        int luas = sisi * sisi;
        System.out.println("Menghitung luas persegi" );
        System.out.println("Sisi : " + sisi);
        System.out.println("Rumus : sisi*sisi");
        System.out.println("Jadi luas persegi : " + luas);
        return luas;
}
    
    @Override
    int keliling(){
        int keliling = 4 * sisi;
        System.out.println("Menghitung keliling persegi" );
        System.out.println("Sisi : " + sisi);
        System.out.println("Rumus : 4*sisi");
        System.out.println("Jadi keliling persegi : " + keliling);
        System.out.println("--------------------------------");
        return keliling;
    }
}

