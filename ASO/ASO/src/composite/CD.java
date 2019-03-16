
package composite;

public class CD implements IBox{
    
    protected static double _Weight = 50.0; 
    protected int _NCDs;
    
    @Override
    public void AddIBox() {
        _NCDs = _NCDs + 1;
    }

    @Override
    public double GetWeight() {
        return _NCDs * _Weight;
    }
    
    @Override
    public boolean AddItem(IBox _IBox){
        return false;
    }
}
