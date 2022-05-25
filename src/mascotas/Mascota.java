package mascotas;

public abstract class Mascota {
    private String nombre;
    private int edad;
    private String estado;
    private String fechaNacimiento;

    public Mascota(String nombre, int edad, String estado, String fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
    }

    public abstract void muestra();

    public void cumpleanyos() {

    }

    public void morir() {
        this.estado = "Difunto";
    }

    public void habla(){
        System.out.println("Mascota habla");
    };
}
