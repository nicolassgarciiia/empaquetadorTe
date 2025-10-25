import java.util.ArrayList;
import java.util.List;
public class CajaGrande implements Empaquetable {
    private List<Empaquetable> contenido;

    public CajaGrande() {
        System.out.println("Añado una caja de Paquete de cajas");
        contenido = new ArrayList<>();
        this.contenido = new ArrayList<>();
    }

    public void agregarObjeto(Empaquetable objeto) {
        contenido.add(objeto);
    }

    public void remove(Empaquetable e) {
        contenido.remove(e);
    }

    @Override
    public int cuentaPaquetes() {
        int total = 0;
        for (Empaquetable e : contenido) {
            total += e.cuentaPaquetes();
        }
        System.out.println("Este paquete consta de " + total + " unidades");
        return total;
    }
}