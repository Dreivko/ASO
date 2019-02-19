
package builder;

public class Builder {
    protected DocumentBuilder _Builder;
    
    public Builder(DocumentBuilder _Builder){
        this._Builder = _Builder;
    }
    
    public Document Build(String _ClientName, String _ClientID){
        _Builder.SetClient(_ClientName, _ClientID);
        Document _Document = _Builder.Result();
        return _Document;
    }
    
}
