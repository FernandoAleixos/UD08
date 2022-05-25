package mascotas;

import jdk.internal.org.jline.reader.MaskingCallback;

import java.util.ArrayList;

public class Inventario {

    private static ArrayList<Mascota> animales = new ArrayList<>();

    public static void main(String[] args) {
        Mascota perro = new Perro();
        Mascota gato = new Gato();
        Mascota loro = new Loro();
        Mascota canario = new Canario();

        //Mostrar la lista de animales (solo tipo y nombre, 1 línea por animal)
        for (Mascota m : animales) {
            System.out.println(m.getClass());
            m.morir();
        }
        //Mostrar todos los datos de un animal concreto.
        gato.muestra();
        // Mostrar todos los datos de todos los animales.
        for (Mascota m : animales) {
            m.muestra();
        }
        // Insertar animales en el inventario.
        animales.add(perro);
        animales.add(gato);
        animales.add(loro);
        animales.add(canario);
        // Eliminar animales del inventario.
        animales.remove(canario);
        // Vaciar el inventario.
        animales.clear();
    }
}
