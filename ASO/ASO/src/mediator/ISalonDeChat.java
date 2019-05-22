
package mediator;

public interface ISalonDeChat {

    public abstract void registra(Usuario usuarios);

    public abstract void envia(String de, String a, String msg);
    
    public void bloquear(String a);
    
    public void desbloquear (String a);
    
    public void invitar (Usuario u);
    
    public void buscar (String user);
}
