package builder;

public class HTMLDocument extends Document{

    @Override
    public void AddDocument(String _Doc) {
        if (_Doc.startsWith("<HTML>"))
            _Content.add(_Doc);
    }

    @Override
    public void Print() {
        System.out.println("HTML Document");
        for (String s : _Content){
            System.out.println(s);
        }
    }
 
}
