
package builder;

public class JSONDocument extends Document{
    
    @Override
    public void addDocument(String _Doc) {
        if (_Doc.startsWith("{"))
            _Content.add(_Doc);
    }

    @Override
    public void print() {
        System.out.println("JSON Document");
        for (String s : _Content){
            System.out.println(s);
        }
    }
}
