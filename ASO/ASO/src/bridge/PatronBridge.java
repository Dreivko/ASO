
package bridge;

public class PatronBridge {

    public static void main(String[] args) {
        
        Pasta _Bolonesa = new Bolonesa();
        
        // Crear un objeto de tipo 'AbstraccionRefinada' indicándole un 'ImplementadorConcreto'
        Preparacion _TipoDePasta = new ElaborarAlimento(_Bolonesa);
        _TipoDePasta.obtener();
        // Ahora le indicamos que use otra implementación para obtener la de verduras
        _TipoDePasta.setImplementador(new Espinacas());
        _TipoDePasta.obtener();
        _TipoDePasta.setImplementador(new Pesto());
        _TipoDePasta.obtener();
        
        
        Hamburguesa _TodoTerreno = new TodoTerreno();
        Preparacion _TipoDeHamburguesa = new ElaborarAlimento(_TodoTerreno);
        _TipoDeHamburguesa.obtener();
        // Ahora le indicamos que use otra implementación para obtener la de verduras
        _TipoDeHamburguesa.setImplementador(new Vegetariana());
        _TipoDeHamburguesa.obtener();
        _TipoDeHamburguesa.setImplementador(new DobleCarne());
        _TipoDeHamburguesa.obtener();
        
        PerroCaliente _PerroCaliente = new ChoriPerro();
        Preparacion _TipoDePerroCaliente = new ElaborarAlimento(_PerroCaliente);
        _TipoDePerroCaliente.obtener();
        // Ahora le indicamos que use otra implementación para obtener la de verduras
        _TipoDePerroCaliente.setImplementador(new Sencillo());
        _TipoDePerroCaliente.obtener();
        _TipoDePerroCaliente.setImplementador(new Transmilenio());
        _TipoDePerroCaliente.obtener();
        
        

    }

}
