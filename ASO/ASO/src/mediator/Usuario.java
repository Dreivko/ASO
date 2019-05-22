
package mediator;

public class Usuario implements IUsuarioChat {

    private String nombreU;
    private ISalonDeChat salon;
    private boolean Bloqueado;
    
    public Usuario(ISalonDeChat salonchat) {
        salon = salonchat;
    }

    @Override
    public void recibe(String de, String msg) {
        String str = "el usuario " + de + " te dice: " + msg;
        System.out.println(nombreU + ":" + str);
    }

    @Override
    public void envia(String a, String msg) {
        salon.envia(nombreU, a, msg);
    }

    public String getNombreU() {
        return nombreU;
    }

    public void setNombreU(String nombreU) {
        this.nombreU = nombreU;
    }

    public boolean isBloqueado() {
        //System.out.println(Bloqueado);
        return Bloqueado;
    }

    public void setBloqueado(boolean Bloqueado) {
        this.Bloqueado = Bloqueado;
    }

    
}
