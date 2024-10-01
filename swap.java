public class swap {
    public static void main(String arg[]){
        int a=10;
        int b=5;
        System.out.println("before swapping values"+a +b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping values"+a +b);
    }
    
}
