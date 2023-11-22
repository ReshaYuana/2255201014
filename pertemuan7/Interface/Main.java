 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;


import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        
        char nilai = '0';
        
        Scanner keyboard = new Scanner(System.in);
        
        
        System.out.print("Pilih Handphone : ");
        nilai = keyboard.next().charAt(0);
      
        if (nilai == '1'){
            System.out.println("");
            
        Phone Redmi6A = new Xiaomi();
        
        PhoneUser Resha = new PhoneUser(Redmi6A);
        
        Resha.TurnOnThePhone();

        
        Scanner input = new Scanner(System.in);
        String aksi;
        
        System.out.println("Pilih Hp : ");
        while(true){
            System.out.println("===== APLIKASI INTERFACE =====");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.print("Pilih Aksi : ");
            aksi = input.nextLine();
            if(aksi.equals("1")){
                Resha.TurnOnThePhone();
            }else if(aksi.equals("2")){
                Resha.TurnOffThePhone();
            }
            else if(aksi.equals("3")){
               Resha.makePhoneLouder();
            }
            else if(aksi.equals("4")){
                Resha.makePhoneSilent();
            }
            else if(aksi.equals("0")){
                System.exit(0);
            }
            else{
                System.out.println("Aksi yang kamu pilih salah");
            }
        }
    } else if (nilai == '2'){
            System.out.println("");
   
        Phone Oppo_Reno4f = new Oppo();
        
        PhoneUser Resha = new PhoneUser(Oppo_Reno4f);
        
        Resha.TurnOnThePhone();

        
        Scanner input = new Scanner(System.in);
        String aksi;
        
        System.out.println("Pilih Hp : ");
        while(true){
            System.out.println("===== APLIKASI INTERFACE =====");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Restart Hp");
            System.out.println("[4] Perbesar Volume");
            System.out.println("[5] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.print("Pilih Aksi : ");
            aksi = input.nextLine();
            if(aksi.equals("1")){
                Resha.TurnOnThePhone();
            }else if(aksi.equals("2")){
                Resha.TurnOffThePhone();
            }
            else if(aksi.equals("3")){
               Resha.restartThePhone();
            }
            else if(aksi.equals("4")){
               Resha.makePhoneLouder();
            }
            else if(aksi.equals("5")){
                Resha.makePhoneSilent();
            }
            else if(aksi.equals("0")){
                System.exit(0);
            }
            else{
                System.out.println("Aksi yang kamu pilih salah");
            }
        }
        
        } else if (nilai == '3'){
            System.out.println("");
   
        Phone iPhone13 = new iPhone();
        
        PhoneUser Resha = new PhoneUser(iPhone13);
        
        Resha.TurnOnThePhone();

        
        Scanner input = new Scanner(System.in);
        String aksi;
        
        System.out.println("Pilih Hp : ");
        while(true){
            System.out.println("===== APLIKASI INTERFACE =====");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Restart Hp");
            System.out.println("[4] Perbesar Volume");
            System.out.println("[5] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.print("Pilih Aksi : ");
            aksi = input.nextLine();
            if(aksi.equals("1")){
                Resha.TurnOnThePhone();
            }else if(aksi.equals("2")){
                Resha.TurnOffThePhone();
            }
            else if(aksi.equals("3")){
               Resha.restartThePhone();
            }
            else if(aksi.equals("4")){
               Resha.makePhoneLouder();
            }
            else if(aksi.equals("5")){
                Resha.makePhoneSilent();
            }
            else if(aksi.equals("0")){
                System.exit(0);
            }
            else{
                System.out.println("Aksi yang kamu pilih salah");
            }
        }
        
        } else if (nilai == '4'){
            System.out.println("");
   
        Phone Samsung_S23_Ultra  = new Samsung();
        
        PhoneUser Resha = new PhoneUser(Samsung_S23_Ultra);
        
        Resha.TurnOnThePhone();

        
        Scanner input = new Scanner(System.in);
        String aksi;
        
        System.out.println("Pilih Hp : ");
        while(true){
            System.out.println("===== APLIKASI INTERFACE =====");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Restart Hp");
            System.out.println("[4] Perbesar Volume");
            System.out.println("[5] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.print("Pilih Aksi : ");
            aksi = input.nextLine();
            if(aksi.equals("1")){
                Resha.TurnOnThePhone();
            }else if(aksi.equals("2")){
                Resha.TurnOffThePhone();
            }
            else if(aksi.equals("3")){
               Resha.restartThePhone();
            }
            else if(aksi.equals("4")){
               Resha.makePhoneLouder();
            }
            else if(aksi.equals("5")){
                Resha.makePhoneSilent();
            }
            else if(aksi.equals("0")){
                System.exit(0);
            }
            else{
                System.out.println("Aksi yang kamu pilih salah");
            }
        }
        
        }  
        
    }
}
