
package bridge;

public class ElaborarAlimento extends Preparacion {

    public ElaborarAlimento(IProcesar implementador) {
        this.setImplementador(implementador);
    }

    // ------------------------
    @Override
    public void obtener() {
        System.out.println("Preparando Alimento...");
        this.getImplementador().procesar();
    }
}
