/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author mmccom
 */
public class MasterMobil {
    String warna = "biru";
    String merek = "ferari";
    int tahunProduksi = 2020; 
    
    void datamobil(){
        System.out.println("warna: " + warna);
        System.out.println("merek: " + merek);
        System.out.println("Tahun Produksi: " + tahunProduksi);
     }
    void startMobil() {
        System.out.println("Mobil " + warna + " " + merek + " telah dihidupkan.");
    }
    void stopMobil() {
        System.out.println("Mobil " + warna + " " + merek + " telah dimatikan.");
     }
}


