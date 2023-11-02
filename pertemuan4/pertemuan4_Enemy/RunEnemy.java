/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan4_Enemy;

/**
 *
 * @author HP
 */
public class RunEnemy {

    public static void main(String[] args) {
        Enemy monster = new Enemy();
        
        Zombi zumbi = new Zombi();
        zumbi.name = "Zomboss";
        System.out.println("Zombie Name : " + zumbi.name);
        zumbi.hp = 1000;
        System.out.println("Zombie Health Point : " + zumbi.hp);
        zumbi.attackPoint = 100;
        System.out.println("Zombie Attack Point : " + zumbi.attackPoint);
        zumbi.attack();
        zumbi.walk();
        
        Pocong hantuPocong = new Pocong();
        hantuPocong.name = "Sumanto";
        System.out.println("Pocong Name : " + hantuPocong.name);
        hantuPocong.hp = 1000;
        System.out.println("Pocong Health Point : " + hantuPocong.hp);
        hantuPocong.attackPoint = 50;
        System.out.println("Pocong Attack Point : " + hantuPocong.attackPoint);
        hantuPocong.attack();
        hantuPocong.jump();
        
        Burung garuda = new Burung();
        garuda.name = "Burog";
        System.out.println("Burung Name : " + garuda.name);
        garuda.hp = 10000;
        System.out.println("Burung Health Point : " + garuda.hp);
        garuda.attackPoint = 1000;
        System.out.println("Burung Attack Point : " + garuda.attackPoint);
        garuda.attack();
        garuda.walk();
        garuda.jump();
        garuda.fly();
       
    }
    
}
