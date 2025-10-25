public class CajaPequena implements Empaquetable {
    private boolean esVerde;
    public CajaPequena(boolean esVerde) {
        this.esVerde = esVerde;
        if (esVerde) {
            System.out.println("Añado una caja de Te Verde");
        } else {
            System.out.println("Añado una caja de Te Blanco");
        }
    }

    @Override
    public int cuentaPaquetes() {
        if(esVerde) {
            return 24;
        } else {
            return 60;
        }
    }
}