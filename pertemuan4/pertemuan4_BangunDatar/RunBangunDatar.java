/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan4_BangunDatar;

/**
 *
 * @author HP
 */
public class RunBangunDatar {
    public static void main(String[] args) {
        
    // membuat objek bangun datar
    BangunDatar bangunDatar = new BangunDatar();
    
    // membuat objek persegi dan mengisi nilai
    Persegi persegi = new Persegi();
    persegi.sisi = 2;
    
    // membuat objek lingkaran dan mengisi nilai
    Lingkaran lingkaran = new Lingkaran();
    lingkaran.r = 22;
    
    // membuat objek persegi panjang dan mengisi nilai
    PersegiPanjang persegiPanjang = new PersegiPanjang();
    persegiPanjang.panjang = 8;
    persegiPanjang.lebar = 4;
    
    // membuat objek segitiga dan mengisi nilai
    Segitiga mSegitiga = new Segitiga();
    mSegitiga.alas = 12;
    mSegitiga.tinggi = 8;
    
    // memanggil method luas dan keliling
   
    bangunDatar.luas();
    bangunDatar.keliling();
    
    persegi.luas();
    persegi.keliling();
    
    lingkaran.luas();
    lingkaran.keliling();
    
    persegiPanjang.luas();
    persegiPanjang.keliling();
    
    mSegitiga.luas();
    mSegitiga.keliling();
    }
    
}
