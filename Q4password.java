/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q4password;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Q4password {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner getUserInput=new Scanner(System.in);
        System.out.println("Enter the Password Criteria");
        String get=getUserInput.next();
        if(get.contains("nh*")){
            System.out.println("get first one");
        }
        else if(get.contains("!5t")){
            System.out.println("get second one");
        }
        else{
            System.out.println("get Thrid one");
        }
        // TODO code application logic here
    }
    
}
