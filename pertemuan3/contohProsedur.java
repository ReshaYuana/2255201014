/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author HP
 */
public class contohProsedur {

    int alas = 14;
    int tinggi = 5;
    
        void hitungLuasJajarGenjang(){
            int luas = alas * tinggi;
            System.out.println("alas = " + alas);
            System.out.println("tinggi = " + tinggi);
            System.out.println("luas jajar genjang = " + luas);
        }
    public static void main(String[] args) {
        contohProsedur  p = new contohProsedur();
        p.hitungLuasJajarGenjang();
    }
    
}
