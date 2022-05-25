package mascotas;

public class Canario extends Ave{

    private String color;
    private boolean canta;


    public void muestra() {
        System.out.println("Canario {" +
                "color = " + color +
                ", canta = " + canta + '}');
    }

    @Override
    public void volar() {

    }

    @Override
    public void habla() {

    }
}
