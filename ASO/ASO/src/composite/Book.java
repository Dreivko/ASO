
package composite;

public class Book implements IBox{
    
    protected double _Weight = 250.0;
    protected int _NBooks;
    
    @Override
    public void addIBox() {
        _NBooks = _NBooks + 1;
    }

    @Override
    public double getWeight() {
        return _NBooks * _Weight;
    }
    
    @Override
    public boolean addItem(IBox _IBox){
        return false;
    }
}
