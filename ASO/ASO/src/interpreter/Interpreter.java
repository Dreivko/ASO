
package interpreter;

public class Interpreter implements Expression{
    
    
    @Override
    public void interpreter(String _ToInterpret) {
        
        if (_ToInterpret.contains("ASCII")){
            TextToASCII _Ascii = new TextToASCII(_ToInterpret);
            _Ascii.convert();
        }else if(_ToInterpret.contains("HEX")){
            TextToHex _Hex = new TextToHex(_ToInterpret);
            _Hex.convert();
        }else if (_ToInterpret.contains("Base64")){
            TextToBase64 _Base = new TextToBase64(_ToInterpret);
            _Base.convert();
            //_Base.decode(_Base.encode());
        }else if(_ToInterpret.contains("bin")){
            TextToBinary _Bin = new TextToBinary(_ToInterpret);
            _Bin.convert();
        }else{
            System.out.println("I can't find it");
        }
    }
    
    @Override
    public void interpreter (){
        System.out.println("Nothing");
    }
    
}
