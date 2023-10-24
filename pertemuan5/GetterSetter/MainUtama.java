/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GetterSetter;

/**
 *
 * @author HP
 */
public class MainUtama {
 public static void main(String[] args) {
       User user = new User();
       
       user.SetUsername("reshayuana");
       user.SetPassword("secret");
       
       System.out.println("Usernamenya = " + user.GetUsername());
       System.out.println("Passwordnya = " + user.GetPassword());
       
    }
    
}
