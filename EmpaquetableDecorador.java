public abstract class EmpaquetableDecorador implements Empaquetable {
    protected Empaquetable wrappee;

    public EmpaquetableDecorador(Empaquetable wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public int cuentaPaquetes() {
        return wrappee.cuentaPaquetes(); // delega al objeto original
    }
}
