import java.util.Random;
import java.util.Scanner;
public class guesgame {
    public static void main(String arg[]){
        Scanner a=new Scanner(System.in);
        Random b=new Random();
        int n=a.nextInt();
        int gues=0;
        System.out.println("wlc to guesing game");
        System.out.println("i have selected a num btw 1 to 100");
        System.out.println("can u guess what it is?");
        while (true) {
            System.out.println("enter yr guess");
            gues=a.nextInt();
            if(gues<n){
            System.out.println("to low");
            }
            else if(gues>n){
            System.out.println("to high");
            }
            else{
            System.out.println("you guessed the crt ans");
            }
        }
        
    }
    
}
