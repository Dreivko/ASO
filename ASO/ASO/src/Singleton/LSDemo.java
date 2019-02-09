/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author jorge_000
 */
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
