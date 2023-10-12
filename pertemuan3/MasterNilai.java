/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author HP
 */
public class MasterNilai {

  // Prosedur
  void penilaian(int nilai, String nama, String keterangan){
        System.out.println("Nama : " + nama);
        System.out.println("Nilai : " + nilai);
        //Grade
        if ( nilai >= 90 ){
            System.out.println("Grade = A");
        }else if ( nilai >= 80 ){
            System.out.println("Grade = B+");
        }else if ( nilai >= 70 ){
            System.out.println("Grade = B");
        }else if ( nilai >= 60 ){
            System.out.println("Grade = C+");
        }else if ( nilai >= 50 ){
            System.out.println("Grade = C");
        }else if ( nilai >= 40 ){
            System.out.println("Grade = D");
        }else {
            System.out.println("Grade = E");
        }
        
        if ( nilai >= 70 ){
            keterangan ="Lulus\n";
            System.out.println("Selamat Anda " + keterangan);
        }else {
            keterangan ="Belum Lulus\n";
            System.out.println("Mohon maaf Anda " + keterangan);
        }
    }
  //Fungsi
  String HasilNilai(int nilai, String nama, String keterangan){
      System.out.println("Nama : " + nama);
        System.out.println("Nilai : " + nilai);
        //Grade
        if ( nilai >= 90 ){
            System.out.println("Grade = A");
        }else if ( nilai >= 80 ){
            System.out.println("Grade = B+");
        }else if ( nilai >= 70 ){
            System.out.println("Grade =B");
        }else if ( nilai >= 60 ){
            System.out.println("Grade = C+");
        }else if ( nilai >= 50 ){
            System.out.println("Grade = C");
        }else if ( nilai >= 40 ){
            System.out.println("Grade = D");
        }else {
            System.out.println("Grade = E");
        }
        if ( nilai >= 70 ){
            keterangan ="Selamat Anda Lulus\n";
        }else {
            keterangan ="Mohon Maaf Anda Belum Lulus\n";
        }
        return keterangan;
  }
  
  //Static Prosedur
  static void NilaiKuliah(int nilai, String nama, String keterangan){
        System.out.println("Nama : " + nama);
        System.out.println("Nilai : " + nilai);
        //Grade
        if ( nilai >= 90 ){
            System.out.println("Grade = A");
        }else if ( nilai >= 80 ){
            System.out.println("Grade = B+");
        }else if ( nilai >= 70 ){
            System.out.println("Grade =B");
        }else if ( nilai >= 60 ){
            System.out.println("Grade = C+");
        }else if ( nilai >= 50 ){
            System.out.println("Grade = C");
        }else if ( nilai >= 40 ){
            System.out.println("Grade = D");
        }else {
            System.out.println("Grade = E");
        }
        if ( nilai >= 70 ){
            keterangan ="Lulus\n";
            System.out.println("Selamat Anda " + keterangan);
        }else {
            keterangan ="Belum Lulus\n";
            System.out.println("Mohon maaf Anda " + keterangan);
        }
    }
  
  //Static Fungsi
  static String PenilaianKuliah(int nilai, String nama, String keterangan){
      System.out.println("Nama : " + nama);
        System.out.println("Nilai : " + nilai);
        //Grade
        if ( nilai >= 90 ){
            System.out.println("Grade = A");
        }else if ( nilai >= 80 ){
            System.out.println("Grade = B+");
        }else if ( nilai >= 70 ){
            System.out.println("Grade =B");
        }else if ( nilai >= 60 ){
            System.out.println("Grade = C+");
        }else if ( nilai >= 50 ){
            System.out.println("Grade = C");
        }else if ( nilai >= 40 ){
            System.out.println("Grade = D");
        }else {
            System.out.println("Grade = E");
        }
        if ( nilai >= 70 ){
            keterangan ="Selamat Anda Lulus\n";
        }else {
            keterangan ="Mohon Maaf Anda Belum Lulus\n";
        }

        return keterangan;
  }
}
