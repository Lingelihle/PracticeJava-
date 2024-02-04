/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package emailapp;

/**
 *
 * @author User
 */
public class EmailApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Email em1 = new Email("Lingelihle", "Nyuswa");
       
       
      // em1.setMailboxCapacity(int capacity); // can play around with all of them including change password
      // em1.setAlterternateEmail(altEmail);
        
      //set alt email , print the outline
    //  em1.setAlterternateEmail("lns@gmail.com");
     // System.out.println(em1.getAlterternateEmail());
     
    System.out.println(em1.showInfo());  // automatically show everything 
      
    }
    
}
