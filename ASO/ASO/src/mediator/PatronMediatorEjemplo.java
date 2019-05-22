
package mediator;

public class PatronMediatorEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ISalonDeChat s = new SalonDeChat();
        ISalonDeChat p = new SalonDeChatPrivado();
        
        Usuario u1 = new Usuario(s);
        u1.setNombreU("Diego");
        s.registra(u1);
        Usuario u2 = new Usuario(s);
        u2.setNombreU("Fernando");
        s.registra(u2);
        Usuario u3 = new Usuario(s);
        u3.setNombreU("Natalia");
        s.registra(u3);
        u1.envia("Fernando", "Buenas");
        u2.envia("Natalia", "Hola");
        s.buscar("Natalia");
        
        Usuario u4 = new Usuario(p);
        u4.setNombreU("Jose");
        p.registra(u4);
        Usuario u5 = new Usuario(p);
        u5.setNombreU("Camila");
        p.registra(u5);
        
        u5.envia("Jose", "Hola");
        
        p.bloquear("Camila");
        u5.isBloqueado();
        u4.envia("Camila", "Hola");
        p.desbloquear("Camila");
        u5.isBloqueado();
        p.buscar("Jose");
        u4.envia("Camila", "¿Como estas?");
        p.invitar(u1);
        
        u5.envia("Diego", "Hola Diego");
        
        p.registra(u1);
    }

}
