/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q1rectangle;
import java.util.Scanner;
class areaOfRectangle{
int width;
int length;
 void setperimeterOfRectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }
   int getperimeterOfRectangle(int width, int length) {
       return (length+width)*2;
    }

   void setareaOfRectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }
   int getareaOfRectangle(int width, int length) {
       return length*width;
    }


}


public class Q1rectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the width");
        int wid=scanner.nextInt();
        System.out.println("Enter the Length");
        int len=scanner.nextInt();
        areaOfRectangle obj=new areaOfRectangle();
        obj.setperimeterOfRectangle(wid, len);
        obj.setareaOfRectangle(wid, len);
        System.out.println("the perimeter of rectangle"+" "+obj.getperimeterOfRectangle(wid, len));    
       System.out.println("the Area of rectangle"+" "+obj.getareaOfRectangle(wid, len)); 
    }
    
}
