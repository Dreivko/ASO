
package interpreter;

public class TextToASCII {
    
    protected String _ToConvert;
    protected char character; 
    protected int ascii;
    
    public TextToASCII(String _ToConvert){
        this._ToConvert = _ToConvert;
    }
    
    public void convert(){
        for ( int i = 0 ; i < _ToConvert.length() ; i++){
            character = _ToConvert.charAt(i);
            ascii = (int) character;
            System.out.print(ascii + " ");  
        }
        System.out.println();
    }
    
}
