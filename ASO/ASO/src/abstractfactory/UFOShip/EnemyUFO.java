
package abstractfactory.ufoship;

/**
 This is Product A2
 **/

public class EnemyUFO implements UFOShip{

    private String _Size = "S";
    private String _Weapon = "Bazooka";
    
    @Override
    public String getSize() {
        return _Size;
    }

    @Override
    public String getWeapon() {
        return _Weapon;
    }
    
}
