
package composite;

import java.util.*;

public class Box implements IBox{

    protected List<IBox> _IBoxes = new ArrayList<IBox> ();
    
    @Override
    public void addIBox() {
        System.out.println("Sorry, but this option in unavailable");
    }

    @Override
    public double getWeight() {
        
        double _Wieght = 0.0;
        
        for (IBox _IB : _IBoxes)
            _Wieght = _Wieght + _IB.getWeight();
        
        return _Wieght;
    
    }
    
    @Override
    public boolean addItem(IBox _IBox){
        return _IBoxes.add(_IBox);
    }
    
}
