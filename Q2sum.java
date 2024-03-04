/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q2sum;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Q2sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int number1;
     int number2;
     int sum=0;
         Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the First number");
        int num1=scanner.nextInt();
        System.out.println("Enter the second number");
        int num2=scanner.nextInt();
             int i;
       
        for( i=num1;i<=num2;i++){
     sum=sum+i; 
     }
        
      System.out.println("Sum of Number Between First Number and Second number is="+sum);  
        // TODO code application logic here
    }
    
}
