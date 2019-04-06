
package proxy;

public class ProxyAnimation implements Animation{
    
    protected Song _Song = new Song();
    protected String _Photo = "Show Photo";
    
    @Override
    public void draw() {
        if(_Song != null){
            _Song.draw();
        }else{
            draw(_Photo);
        }        
    }

    @Override
    public void clic() {
        if(_Song == null){
            _Song = new Song();
            _Song.load();
        }
        _Song.play();        
    }
    
    public void draw(String Photo){
        System.out.println(Photo);
    }

    @Override
    public String loadSong() {
        return _Song.loadSong();
    }

    
}
