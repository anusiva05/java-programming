
class outer
{
    String name = "This is the outer class";
    class inner{
        String name = "this is the inner class";
        public void display(){
            System.out.println(name);
        }
    }
    public void display(){
        System.out.println(name);
    }
}

public class innerclass {
    public static void main(String[]args){
        outer o = new outer();
        o.display();
        outer.inner i = o.new inner();
        i.display();
    }
}
