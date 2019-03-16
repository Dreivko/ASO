
package builder;

public class Builder {
    protected DocumentBuilder _Builder;
    
    public Builder(DocumentBuilder _Builder){
        this._Builder = _Builder;
    }
    
    public Document build(String _ClientName, String _ClientID){
        _Builder.setClient(_ClientName, _ClientID);
        Document _Document = _Builder.result();
        return _Document;
    }
    
}
