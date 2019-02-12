
package abstractFactory.UFOShipFactory;

import abstractFactory.Color.Color;
import abstractFactory.UFOShip.UFOShip;

public interface UFOShipFactory {
    
    public UFOShip CreateShip();
    
    public Color CreateColor ();
}
