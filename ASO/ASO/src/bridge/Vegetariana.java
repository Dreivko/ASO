
package bridge;

public class Vegetariana implements Hamburguesa{
    
    public Vegetariana(){
    }
    
    @Override
    public void procesar() {
        System.out.println("\tHamburguesa Vegetariana Elaborada");
    }
}
