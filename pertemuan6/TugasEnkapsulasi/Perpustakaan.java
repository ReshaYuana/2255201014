/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasEnkapsulasi;

/**
 *
 * @author HP
 */
public class Perpustakaan {
    private String NoId;
    private String NamaBuku;
    private String Penulis;
   
    
    public void setNoId(String NoId){
        this.NoId = NoId;
    }
    
    public void setNamaBuku(String NamaBuku){
        this.NamaBuku = NamaBuku;
    }
     
    public void setPenulis(String Penulis){
        this.Penulis = Penulis;
    }
    
    public String getNoId(){
        return NoId;
    }
    
    public String getNamaBuku(){
        return NamaBuku;
    }
    
    public String getPenulis(){
        return Penulis;
    }
    
    public void peminjaman(){
        System.out.println("Meminjam Buku");
}
    public void jenisbuku(String Buku){
        System.out.println("Jenis Buku : " + Buku);
    }
    public String tampilan(){
        return "\nNoID : " + NoId + "\nNama Buku : " + NamaBuku + "\nNama Penulis : " + Penulis ;
    }
}
