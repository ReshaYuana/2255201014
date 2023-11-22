/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPolimorfismeStatis;

/**
 *
 * @author HP
 */
public class MenghitungBunga {
    float saldo = 1000000;
    double Saldo = 115.75; 
    
   
    float hitungBunga(float saldo){
        double bunga = saldo * 0.05;
        return (float) (saldo + bunga);
    }
    
   
    double hitungBunga(double Saldo){
        double bunga = Saldo * 0.075;
        return (double) (Saldo + bunga);
    }
    
    public static void main(String[] args) {
        MenghitungBunga persen = new MenghitungBunga();
        
        System.out.println("Saldo Awal : Rp." + persen.saldo);
        System.out.println("Saldo Tambah Bunga : Rp." + persen.hitungBunga(1000000));
        System.out.println("Saldo Awal : $" + persen.Saldo);
        System.out.println("Saldo Tambah Bunga : $" + persen.hitungBunga(115.75));
        
    }
}
