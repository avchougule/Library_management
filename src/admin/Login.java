package admin;

import java.util.Scanner;

public class Login {
    
        Adminlog obj = new Adminlog();
        Signup objsign=new Signup();
        Scanner sc = new Scanner(System.in);
    
    Adminlog[] adminDatabase=new Adminlog[1];
    void callsignup(){
        objsign.signup(adminDatabase);
        System.out.println("registration completed successfully!!!");
    }

    public void display(){
        System.out.println();
        System.out.println("Library Management Application");
        System.out.println("1.Login");
        System.out.println("2.Sign up"); 
        System.out.println("Enter your option:(Please sign up first, if you have login id ignoe it.)\n");
        int a=sc.nextInt();
        switch (a) {
            case 1:obj.loginForm(adminDatabase);
                display();
                break;
            
            case 2: callsignup();
                display();
                break; 
                 
            default:
            System.out.println("Enter valid number.");
                
        }
    }   
}
