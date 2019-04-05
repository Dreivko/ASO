
package abstractfactory;

import abstractfactory.ufoshipfactory.AllyBlueUFO;
import abstractfactory.ufoshipfactory.EnemyRedUFO;
import abstractfactory.ufoshipfactory.UFOShipFactory;


/**
 This is client
 **/

public class UFOAssembly {
    
    public static void main(String[] args){
        
        UFOShipFactory _AllyUFO = new AllyBlueUFO();
        UFOShipFactory _EnemyUFO = new EnemyRedUFO();
        
        _AllyUFO.createShip();
        _AllyUFO.createColor();
        
        
        _EnemyUFO.createShip();
        _EnemyUFO.createColor();
        
        
        
    }
    
    
}
