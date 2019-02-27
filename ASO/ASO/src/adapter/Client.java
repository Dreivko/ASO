
package adapter;

public class Client {
    public static void main(String [] args){
        
        Vehicle _Car, _WoodTruck, _Carriage, _Tricycle;
        
        _Car = new Car();
        _Car.SpeedUp();
        _Car.Brake();
        
        System.out.println();
        
        _WoodTruck = new WoodTruck();
        _WoodTruck.SpeedUp();
        _WoodTruck.Brake();
        
        System.out.println();
        
        _Carriage = new Carriage();
        _Carriage.SpeedUp();
        _Carriage.Brake();
        
        System.out.println();
        
        _Tricycle = new Tricycle();
        _Tricycle.SpeedUp();
        _Tricycle.Brake();
        
    }
}
