package actividades.videoJuegos;

public class JuegoEnAlquiler extends Juego {

    private int diasAlquiler;

    public JuegoEnAlquiler(String t, String f, int a, int diasAlquiler) {
        super(t, f, a);
        this.diasAlquiler = diasAlquiler;
    }

    public void alquilar() {
        this.copiasDisponibles--;
    }

    public void devolver() {
        this.copiasDisponibles++;
    }

    @Override
    public String toString() {
        return super.toString() + "Dias de alquiler = " + diasAlquiler;
    }
}
