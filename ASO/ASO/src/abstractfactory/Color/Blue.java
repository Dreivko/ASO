
package abstractfactory.color;

import abstractfactory.ufoship.UFOShip;

public class Blue implements Color{
    private boolean _IsPrimary;

    @Override
    public void ColorUFO(UFOShip UFO) {
        System.out.println("UFO Color is Blue");
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
