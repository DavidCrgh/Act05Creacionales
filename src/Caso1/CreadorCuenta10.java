package Caso1;

public class CreadorCuenta10 extends FabricaCuentas {

    @Override
    public AbstractCuenta crearCuenta() {
        return new Cuenta10();
    }
}
