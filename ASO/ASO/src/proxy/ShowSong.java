
package proxy;

public class ShowSong{
    
    public static void main(String [] args){
        Animation _Animation = new ProxyAnimation();
        _Animation.draw();
        _Animation.clic();
        _Animation.draw();
        System.out.print(_Animation.loadSong());
    }
    
}
