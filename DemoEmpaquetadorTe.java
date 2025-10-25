public class DemoEmpaquetadorTe {
    public static void main(String[] args) {
        System.out.println("Demo Empaquetador de Té...");

        CajaGrande paquete1 = new CajaGrande();
        paquete1.agregarObjeto(new CajaPequena(false)); // blanco
        paquete1.agregarObjeto(new CajaPequena(false)); // blanco
        paquete1.agregarObjeto(new CajaPequena(true));  // verde

        CajaGrande paquete2 = new CajaGrande();
        paquete2.agregarObjeto(new CajaPequena(true));  // verde
        paquete2.agregarObjeto(new CajaPequena(true));  // verde
        paquete2.agregarObjeto(new CajaPequena(false)); // blanco

        CajaGrande envioAsia = new CajaGrande();
        envioAsia.agregarObjeto(paquete1);
        envioAsia.agregarObjeto(paquete2);

        int totalEnvio = envioAsia.cuentaPaquetes();
        System.out.println("El envío a Asia contiene " + totalEnvio + " unidades de té");
    }
}
