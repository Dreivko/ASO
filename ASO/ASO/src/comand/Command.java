
package comand;

import java.util.List;

/**
 Command
 **/

public interface Command {

    void modifyText();
    void deleteText();
    void addText(List<Text> _Texts);
}
