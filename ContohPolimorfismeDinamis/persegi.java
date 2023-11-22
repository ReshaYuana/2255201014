/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContohPolimorfismeDinamis;

/**
 *
 * @author HP
 */
public class persegi extends bangundatar {
    int sisi;
    
    public persegi(int sisi){
        this.sisi = sisi;
    }
    
    @Override
    public float luas(){
        return this.sisi * this.sisi;
    }
    
    @Override
     public float keliling(){
         return this.sisi * 4;
     }
}
