
package interpreter;

public class TextToBinary {
    protected String _ToConvert;
    protected byte[] bytes;
    protected StringBuilder binary = new StringBuilder();
    
    public TextToBinary(String _ToConvert ){
        this._ToConvert = _ToConvert;
        this.bytes =  this._ToConvert.getBytes();
    }
    
    public void convert(){
        for (byte b : bytes){
            int val = b;
            for (int i = 0; i < 8; i++){
               binary.append((val & 128) == 0 ? 0 : 1);
               val <<= 1;
            }
            binary.append(' ');
        }
        System.out.println(binary);
    }
    

    
    
    
    /**/
}
