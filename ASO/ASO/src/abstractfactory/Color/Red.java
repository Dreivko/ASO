
package abstractfactory.color;

import abstractfactory.ufoship.UFOShip;

public class Red implements Color{
    
    private boolean _IsPrimary;

    @Override
    public void ColorUFO(UFOShip UFO) {
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
