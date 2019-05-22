
package interpreter;

public class HexExpression implements Expression{
    String _Data;
    
    public HexExpression(String _Data){
        this._Data = _Data;
    }
    
    @Override
    public void interpreter(String _Str) {
        TextToHex _Hex = new TextToHex(_Str);
        _Hex.convert();
    }
    
    @Override
    public void interpreter (){
        TextToHex _Hex = new TextToHex(_Data);
        _Hex.convert();
    }
}
