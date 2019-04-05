
package abstractfactory.ufoshipfactory;

import abstractfactory.color.Color;
import abstractfactory.ufoship.UFOShip;

/**
 This is Abstract Factory
 **/

public interface UFOShipFactory {
    
    public UFOShip createShip();
    
    public Color createColor ();
}
