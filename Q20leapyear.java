/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q20leapyear;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Q20leapyear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner get=new Scanner(System.in);
        System.out.println("Enter the year you need");
        int year=get.nextInt();
        if(year%4==0 || year%100 !=0){
            System.out.println("the year is leap");
        }
        else{System.out.println("the year is not leap");}
    }
        // TODO code application logic here
      
}
