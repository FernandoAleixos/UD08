package actividades.act1;

public class Profesor extends Empleado{
    private String departamento;

    public Profesor(int anyoIncorporacion, int numDespacho, String nombre, String apellido, int identificacion, String estadoCivil, String departamento) {
        super(anyoIncorporacion, numDespacho, nombre, apellido, identificacion, estadoCivil);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + "Departamento = " + departamento;
    }
}
