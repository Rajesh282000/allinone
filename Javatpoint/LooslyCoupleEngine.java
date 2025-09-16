package Javatpoint;

interface Engine{
    void start();
}
public class LooslyCoupleEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Engine started");
    }
}

 class  CarTest{
    private Engine engine ;

    public CarTest(Engine engine) {
        this.engine = engine;
    }

    public void drive(){
        engine.start();
        System.out.println("Car is driving");
    }
}