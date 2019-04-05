
package abstractfactory.color;

import abstractfactory.ufoship.UFOShip;

/**
 This is Product B2
 **/

public class Red implements Color{
    
    private boolean _IsPrimary;

    @Override
    public void colorUFO(UFOShip UFO) {
        System.out.println("UFO Color is Red");
    }

    @Override
    public boolean isPrimary() {
        return _IsPrimary;
    }

    @Override
    public void setIsPrimary() {
        _IsPrimary = true;
    }
    
}
