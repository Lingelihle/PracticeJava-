/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emailapp;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int defaultpPasswordLength = 10; // changeable 
    private int mailboxCapacity = 500; /// changeable 
    private String alternateEmail;
    private String companySuffix = "aeycompany.com";
    
    
    // constructor to recieve firstname and lastname 
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
        
         //call method asking for department - return the department
         this.department = setDepartment();
         System.out.println("Department: " + this.department);
         
         // call method that returns a random password 
         this.password = randomPassword(defaultpPasswordLength);
         System.out.println("Your password is: " + this.password);
         
         // combine elements to generate email
         email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + "company.com"; // or add company.Suffix
         System.out.println("Your email is : " + email);
         
         
    }
    
    // ask for department
    
    private String setDepartment(){
        System.out.print("Departments Codes\n1 for Sales\n2 for Developement\n3 for Accounting\n0 for none \nEnter Department code: "); 
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
                if (depChoice == 1) { return "sales";}
                else if (depChoice == 2) {return "dev";}
                else if (depChoice == 3) {return "acct";}
                else { return "";}
    }                
                    
                
    
 
    
    // generate random password
    
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i=0; i<length; i++) {
         int rand = (int) (Math.random() * passwordSet.length());
         password[i] = passwordSet.charAt(rand);
        }
        return new String (password); 
    }
    
    // set the mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity; 
    
    }
    
    // set the alternate email 
    public void setAlterternateEmail(String altEmail){
    this.alternateEmail = altEmail;
    }
    
    // change password 
    
    public void changePassword(String password){
    this.password = password;
    }
    
    public int getMailboxCapacity() { return mailboxCapacity;}
    public String getAlterternateEmail() {return alternateEmail;}
    public String getPassword()  { return password;}
    
    public String showInfo() {
        return "\nDISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }
    
}


// can optionally reduce redundancy such as creat email and other unneccessary components in the line code