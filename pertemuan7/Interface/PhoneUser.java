/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author HP
 */
public class PhoneUser {

    private final Phone phone;
    private char t;

    public PhoneUser(Phone phone) {
        this.phone = phone;
    }

    void TurnOnThePhone() {
        this.phone.powerOn();
    }

    void TurnOffThePhone() {
        this.phone.powerOff();
    }
    
    void restartThePhone(){
        this.phone.restart(t);
    }

    void makePhoneLouder() {
        this.phone.volumeUp();
    }

    void makePhoneSilent() {
        this.phone.volumeDown();
    }
}
