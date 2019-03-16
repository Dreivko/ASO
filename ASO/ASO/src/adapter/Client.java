
package adapter;

public class Client {
    public static void main(String [] args){
        
        Vehicle _Car, _WoodTruck, _Carriage, _Tricycle;
        
        _Car = new Car();
        _Car.speedUp();
        _Car.brake();
        
        System.out.println();
        
        _WoodTruck = new WoodTruck();
        _WoodTruck.speedUp();
        _WoodTruck.brake();
        
        System.out.println();
        
        _Carriage = new Carriage();
        _Carriage.speedUp();
        _Carriage.brake();
        
        System.out.println();
        
        _Tricycle = new Tricycle();
        _Tricycle.speedUp();
        _Tricycle.brake();
        
    }
}
