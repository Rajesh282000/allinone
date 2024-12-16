package Rough;

public class Constructor {


    //type 1 constructor
   public  Constructor(){
        System.out.println("hello");

    }

    //type 2 constructor
    public  Constructor( int a){
        System.out.println("helloworld" +a);

    }

    public  Constructor( int a, String s){
        System.out.println("helloworld" +a + " String" +s);

    }

    public static void main(String[] args) {
       Constructor c =new Constructor(5);
        Constructor c1 =new Constructor(5, "rajesh");

    }
}
