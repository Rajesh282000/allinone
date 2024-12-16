package com.Rough;

 class Question1 {
    static int b = 2;
}
class Answer1 extends Question1{
    static int b=20;

}
 class Q extends Answer1{
    public static void main(String[] args) {
        b=100;
        System.out.println(b);
        System.out.println(b+Question1.b);
    }
}