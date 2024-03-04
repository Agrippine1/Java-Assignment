/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q7library;
import java.util.Scanner;
public class Q7library {
   static String bookTitle;
  static  String author;
  static  String pName;
static int maxNbrOfBook=3;
    public Q7library(String bookTitle, String author, String pName) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.pName = pName;
    }

/**
 *
 * @author user
 */


    public static void main(String[] args) {
         String ge="";
        int num1=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Book Title");
        bookTitle=in.next();
        System.out.println("Enter the Boosk Author");
        author=in.next();
        System.out.println("Enter the Patron Name");
        pName=in.next();
        new Q7library(bookTitle,author,pName);
        System.out.println("enter number of book to borrowed");
        int num=in.nextInt();
        if(num>3){
            for(;;){
        System.out.println("maximum  number of books is three input your number below 3");
         num1=in.nextInt();
            if(num1<=3)
            System.out.println("Enter the name of book you wants");
         break;}}
           for(int i=1;i<=num1;i++){
            ge=in.next();
        }
        
    }
        // TODO code application logic here
    }
    
}
