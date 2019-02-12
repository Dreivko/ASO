
package abstractFactory.Color;

import abstractFactory.UFOShip.UFOShip;

public class Red implements Color{
    
    private boolean _IsPrimary;

    @Override
    public void ColorUFO(UFOShip UFO) {
        System.out.println("UFO Color is Red");
    }

    @Override
    public boolean IsPrimary() {
        return _IsPrimary;
    }

    @Override
    public void SetIsPrimary() {
        _IsPrimary = true;
    }
    
}
