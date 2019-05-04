
package comand;

import java.util.ArrayList;
import java.util.List;

/**
 Concrete Command
 **/

public class RedoCommand implements Command{
    
    protected List<Text> _TextITail = new ArrayList<Text>();
    protected String _TextR;
    
    public RedoCommand(String _Text){
        this._TextR = _Text;
    }
    
    @Override
    public void modifyText() {
        for (Text _Text : _TextITail ){
            String _NewText = _Text._Text.concat(_TextR);
            _Text.updateText(_NewText);
        }
    }

    @Override
    public void deleteText() {
        for (Text _Text : _TextITail ){
            String _NewText = _Text._Text.replace(_TextR, "");
            _Text._Text = _NewText;
            }
    }

    @Override
    public void addText(List<Text> _Texts) {
        _TextITail.clear();
        for (Text _Text : _Texts ){
            _TextITail.add(_Text);
        }
        
        for (Text _Text : _TextITail ){
            String _NewText = _Text._Text.concat(_TextR);
            _Text.updateText(_NewText);
        }
    }
    
}
