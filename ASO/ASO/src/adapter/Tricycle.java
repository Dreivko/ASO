
package adapter;

public class Tricycle implements Vehicle{

    protected TricycleComponent _Tricycle = new TricycleComponent();
    
    @Override
    public void SpeedUp() {
        _Tricycle.Pedalling();
        System.out.println("Tricycle Speed Up");
    }

    @Override
    public void Brake() {
        _Tricycle.DownFeets();
        _Tricycle.TouchFloor();
        System.out.println("Tricycle Brake");
    }
    
    
    
}
