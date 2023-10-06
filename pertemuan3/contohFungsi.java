/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author HP
 */
public class contohFungsi {

   int alas = 14;
   int tinggi = 5;
    
        int hitungLuasJajarGenjang(){
            int luas = alas * tinggi;
            System.out.println("alas = " + alas);
            System.out.println("tinggi = " + tinggi);
            return luas;
        }
    public static void main(String[] args) {
        contohFungsi  F = new contohFungsi();
        System.out.println("LuasJajarGenjang = " + F.hitungLuasJajarGenjang());
    }
    
}
