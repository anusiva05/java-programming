public class calculator {
    public int add(int a,int b){
        return a+b;
    }
    //public int add(int a,int b,int c){
        //return a+b+c;
    //}
    //public double add(double a,double b){
        //return a+b;
    //}
public class demo{
    public static void main(String[] args) {
        calculator obj=new calculator();
        int r1=obj.add(5,10);
        System.out.print(r1);
        //int r2=obj.add(1,2,3);
        //System.out.print(r2);
        //int r3=obj.add(4.5,5.5);
        //system.out.print(r3);
    }
}
}