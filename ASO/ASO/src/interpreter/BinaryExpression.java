
package interpreter;

public class BinaryExpression implements Expression{
    
    String _Data;
    
    public BinaryExpression(String _Data){
        this._Data = _Data;
    }
    
    @Override
    public void interpreter(String _Str) {
        TextToBinary _Bin = new TextToBinary(_Str);
        _Bin.convert();
    }
    
    @Override
    public void interpreter (){
        TextToBinary _Bin = new TextToBinary(_Data);
        _Bin.convert();
    }
}
