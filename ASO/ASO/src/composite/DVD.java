
package composite;

public class DVD implements IBox{
    
    protected static double _Weight = 50.0; 
    protected int _NDVDs;
    
    @Override
    public void AddIBox() {
        _NDVDs = _NDVDs + 1;
    }

    @Override
    public double GetWeight() {
        return _NDVDs * _Weight;
    }
    
    @Override
    public boolean AddItem(IBox _IBox){
        return false;
    }
}
