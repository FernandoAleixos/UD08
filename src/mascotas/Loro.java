package mascotas;

public class Loro extends Ave{

    private String origen;
    private boolean habla;

    public void muestra() {
        System.out.println("Loro {" +
                "origen = " + origen +
                ", habla = " + habla +
                '}');
    }

    public void habla() {
    }

    @Override
    public void volar() {

    }
}
