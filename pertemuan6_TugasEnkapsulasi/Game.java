/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan6_TugasEnkapsulasi;

/**
 *
 * @author HP
 */
public class Game {
    private String pName;
    private String GameType;
    
     public void SetpName(String pName){
        this.pName = pName;
    }
    public void SetGameType(String GameType){
        this.GameType = GameType;
    }
    
    public String GetpName(){
        return this.pName;
    }
    public String GetGameType(){
        return this.GameType;
    }
   
    
}
