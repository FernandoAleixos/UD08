package ejercicios.polimorfismo;

public class Carpintero extends Obrero implements Montador {

    public Carpintero() {
        System.out.println("Se crea Carpintero");
    }

    public void saluda(){
        System.out.println("Hola, soy Obrero");
    }

    @Override
    public void montar(String x) {

    }

    @Override
    public void desmontar(String x) {

    }
}
