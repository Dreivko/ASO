
package chainofresponsability;

public abstract class Person {
    
    protected Person _Next; 
    
    protected abstract String getDescription();
    
    protected abstract String giveNormalPermission();
    
    protected abstract void giveSpecialPermission(int _PermissionDays);
    
    public void setNext(Person _Next){
        this._Next = _Next;
    }
    
    protected abstract void processRequest(int _PermissionDays);
}
