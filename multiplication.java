import java.util.Random;
import java.util.Scanner;

public class multiplication {
    public static void main(String[] args){
        Scanner b=new Scanner(System.in);
        Random a=new Random();
        System.out.println("Welcome to the Multiplication Practice Program!");
        while(true){
        int n1=a.nextInt(10);
        int n2=a.nextInt(10);
        int correct=n1*n2;

        System.out.println("What is " + n1 + " * " + n2 + "?");
        System.out.print("Enter your answer (or 0 to exit): ");
        int user=b.nextInt();

        if(user==0){
            break;
        }
        if(user==correct){
            System.out.println("Correct!");
        }
        else{
            System.out.println("Incorrect. The correct answer is " + correct);
        }
        System.out.println("Thank you for practicing multiplication!");




    }
}
    
}