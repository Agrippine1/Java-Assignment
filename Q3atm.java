/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q3atm;
import java.util.Scanner;
class Atm{
static int Acc_No=0;
static double Amount=0;
static double Balance=0;
    public Atm(int Acc_No, double Amount) {
        this.Acc_No = Acc_No;
        this.Amount = Amount;
    }
    public void setDepositAmount(double Amount) {
        this.Amount = Amount;
    }
    public void setWithdrawAmount(double Amount) {
        this.Amount = Amount;
    }
}

/**
 *
 * @author user
 */
public class Q3atm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double Balance=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Account Number:");
        int acc_No=scanner.nextInt();
        System.out.println("Enter your Amount:");
        int amount=scanner.nextInt();
        Balance=amount+Balance;
        System.out.println("Your Balance is"+" "+Balance);
        System.out.println("Enter  Amount to deposit:");
        int depamount=scanner.nextInt();
        Balance=Balance+depamount;
        System.out.println("Current Balance is"+" "+Balance);
        System.out.println("Enter  Amount to withdraw:");
        int withamount=scanner.nextInt();
        Balance=Balance-withamount;
        if(withamount>Balance)
        {System.out.println("Amount you are trying to withdraw is less than current balance");}
        else{System.out.println("new Balance is"+" "+Balance);}
        Atm obj=new Atm(acc_No,amount);
        obj.setDepositAmount(depamount);
        obj.setWithdrawAmount(withamount);
        // TODO code application logic here
    }
    
}
