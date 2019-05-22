
package interpreter;

public class TextToHex {
    protected String _ToConvert;
    protected char character; 
    protected int hex;
    
    public TextToHex(String _ToConvert ){
        this._ToConvert = _ToConvert;
    }
    
    public void convert(){
        for ( int i = 0 ; i < _ToConvert.length() ; i++){
            character = _ToConvert.charAt(i);
            hex = (int) character;
            System.out.print(Integer.toHexString(hex) + " ");
        }
        System.out.println();
    }
    
}
