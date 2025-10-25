public class NotificadorEmail extends EmpaquetableDecorador {

    public NotificadorEmail(Empaquetable wrappee) {
        super(wrappee);
    }

    @Override
    public int cuentaPaquetes() {
        int total = super.cuentaPaquetes();
        enviarEmail(total);
        return total;
    }

    private void enviarEmail(int unidades) {
        System.out.println("📧 Enviando correo electrónico al cliente: " +
                           unidades + " unidades enviadas.");
    }
}
