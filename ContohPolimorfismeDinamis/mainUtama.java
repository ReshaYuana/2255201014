/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContohPolimorfismeDinamis;

/**
 *
 * @author HP
 */
public class mainUtama {
    public static void main(String[] args) {
        
        bangundatar bangunD = new bangundatar();
        persegi Persegi = new persegi (5);
        segitiga Segitiga = new segitiga (5, 10);
        lingkaran Lingkaran = new lingkaran (10);
        
        //panggil method luas dan keliling
        bangunD.luas();
        bangunD.keliling();
        
        System.out.println("Luas persegi : " + Persegi.luas());
        System.out.println("Keliling persegi : " + Persegi.keliling());
        System.out.println("Luas segitiga : " + Segitiga.luas());
        System.out.println("Luas lingkaran : " + Lingkaran.luas());
        System.out.println("Keliling lingkaran : " + Lingkaran.keliling());
    }
}
