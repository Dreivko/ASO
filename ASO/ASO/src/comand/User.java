
package comand;

/**
 Client
 **/

public class User {
    
    public static void main(String[] args){
        Text _Text1 = new Text("Digimon");
        Text _Text2 = new Text("Pokemon");

        Editor _Editor = new Editor();
        Editor _Editor2 = new Editor();
        
        _Editor.addText(_Text1);
        _Editor2.addText(_Text2);
        _Editor.show();
        _Editor2.show();
        System.out.println();
        
        
        RedoCommand _RC = new RedoCommand(" Evolution");
        _Editor.executeCommand(_RC);
        _Editor.executeCommand(_RC);
        _Editor.executeCommand(_RC);
        _Editor.executeCommand(_RC);
        System.out.println("After RedoCommand");
        _Editor.show();
        System.out.println();
        
        UndoCommand _UC = new UndoCommand(" Evolution");
        _Editor.executeCommand(_UC);
        UndoCommand _UC2 = new UndoCommand("Digimon");
        _Editor.executeCommand(_UC2);
        _Editor.executeCommand(_UC2);
        System.out.println("After UndoCommand");
        _Editor.show();
        System.out.println();
        
        /*
        _Editor.cancelCommand(0, 'R');
        System.out.println("After Cancel Redo");
        _Editor.show();
        System.out.println();
        
        _Editor.restoreCommand(0, 'R');
        System.out.println("After Restore Redo");
        _Editor.show();
        System.out.println();
        */
        
        /*
        UndoCommand _UC = new UndoCommand("Digimon");
        _Editor.executeCommand(_UC);
        System.out.println("After UndoCommand");
        _Editor.show();
        System.out.println();
        */
        /*
        UndoCommand _UC2 = new UndoCommand("Digimon");
        _Editor.executeCommand(_UC2);
        //System.out.println("After UndoCommand2");
        _Editor.show();
        System.out.println();*/
        /*
        _Editor.cancelCommand(0, 'U');
        System.out.println("After Cancel Undo");
        _Editor.show();
        System.out.println();
        
        _Editor.restoreCommand(0, 'U');
        System.out.println("After Restore Undo");
        _Editor.show();
        System.out.println();*/
        
        

        
        /*
        UndoCommand _UC = new UndoCommand("Evolution");
        _Editor.executeCommand(_UC);
        System.out.println("After UndoCommand");
        _Editor.show();
        System.out.println();
        
        _Editor.cancelCommand(0, 'U');
        System.out.println("After Cancel Undo");
        _Editor.show();
        System.out.println();
        
        _Editor.restoreCommand(0, 'U');
        System.out.println("After Restore Undo");
        _Editor.show();
        System.out.println();
        */
        /*
        RedoCommand _RC = new RedoCommand("This is redo");
        _Editor.executeCommand(_RC);
        System.out.println("After RedoCommand");
        _Editor.show();
        System.out.println();
        */
        
        
    }
}
