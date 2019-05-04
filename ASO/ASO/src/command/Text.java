
package command;

/**
 Receiver
 **/

public class Text {
    protected String _Text;
    
    public Text(String _Text){
        this._Text = _Text;
    }    
    
    public void updateText(String _Text){
        this._Text = _Text;
    }

    public void show(){
        System.out.println(_Text);
    }
    
}
