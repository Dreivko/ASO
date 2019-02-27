
package adapter;

public class WoodTruck implements Vehicle{

    protected WoodTruckComponent _WoodTruck = new WoodTruckComponent();
    
    @Override
    public void SpeedUp() {
        _WoodTruck.DownFeets();
        _WoodTruck.Run();
        System.out.println("WoodTruck Speed Up");
    }

    @Override
    public void Brake() {
        _WoodTruck.DownFeets();
        _WoodTruck.TouchFloor();
        System.out.println("WoodTruck Brake");
    }
    
}
