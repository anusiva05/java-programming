
import java.util.Scanner;
public class sumnatural {
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        System.out.print("enter the number");
        int n=a.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
            System.out.println("sum of n natural number is:"+sum);
        }
    }
    
}
