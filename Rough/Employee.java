package com.Rough;

public class Employee {
Employee(){
    this("Rajesh");
    System.out.println("Default constructor called");


}
Employee(String name){
    this(20,30,10);

    System.out.println("Parametrized constructor called");

}
Employee(int a, int b, int d){
    int c =a+b+d;
    System.out.println("Adding three no.:-"+c);
}
    void subtract(int a, int b,int c){
        int d = a-b-c;
        System.out.println("Adding two no.:-"+c);
    }


    void subtract(int a, int b){
        int c = a-b;
        System.out.println("Subtract two no.:-"+c);
    }

    public static void main(String[] args) {
        Employee c= new Employee();
        c.subtract(19,4);
        c.subtract(19,4,1);

    }
}
