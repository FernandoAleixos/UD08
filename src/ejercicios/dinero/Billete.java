package ejercicios.dinero;

public class Billete extends Dinero{

    protected double altura;
    protected double anchura;

    public Billete(double valor, int anyoEmision, double altura, double anchura) {
        super(valor, anyoEmision);
        this.altura = altura;
        this.anchura = anchura;
    }

    @Override
    public String toString() {
        return "BILLETE" + super.toString() + "altura = " + altura + "anchura = " + anchura;
    }
}
