
package abstractfactory.ufoshipfactory;

import abstractfactory.color.Color;
import abstractfactory.ufoship.UFOShip;

public interface UFOShipFactory {
    
    public UFOShip CreateShip();
    
    public Color CreateColor ();
}
