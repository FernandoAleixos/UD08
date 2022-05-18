package ejercicios.dinero;

public class Moneda extends Dinero{

    protected double diametro;
    protected double peso;

    public Moneda(double valor, int anyoEmision, double diametro, double peso) {
        super(valor, anyoEmision);
        this.diametro = diametro;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return  "MONEDA: \n" + super.toString() + "\nDiametro = " + diametro + "\nPeso = " + peso;
    }
}
