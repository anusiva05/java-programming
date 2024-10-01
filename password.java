import java.util.Scanner;
public class password {
    public static void main(String args[]){
        int password=12345;
        Scanner scan=new Scanner(System.in);
        int user=scan.nextInt();
            if(user==password){
                System.out.print("valid password");
            }
            else{
                System.out.print("incorrect password! try again");
        }

    }
}
