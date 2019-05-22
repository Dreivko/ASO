package interpreter;

public class Base64Expression implements Expression{
    String _Data;
    
    public Base64Expression(String _Data){
        this._Data = _Data;
    }
    
    @Override
    public void interpreter(String _Str) {
        TextToBase64 _Base = new TextToBase64(_Str);
        _Base.convert();
    }
    
    @Override
    public void interpreter (){
        TextToBase64 _Base = new TextToBase64(_Data);
        _Base.convert();
    }
}
