
package builder;

public class JSONDocumentBuilder extends DocumentBuilder{
    
    public JSONDocumentBuilder(){
        _Document = new JSONDocument();
    }
    
    @Override
    public void SetClient(String _ClientName, String _ClientID) {
        String _DocumentContent;
        _DocumentContent = "{ \n"  
                         + "    Name: " + '"' + _ClientName + '"' + "\n"
                         + "    Id:  "  + '"' + _ClientID   + '"' + " \n" 
                         + "}";
        _Document.addDocument(_DocumentContent);
    }

}
