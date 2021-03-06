
package chainofresponsability;

public class ViceChancellor extends Person{
        
    @Override
    protected String giveNormalPermission(){
        return "Normal Permission";
    }
    
    @Override
    protected void giveSpecialPermission(int _PermissionDays){
        if (_PermissionDays <= 5 ){
            System.out.println(getDescription() + " i can give you that kind of permission");
        }else{
            System.out.println(getDescription() + " i can't give you that kind of permission");
            this._Next.giveSpecialPermission(_PermissionDays);
        }
    }
    
    @Override
    protected String getDescription() {
        return "I'm Vice Chancellor";
    }
    
    @Override
    protected void processRequest(int _PermissionDays){
        if (_PermissionDays > 5 && _PermissionDays <= 8){
            System.out.println(getDescription() +  " I'll process this");
            System.out.println(giveNormalPermission());
        }else{
            this._Next.processRequest(_PermissionDays);
        }
    }
}
