package mascotas;

public class Gato extends Mascota{

    private String color;
    private boolean peloLargo;

    public Gato(String nombre, int edad, String estado, String fechaNacimiento) {
        super(nombre, edad, estado, fechaNacimiento);
    }

    public void muestra() {
        System.out.println("Gato{" +
                "color = " + color +
                ", peloLargo = " + peloLargo +
                '}');

    }

    @Override
    public String toString() {
        return "Gato{" +
                "color='" + color + '\'' +
                ", peloLargo=" + peloLargo +
                '}';
    }

    @Override
    public void habla() {

    }
}
