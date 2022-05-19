package ejercicios.dinero;

public class TestDinero {

    public static void main(String[] args) {
        Moneda moneda = new Moneda(0.5, 2020, 30, 30);
        Billete billete = new Billete(5, 2021, 70, 150);

        System.out.println(moneda);
        System.out.println(billete);
    }
}
