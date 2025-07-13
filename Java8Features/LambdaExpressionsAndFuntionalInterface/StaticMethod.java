package Java8Features.LambdaExpressionsAndFuntionalInterface;

interface A{
    static void show(){
        System.out.println("Default Method");
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        //to access static method in interface we use InterfaceName.methodName()
        A.show();

    }
}
