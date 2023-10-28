/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan4_BangunDatar;

/**
 *
 * @author HP
 */
public class PersegiPanjang extends BangunDatar {
    int panjang;
    int lebar;
    
    @Override
    int luas(){
        int luas = (int) (panjang*lebar);
        System.out.println("Menghitung luas persegi panjang" );
        System.out.println("panjang : " + panjang);
        System.out.println("lebar   : " + lebar);
        System.out.println("Rumus : panjang*lebar");
        System.out.println("Jadi luas persegi panjang : " + luas);
        return luas;
    }
    
    @Override
    int keliling(){
        int keliling = (int) (2*panjang+2*lebar);
        System.out.println("Menghitung keliling persegi panjang" );
        System.out.println("panjang : " + panjang);
        System.out.println("lebar   : " + lebar);
        System.out.println("Rumus : 2*panjang+2*lebar");
        System.out.println("Jadi keliling persegi panjang : " + keliling);
        System.out.println("--------------------------------");
        return keliling;
    }
}
