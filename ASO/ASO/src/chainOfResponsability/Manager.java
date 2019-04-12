
package chainOfResponsability;

public class Manager {
    public static void main (String[] args){
        
        int _PermissionDays = 9;
        int _SpecialPermissionDays = 7;
        
        Person _Coordinator = new Coordinator();
        Person _Director = new Director();
        Person _Dean = new Dean();
        Person _ViceChancellor = new ViceChancellor();
        Person _Rector = new Rector();
        
        _Coordinator.setNext(_Director);
        _Director.setNext(_Dean);
        _Dean.setNext(_ViceChancellor);
        _ViceChancellor.setNext(_Rector);
        
        _Coordinator.processRequest(_PermissionDays);
        _Coordinator.giveSpecialPermission(_SpecialPermissionDays);
        
    }
}
