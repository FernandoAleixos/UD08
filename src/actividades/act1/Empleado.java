package actividades.act1;

public class Empleado extends Persona{
    private int anyoIncorporacion;
    private int numDespacho;

    public Empleado(int anyoIncorporacion, int numDespacho, String nombre, String apellido, int identificacion, String estadoCivil) {
        super(nombre, apellido, identificacion, estadoCivil);
        this.anyoIncorporacion = anyoIncorporacion;
        this.numDespacho = numDespacho;
    }

    public int getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
    }

    @Override
    public String toString() {
        return super.toString() + "Despacho = " + numDespacho;
    }
}
