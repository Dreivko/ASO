
package mediator;

import java.util.HashMap;

public class SalonDeChat implements ISalonDeChat {

    private HashMap<String, Usuario> usuarios = new HashMap<String, Usuario>();

    @Override
    public void registra(Usuario usuarios) {
        this.usuarios.put(usuarios.getNombreU(), usuarios);
    }

    @Override
    public void envia(String de, String a, String msg) {
        if (usuarios.containsKey(de) && usuarios.containsKey(a)) {
            Usuario u = usuarios.get(a);
            if(u.isBloqueado() == true){
                System.out.println("El usuario esta bloqueado");
            }else{
                u.recibe(de, msg);
            }
            
        } else {
            System.out.println("El usuario no existe");
        }
    }

    @Override
    public void bloquear(String a) {
        if (usuarios.containsKey(a)) {
            Usuario u = usuarios.get(a);
            System.out.println(u.getNombreU() + " ha sido Bloqueado");
            u.setBloqueado(true);
        } else {
            System.out.println("El usuario no existe");
        }
    }

    @Override
    public void desbloquear(String a) {
        if (usuarios.containsKey(a)) {
            Usuario u = usuarios.get(a);
            System.out.println(u.getNombreU() + " ha sido Desbloqueado");
            u.setBloqueado(false);
        } else {
            System.out.println("El usuario no existe");
        }
    }

    @Override
    public void invitar(Usuario u) {
        System.out.println(u.getNombreU() + " Has sido invitado a la sala");
        registra(u);
    }

    @Override
    public void buscar(String user) {
        if (usuarios.containsKey(user)) {
            Usuario u = usuarios.get(user);
            System.out.println(u.getNombreU() + " Encontrado");
        } else {
            System.out.println("El usuario no se pudo encontrar");
        }
    }

}
