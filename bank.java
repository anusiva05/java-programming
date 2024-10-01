import java.util.Scanner;
public class bank {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter your balance:");
        //System.out.println("enter your withdrawl:");
        int balance= scan.nextInt();
        System.out.print("enter your withdrawl:");
        int withdrawal=scan.nextInt();
        int amount=balance-withdrawal;
        System.out.print("balance amount"+amount);
        
    }
    
}