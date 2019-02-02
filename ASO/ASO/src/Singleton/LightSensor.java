package Singleton;

public final class LightSensor {
    private static volatile LightSensor instance = null;
    
    private LightSensor() {}
    
    public static LightSensor getInstance(){
        if(instance == null){
            synchronized(LightSensor.class){
                if (instance == null ){
                    instance = new LightSensor();
                }
            }
        }
        return instance;
    }
}
