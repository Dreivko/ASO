
package interpreter;


public class ASCIIExpression implements Expression{
    
    String _Data;
    
    public ASCIIExpression(String _Data){
        this._Data = _Data;
    }
    
    @Override
    public void interpreter(String _Str) {
        TextToASCII _Ascii = new TextToASCII(_Str);
        _Ascii.convert();
    }
    
    @Override
    public void interpreter (){
        TextToASCII _Ascii = new TextToASCII(_Data);
        _Ascii.convert();
    }
}
