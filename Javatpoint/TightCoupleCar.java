package Javatpoint;

public class TightCoupleCar {
    public void start() {
        System.out.println("engine started");
    }

}

class Car{
    private TightCoupleCar tc = new TightCoupleCar();
    public void start(){
        tc.start();
    }
}