/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author HP
 */
public class RunHewan {
    public static void main(String[] args) {
       
        Hewan hewan = new Hewan();
        hewan.menampilkan();
       
       // menampilkan variabel
       Karnivora krnvr = new Karnivora();
       krnvr.nama_hewan = " Singa ";
       krnvr.ciri_ciri = " Pemakan Daging ";
       
       Omnivora omnvr = new Omnivora();
       omnvr.nama_hewan = " Piranha ";
       omnvr.ciri_ciri = " Pemakan Daging dan Tumbuhan ";
       
       Herbivora hrbvr = new Herbivora();
       hrbvr.nama_hewan = " Sapi ";
       hrbvr.ciri_ciri = " Pemakan Tumbuhan ";
       
       // memanggil variabel
       krnvr.menampilkan();
       krnvr.jenis_hewan();
       
       omnvr.menampilkan();
       omnvr.jenis_hewan();
       
       hrbvr.menampilkan();
       hrbvr.jenis_hewan();
           
    }
    
}
