
package abstractfactory.color;

import abstractfactory.ufoship.UFOShip;

/**
 This is Product B
 **/

public interface Color {
    
    public void colorUFO(UFOShip UFO);
    
    public boolean isPrimary ();
    
    public void setIsPrimary();
    
}
