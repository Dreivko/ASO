
package abstractFactory.UFOShipFactory;

import abstractFactory.Color.Red;
import abstractFactory.Color.Color;
import abstractFactory.UFOShip.EnemyUFO;
import abstractFactory.UFOShip.UFOShip;

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
