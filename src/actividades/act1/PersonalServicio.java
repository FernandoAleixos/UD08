package actividades.act1;

public class PersonalServicio extends Empleado{
    private String seccion;

    public PersonalServicio(int anyoIncorporacion, int numDespacho, String nombre, String apellido, int identificacion, String estadoCivil, String seccion) {
        super(anyoIncorporacion, numDespacho, nombre, apellido, identificacion, estadoCivil);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return super.toString() + "seccion = " + seccion;
    }
}
