
package interpreter;

import java.util.Base64;

public class TextToBase64 {
    protected String _ToConvert;
    
    public TextToBase64(String _ToConvert){
        this._ToConvert = _ToConvert;
    }
    
    public void convert(){
        byte[] bytesEncoded = Base64.getEncoder().encode(_ToConvert.getBytes());
        System.out.println(bytesEncoded);
    }
    
    public byte[] encode(){
        byte[] bytesEncoded = Base64.getEncoder().encode(_ToConvert.getBytes());
        return bytesEncoded;
    }
    
    public void decode(byte[] bytesEncoded){
      byte[] valueDecoded = Base64.getDecoder().decode(bytesEncoded);
      System.out.println( new String(valueDecoded));
    }
    
}
