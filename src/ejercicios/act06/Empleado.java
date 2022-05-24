package ejercicios.act06;

class Empleado extends Persona{
    private double salario;

    public Empleado(String n, int e, double s){
        super(n,e);
        this.salario = s;
    }

    public String toString(){
        return "Nombre: "+ this.nombre +
                "\nSalario: "+ this.salario;
    }
}
