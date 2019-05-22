
package interpreter;

public class Client {
    
    public static void main(String[] args){
        
        String _Text = "This is a new world to bin";
        String _Text2 = "This is so odd";
        
        Expression _Interpreter = new Interpreter();
        _Interpreter.interpreter(_Text);
                
        Expression _IBin = new BinaryExpression(_Text2);
        _IBin.interpreter();
        
        Expression _IAE = new ASCIIExpression(_Text2);
        _IAE.interpreter();
        
        Expression _IBase64 = new Base64Expression(_Text2);
        _IBase64.interpreter();
        
        Expression _IHex = new HexExpression(_Text2);
        _IHex.interpreter();
    } 
}
/*Interpreter*/