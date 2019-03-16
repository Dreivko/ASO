
package composite;

import java.util.*;

public class Box implements IBox{

    protected List<IBox> _IBoxes = new ArrayList<IBox> ();
    
    @Override
    public void AddIBox() {
    }

    @Override
    public double GetWeight() {
        
        double _Wieght = 0.0;
        
        for (IBox _IB : _IBoxes)
            _Wieght = _Wieght + _IB.GetWeight();
        
        return _Wieght;
    
    }
    
    @Override
    public boolean AddItem(IBox _IBox){
        return _IBoxes.add(_IBox);
    }
    
}
