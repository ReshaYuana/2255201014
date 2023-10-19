/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author HP
 */
public class RunEnemy {

    public static void main(String[] args) {
        Enemy monster = new Enemy();
        
        Zombi zumbi = new Zombi();
        zumbi.walk();
        
        Pocong hantuPocong = new Pocong();
        hantuPocong.jump();
        
        Burung garuda = new Burung();
        garuda.walk();
        garuda.jump();
        garuda.fly();
        
        // menunjukan inheritance
        
        monster.attack();
        
        zumbi.attack();
        
        hantuPocong.attack();
        
        garuda.attack();
    }
    
}
