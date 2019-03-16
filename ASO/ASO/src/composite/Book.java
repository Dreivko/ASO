
package composite;

public class Book implements IBox{
    
    protected double _Weight = 250.0;
    protected int _NBooks;
    
    @Override
    public void AddIBox() {
        _NBooks = _NBooks + 1;
    }

    @Override
    public double GetWeight() {
        return _NBooks * _Weight;
    }
    
    @Override
    public boolean AddItem(IBox _IBox){
        return false;
    }
}
