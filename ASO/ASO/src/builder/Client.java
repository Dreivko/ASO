
package builder;

import java.util.*;

/**
 This is Client
 **/

public class Client {
    
    public static void main(String[] args){
    
        Scanner _Reader = new Scanner(System.in);
        
        DocumentBuilder _DocumentBuilder;
        
        System.out.println("Do you want a HTML(1) XML(2) or JSON(3)");
        String _Selection = _Reader.next();
        
        switch (_Selection) {
            case "1":
                _DocumentBuilder = new HTMLDocumentBuilder();
                create(_DocumentBuilder);
                break;
            case "2":
                _DocumentBuilder = new XMLDocumentBuilder();
                create(_DocumentBuilder);
                break;
            case "3":
                _DocumentBuilder = new JSONDocumentBuilder();
                create(_DocumentBuilder);
                break;
            default:
                System.out.println("the number is not valid ");
                break;
        }
        
    }
    
    public static void create(DocumentBuilder _DocumentBuilder){
        Builder _Builder = new Builder(_DocumentBuilder);
        Document _Document = _Builder.build("Markus", "1475008");
        _Document.print();
    }
}
