
package builder;


/**
 This is ConcreteBuilder
 **/

public class HTMLDocumentBuilder extends DocumentBuilder{

    public HTMLDocumentBuilder(){
        _Document = new HTMLDocument();
    }
    
    @Override
    public void setClient(String _ClientName, String _ClientID) {
        String _DocumentContent;
        _DocumentContent = "<HTML> \n"  
                         + "    <h1> " + _ClientName + " </h1> \n"
                         + "    <h2> " + _ClientID   + " </h2> \n" 
                         + "</HTML>";
        _Document.addDocument(_DocumentContent);
    }
    
}
