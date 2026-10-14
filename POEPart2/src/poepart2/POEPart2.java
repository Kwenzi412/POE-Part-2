/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poepart2;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class POEPart2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LogIn register = new LogIn();
        Message msg = new Message();
        Scanner scan = new Scanner(System.in);
       Registration reg = new Registration();
        
         System.out.println("\n===== Register =====");
     
    System.out.println("Please enter the username:");
    String name = scan.nextLine();
    
    System.out.println("Please enter the password");
    String password = scan.nextLine();
    
     System.out.println("Please enter the cellphone number");
    String number = scan.nextLine();
 
  System.out.println(reg.registerUser(name,
   password, number)); 
   
   if (!reg.registerStatus(name,
           password, number )) {
       return;
   }
    
    System.out.println("\n===== Login =====");
        
    System.out.println("Enter username: ");
    String loginUsername = scan.nextLine();
    
    System.out.println("Enter password");
    String loginPassword = scan.nextLine();
    
    boolean status = register.loginUser(name, password);
    
    System.out.println(register.returnLoginStaus(status));
    
    if (status == true) {
    
        msg.numMessageSent = 8;
        int option;
        
        do{
           System.out.println("\n===== Select any of the option below =====");
            System.out.println("1. Send message");
            System.out.println("2. Coming soon");
            System.out.println("3. Exit");
            
            option = scan.nextInt();
            
            switch(option){
                case 1 -> msg.sendingMessages();
                case 2 -> System.out.println("Coming soon");
                case 3 -> System.out.println("Goodbye!!");
                default -> System.out.println("Invalid option");
            }
            
        }while(option !=3);
    }
    }
}
