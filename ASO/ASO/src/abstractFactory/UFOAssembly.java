
package abstractFactory;

import abstractFactory.UFOShipFactory.AllyBlueUFO;
import abstractFactory.UFOShipFactory.EnemyRedUFO;
import abstractFactory.UFOShipFactory.UFOShipFactory;

public class UFOAssembly {
    
    public static void main(String[] args){
        
        UFOShipFactory _AllyUFO = new AllyBlueUFO();
        UFOShipFactory _EnemyUFO = new EnemyRedUFO();
        
        _AllyUFO.CreateShip();
        _AllyUFO.CreateColor();
        
        
        _EnemyUFO.CreateShip();
        _EnemyUFO.CreateColor();
        
        
        
    }
    
    
}
