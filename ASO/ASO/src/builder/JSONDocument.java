
package builder;

public class JSONDocument extends Document{
    
    @Override
    public void AddDocument(String _Doc) {
        if (_Doc.startsWith("{"))
            _Content.add(_Doc);
    }

    @Override
    public void Print() {
        System.out.println("JSON Document");
        for (String s : _Content){
            System.out.println(s);
        }
    }
}
