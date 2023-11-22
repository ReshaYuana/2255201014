/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_ReshaYuana;

/**
 *
 * @author HP
 */
public class Film {
    private String judul;
    private String genre;

    public Film(String judul, String genre) {
        this.judul = judul;
        this.genre = genre;
    }
    
    public void setjudul(String judul){
        this.judul = judul;
    }
    
    public void setgenre(String genre){
        this.genre = genre;
    }

    public String getJudul() {
        return judul;
    }

    public String getGenre() {
        return genre;
    }
}
