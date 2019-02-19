
package builder;

public abstract class DocumentBuilder {
    
    protected Document _Document;
    
    public abstract void SetClient(String _ClientName, String _ClientID);
    
    public Document Result(){
        return _Document;
    }
}
