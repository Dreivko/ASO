
package bridge;

public class DobleCarne implements Hamburguesa{
    
    public DobleCarne(){
    }
    
    @Override
    public void procesar() {
        System.out.println("\tHamburguesa Doble Carne Elaborada");
    }
}