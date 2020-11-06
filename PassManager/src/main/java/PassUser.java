/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Alwin Singh
 */
public class PassUser {
    PassProgram passprogram = new PassProgram();
    
//    public static void main(String[] args) {
//        PassUser test = new PassUser();
//        test.testProgram();
//    }
    
    public void testProgram() {
        Scanner input = new Scanner(System.in);
        String username = "", userpassword = "";
        
        while (!passprogram.validateLogin(username, userpassword)) {
        System.out.println("Enter your username: ");
        username = input.nextLine();
        System.out.println("Enter your password: ");
        userpassword = input.nextLine();
        }
        
        System.out.println("Logged in");
    }
  
}
