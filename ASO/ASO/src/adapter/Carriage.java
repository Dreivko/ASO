
package adapter;

public class Carriage implements Vehicle{

    protected CarriageComponent _Carriage = new CarriageComponent();
    
    @Override
    public void speedUp() {
        _Carriage.snatch();
        _Carriage.drive();
        System.out.println("Carriage Speed Up");
    }

    @Override
    public void brake() {
        _Carriage.pullTheHorses();
        System.out.println("Carriage Brake");
    }
    
}
