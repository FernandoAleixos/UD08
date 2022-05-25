package mascotas;

public abstract class Ave extends Mascota{

    private String pico;
    private boolean vuela;

    public Ave(String nombre, int edad, String estado, String fechaNacimiento) {
        super(nombre, edad, estado, fechaNacimiento);
        this.pico = pico;
        this.vuela = vuela;
    }

    public abstract void volar();
}
