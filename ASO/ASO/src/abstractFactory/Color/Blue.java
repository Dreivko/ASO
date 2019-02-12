
package abstractFactory.Color;

import abstractFactory.UFOShip.UFOShip;

public class Blue implements Color{
    private boolean _IsPrimary;

    @Override
    public void ColorUFO(UFOShip UFO) {
        System.out.println("UFO Color is Blue");
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
