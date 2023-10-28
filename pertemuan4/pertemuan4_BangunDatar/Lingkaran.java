/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan4_BangunDatar;

/**
 *
 * @author HP
 */
public class Lingkaran extends BangunDatar{
    
    // jari-jari lingkaran
    int r;
     
    @Override
    int luas(){
        int luas = (int) (Math.PI*r*r);
        System.out.println("Menghitung luas lingkaran" );
        System.out.println("r : " + r);
        System.out.println("Rumus : Math.PI*r*r");
        System.out.println("Jadi luas lingkaran : " + luas);
        return luas;
    }
    
    @Override
    int keliling(){
        int keliling = (int) (2*Math.PI*r);
        System.out.println("Menghitung keliling lingkaran" );
        System.out.println("r : " + r);
        System.out.println("Rumus : 2*Math.PI*r");
        System.out.println("Jadi keliling lingkaran : " + keliling);
        System.out.println("--------------------------------");
        return keliling;
    }
}
