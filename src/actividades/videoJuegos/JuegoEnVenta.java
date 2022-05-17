package actividades.videoJuegos;

public class JuegoEnVenta extends Juego {

    public JuegoEnVenta(String t, String f, int a) {
        super(t, f, a);
        this.copiasDisponibles = copiasDisponibles;
        this.precio = precio;
    }

    public void vender() {
        copiasDisponibles--;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
