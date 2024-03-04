/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q5factoriol;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Q5factoriol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner add=new Scanner(System.in);
        System.out.println("enter the number ");
        int f= add.nextInt();
         int fact=1;
         if(f>=0){
        for(int i=1;i<=f;i++){
           fact=fact*i;
            }  
 
       System.out.println("the fuctoriol of the number : "+fact);  
       
    } 
    else{
    System.out.println("invalid input");
}
        // TODO code application logic here
    }
    
}
