package Rough;

public class This {
    int a =10;

    public static void main(String[] args) {
        This t = new This();
        t.m1();


    }
    //instance method
    public void m1(){
        int a = 20;
        System.out.println(this.a);
    }

}
