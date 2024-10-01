public class gradeabcd {
    public static void main(String args[]){
        int mark=60;
        if(mark>90){
            System.out.print("grade A");
        }
        else if(70<mark && mark>80){
            System.out.println("grade B");
        }
        else if(50<mark && mark<70){
            System.out.println("grade C");
        }
        else{
            System.out.println("fail");
        }
    }
    
}
