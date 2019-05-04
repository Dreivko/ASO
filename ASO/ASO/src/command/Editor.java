
package command;

import java.util.*;

/**
 Invoker
 **/

public class Editor {
    protected List<Text> _TextInTail = new ArrayList<Text>();
    protected List<UndoCommand> _UndoCommands = new ArrayList<UndoCommand>();
    protected List<RedoCommand> _RedoCommands = new ArrayList<RedoCommand>();
    
    public void executeCommand(Command _Command){
        
        if(_Command instanceof RedoCommand){
            _RedoCommands.add(0, (RedoCommand) _Command);
            _Command.addText(_TextInTail);
        }else if (_Command instanceof UndoCommand){
            _UndoCommands.add(0, (UndoCommand) _Command);
            _Command.addText(_TextInTail);
        }else{
            System.out.println(_Command.toString() + "Is not valid command");
        }
    }
    
    public void cancelCommand(int _Index, char _Command){
        switch (_Command) {
            case 'R':
                _RedoCommands.get(_Index).deleteText();
                break;
            case 'U':
                _UndoCommands.get(_Index).deleteText();
                break;
            default:
                System.out.println(_Command + " Is not valid command");
                break;
        }
    }
    
    public void restoreCommand(int _Index, char _Command){
        switch (_Command) {
            case 'R':
                _RedoCommands.get(_Index).modifyText();
                break;
            case 'U':
                _UndoCommands.get(_Index).modifyText();
                break;
            default:
                System.out.println(_Command + " Is not valid command");
                break;
        }
    }
    
    public void addText(Text _Text){
        _TextInTail.add(_Text);
    }
    
    public void show(){
        for (Text _Text : _TextInTail){
            _Text.show();
        }
    }
    
}
