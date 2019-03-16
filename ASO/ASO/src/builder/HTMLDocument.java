package builder;

public class HTMLDocument extends Document{

    @Override
    public void addDocument(String _Doc) {
        if (_Doc.startsWith("<HTML>"))
            _Content.add(_Doc);
    }

    @Override
    public void print() {
        System.out.println("HTML Document");
        for (String s : _Content){
            System.out.println(s);
        }
    }
 
}
