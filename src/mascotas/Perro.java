package mascotas;

public class Perro extends Mascota{

    private String raza;
    private boolean tienePulgas;

    public Perro(String nombre, int edad, String estado, String fechaNacimiento) {
        super(nombre, edad, estado, fechaNacimiento);
    }

    public void muestra() {
        System.out.println("Perro{" +
                "raza = " + raza +
                ", tienePulgas = " + tienePulgas +
                '}');
    }

    @Override
    public void habla() {

    }
}
