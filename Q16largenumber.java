/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q16largenumber;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Q16largenumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter first number");
        int num1=scanner.nextInt();
        System.out.println("enter second number");
        int num2=scanner.nextInt();
        System.out.println("enter thrid number");
        int num3=scanner.nextInt();
        if((num1 >num2)&&(num2 >num3)){ System.out.println("large number is:"+num1);}
        else if((num2 >num1)&&(num2 >num3)){ System.out.println("large number is:"+num2);}
        else{System.out.println("large number is:"+num3);}
        // TODO code application logic here
    }
    
}
