package actividades.act1;

public class Estudiante extends Persona{
    private String curso;

    public Estudiante(String curso, String nombre, String apellidos, int numIdentificacion, String estadoCivil) {
        super(nombre, apellidos, numIdentificacion, estadoCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + "curso = " + curso;
    }
}
