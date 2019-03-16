
package singleton;

public class LSDemo {
    
    public static void main(String[] args){
        LightSensor _LightSensor = LightSensor.getInstance();
        System.out.println("Singleton 1");
        System.out.println(_LightSensor);
        LightSensor _LightSensor2 = LightSensor.getInstance();
        System.out.println("Singleton 2");
        System.out.println(_LightSensor2);
    
    }
    
}
