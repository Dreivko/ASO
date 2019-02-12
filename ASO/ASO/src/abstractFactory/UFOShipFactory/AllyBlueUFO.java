
package abstractFactory.UFOShipFactory;

import abstractFactory.Color.Blue;
import abstractFactory.Color.Color;
import abstractFactory.UFOShip.AllyUFO;
import abstractFactory.UFOShip.UFOShip;

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
