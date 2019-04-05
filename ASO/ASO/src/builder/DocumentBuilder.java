
package builder;


/**
 This is AbstractBuilder
 **/

public abstract class DocumentBuilder {
    
    protected Document _Document;
    
    public abstract void setClient(String _ClientName, String _ClientID);
    
    public Document result(){
        return _Document;
    }
}
