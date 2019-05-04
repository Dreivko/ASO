
package command;

import java.util.*;

/**
 Concrete Command
 **/

public class UndoCommand implements Command{
    
    protected List<Text> _TextITail = new ArrayList<Text>();
    protected String _TextU;
    
    public UndoCommand(String _Text){
        this._TextU = _Text;
    }
    
    @Override
    public void modifyText() {
        for (Text _Text : _TextITail ){
            if(_Text._Text.equals("")){
                System.out.println("You can't undo");
            }else{
                String _NewText = _Text._Text.replace(_TextU, "");
                _Text.updateText(_NewText);
            }
        }
    }

    @Override
    public void deleteText() {
        for (Text _Text : _TextITail ){
            String _NewText = _Text._Text.concat(_TextU);
            _Text.updateText(_NewText);
            }
    }

    @Override
    public void addText(List<Text> _Texts) {
        _TextITail.clear();
        for (Text _Text : _Texts ){
            _TextITail.add(_Text);
        }
        
        for (Text _Text : _TextITail ){
            if(_Text._Text.equals("")){
                System.out.println("You can't undo");
            }else{
                String _NewText = _Text._Text.replace(_TextU, "");
                _Text.updateText(_NewText);
            }
        }
    }
    
}
