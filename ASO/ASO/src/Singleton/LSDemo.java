
package Singleton;

public class LSDemo {
    
    public static void main(String[] args){
        LightSensor ls = LightSensor.getInstance();
        System.out.println("Singleton 1");
        System.out.println(ls);
        LightSensor ls2 = LightSensor.getInstance();
        System.out.println("Singleton 2");
        System.out.println(ls);
    
    }
    
}
