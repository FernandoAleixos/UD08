package actividades.act1;

public class Persona {
    private String nombre;
    private String apellidos;
    private int numIdentificacion;
    private String estadoCivil;

    public Persona(String nombre, String apellidos, int numIdentificacion, String estadoCivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numIdentificacion = numIdentificacion;
        this.estadoCivil = estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", numIdentificacion=" + numIdentificacion +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }
}
