
package abstractfactory.ufoshipfactory;

import abstractfactory.color.Blue;
import abstractfactory.color.Color;
import abstractfactory.ufoship.AllyUFO;
import abstractfactory.ufoship.UFOShip;

/**
 This is Factory 1
 **/

public class AllyBlueUFO implements UFOShipFactory{

    @Override
    public UFOShip createShip() {
        UFOShip _Ship = new AllyUFO();
        System.out.println("Ally Ship Created");
        return _Ship;
    }

    @Override
    public Color createColor() {
        Color _Color = new Blue();
        System.out.println("Ally Ship Color is Blue");
        return _Color;
    }

}
