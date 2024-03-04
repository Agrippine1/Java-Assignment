/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q6interctionarray;

/**
 *
 * @author user
 */
public class Q6interctionarray {
    public static void arrays(){
int arr1[]={12,20,31,48,55,9};
        int arr2[]={48,60,47,18,9};
        for(int i=0;i<arr1.length;i++){
        for(int j=0;j<arr2.length;j++){
            if(arr1[i]==arr2[j]){
                System.out.println(arr1[i]);
            }
        }
        }
}

   
    public static void main(String[] args) {
         arrays();
        // TODO code application logic here
    }
    
}
