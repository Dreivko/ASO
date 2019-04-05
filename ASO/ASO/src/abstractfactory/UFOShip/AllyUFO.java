
package abstractfactory.ufoship;

/**
 This is Product A1
 **/

public class AllyUFO implements UFOShip{
    private String _Size = "M";
    private String _Weapon = "Lasers";
    
    @Override
    public String getSize() {
        return _Size;
    }

    @Override
    public String getWeapon() {
        return _Weapon;
    }
}
