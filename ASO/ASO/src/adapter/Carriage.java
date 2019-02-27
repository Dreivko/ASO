
package adapter;

public class Carriage implements Vehicle{

    protected CarriageComponent _Carriage = new CarriageComponent();
    
    @Override
    public void SpeedUp() {
        _Carriage.Snatch();
        _Carriage.Drive();
        System.out.println("Carriage Speed Up");
    }

    @Override
    public void Brake() {
        _Carriage.PullTheHorses();
        System.out.println("Carriage Brake");
    }
    
}
