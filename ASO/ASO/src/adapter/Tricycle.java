
package adapter;


/**
 Adapter
 **/

public class Tricycle implements Vehicle{

    protected TricycleComponent _Tricycle = new TricycleComponent();
    
    @Override
    public void speedUp() {
        _Tricycle.pedalling();
        System.out.println("Tricycle Speed Up");
    }

    @Override
    public void brake() {
        _Tricycle.downFeets();
        _Tricycle.touchFloor();
        System.out.println("Tricycle Brake");
    }
    
    
    
}
