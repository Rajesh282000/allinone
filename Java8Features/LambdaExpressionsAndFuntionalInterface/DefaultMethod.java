package Java8Features.LambdaExpressionsAndFuntionalInterface;

interface Parent1{
    default void show(){
        System.out.println("Parent1 class");
    }
}

interface Parent2{
    default void show(){
        System.out.println("Parent2 class");
    }
}
//2 case for default method in interface:
//1)In case of multiple inheritance, there is an ambiguity when we use default method in Parent1 and Parent2,
//so inside child class by override that default method we call through InterfaceName.super.show(),
//2) OR child should be override that default method which is present in Parent1 and Parent2


class Child implements Parent1, Parent2{
    @Override
    public void show() {
        //we can use default method by InterfaceName.super.show()
        Parent1.super.show();
    }

//    @Override
//     public void show(){
//        System.out.println("Child class");
//    }
}

public class DefaultMethod {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
