
package adapter;

public class WoodTruck implements Vehicle{

    protected WoodTruckComponent _WoodTruck = new WoodTruckComponent();
    
    @Override
    public void speedUp() {
        _WoodTruck.downFeets();
        _WoodTruck.run();
        System.out.println("WoodTruck Speed Up");
    }

    @Override
    public void brake() {
        _WoodTruck.downFeets();
        _WoodTruck.touchFloor();
        System.out.println("WoodTruck Brake");
    }
    
}
