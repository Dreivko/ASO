
package abstractfactory.ufoshipfactory;

import abstractfactory.color.Red;
import abstractfactory.color.Color;
import abstractfactory.ufoship.EnemyUFO;
import abstractfactory.ufoship.UFOShip;

public class EnemyRedUFO implements UFOShipFactory {
    @Override
    public UFOShip CreateShip() {
        UFOShip _Ship = new EnemyUFO();
        System.out.println("Enemy Ship Created");
        return _Ship;
    }

    @Override
    public Color CreateColor() {
        Color _Color = new Red();
        System.out.println("Enemy Ship Color is Red");
        return _Color;
    }
}
