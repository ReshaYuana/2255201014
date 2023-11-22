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
public class iPhone implements Phone {

    private int volume;
    private boolean isPowerOn;

    public iPhone() {
        this.volume = 50;
    }
    
    Scanner input = new Scanner(System.in);

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Handphone Menyala..");
        System.out.println("Selamat Datang di iPhone");
        System.out.println("IOS Version 17.1.1");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("HandPhone Dimatikan");
    }
    
     @Override
    public void restart(char jawab) {
        if (isPowerOn){
            System.out.print("Apakah anda ingin merestart [y/t] : ");
            jawab = input.next().charAt(0);
                if (jawab == 'y' || jawab == 'Y') {
                    System.out.println("Tunggu sebentar HP sedang direstart......");
                    this.powerOff();
                    this.powerOn();
                } else if (jawab == 't' || jawab == 'T'){
                    System.out.println("Handphone tidak jadi di restart");
                } else {
                    System.out.println("Inputan salah");
                }
        } else {
            System.out.println("Handphone anda sedang mati");
        }
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume FULL");
                System.out.println("Sudah " + this.getVolume() + "%");
            } else {
                this.volume += 10;
                System.out.println("Volume Sekarang : " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan dulu HP-nya Bro...!!");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (this.volume == MIN_VOLUME) {
                System.out.println("Volume Sudah Paling Rendah");
                System.out.println("Sudah " + this.getVolume() + "%");
            } else {
                this.volume -= 10;
                System.out.println("Volume Sekarang : " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan dulu HP-nya Bro...!!");
        }
    }

    public int getVolume() {
        return this.volume;
    }
}
