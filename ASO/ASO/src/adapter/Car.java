
package adapter;

public class Car implements Vehicle{

    @Override
    public void speedUp() {
        System.out.println("Car Speed Up");
    }

    @Override
    public void brake() {
        System.out.println("Car Brake");
    }
    
}
