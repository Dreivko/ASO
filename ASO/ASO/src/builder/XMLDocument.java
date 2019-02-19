
package builder;

public class XMLDocument extends Document {
    
    @Override
    public void AddDocument(String _Doc) {
        if (_Doc.startsWith("<XML>"))
            _Content.add(_Doc);
    }

    @Override
    public void Print() {
        System.out.println("XML Document");
        for (String s : _Content){
            System.out.println(s);
        }
    }
}
