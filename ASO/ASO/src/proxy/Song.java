
package proxy;

public class Song implements Animation {

    
    @Override
    public void draw() {
    }

    @Override
    public void clic() {
        System.out.println("Show Song");
    }
    
    public void play(){
        System.out.println("Play Song");
    }
    
    public void load(){
        System.out.println("Load Song");
    }

    @Override
    public String loadSong() {
        /**Insert Path of the Song**/
        return "Can't get no :P";
    }
    
}
