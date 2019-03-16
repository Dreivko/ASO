
package builder;

public class XMLDocumentBuilder extends DocumentBuilder{
    
    public XMLDocumentBuilder(){
        _Document = new XMLDocument();
    }
    
    @Override
    public void SetClient(String _ClientName, String _ClientID) {
        String _DocumentContent;
        _DocumentContent = "<XML> \n"  
                         + "    <Name> " + _ClientName + " </Name> \n"
                         + "    <Id> "   + _ClientID   + " </id> \n" 
                         + "</XTML>";
        _Document.addDocument(_DocumentContent);
    }

}
