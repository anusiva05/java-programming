
public class leapyear {
    public static void main(String args[]){
        long year=2024;
        if(( year%4==0 && year%100!=0) || year%400==0){
            System.out.print("leap year");
        }
        else{
            System.out.print("not a leap year");
        }
    }
    
}
