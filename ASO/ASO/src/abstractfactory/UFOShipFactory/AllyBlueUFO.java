
package abstractfactory.ufoshipfactory;

import abstractfactory.color.Blue;
import abstractfactory.color.Color;
import abstractfactory.ufoship.AllyUFO;
import abstractfactory.ufoship.UFOShip;

public class AllyBlueUFO implements UFOShipFactory{

    @Override
    public UFOShip CreateShip() {
        UFOShip _Ship = new AllyUFO();
        System.out.println("Ally Ship Created");
        return _Ship;
    }

    @Override
    public Color CreateColor() {
        Color _Color = new Blue();
        System.out.println("Ally Ship Color is Blue");
        return _Color;
    }

}
