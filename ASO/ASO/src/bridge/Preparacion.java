
package bridge;

public abstract class Preparacion {
    
    // Referencia al Implementador
    protected IProcesar implementador;
    protected String nombre;

    
    public IProcesar getImplementador() {
        return this.implementador;
    }

    public void setImplementador(IProcesar implementador) {
        this.implementador = implementador;
    }
    
    // Método a implementar por las clases que hereden
    public abstract void obtener();
}
