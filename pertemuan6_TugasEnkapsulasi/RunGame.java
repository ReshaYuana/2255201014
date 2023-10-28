/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan6_TugasEnkapsulasi;

/**
 *
 * @author HP
 */
public class RunGame {
    public static void main(String[] args) {
        Game game = new Game();
        
        game.SetpName("Resha Yuana");
        game.SetGameType("Battle Royal");
        
        System.out.println("Player Game Name = " + game.GetpName());
        System.out.println("Player Game Type = " + game.GetGameType());
   }
    
}
