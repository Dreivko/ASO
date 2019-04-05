package builder;

import java.util.*;


/**
 This is Product
 **/

public abstract class Document {
    
    protected List<String> _Content = new ArrayList<String>();
    
    public abstract void addDocument(String _Doc);
    public abstract void print();
    
}
