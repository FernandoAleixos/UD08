package ejercicios.dinero;

public abstract class Dinero {

    protected double valor;
    protected int anyoEmision;

    public Dinero(double valor, int anyoEmision) {
        this.valor = valor;
        this.anyoEmision = anyoEmision;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dinero dinero = (Dinero) o;

        if (Double.compare(dinero.valor, valor) != 0) return false;
        return anyoEmision == dinero.anyoEmision;
    }

    public int compareTo(Object o) {
        Dinero money = (Dinero) o;

        if (this.anyoEmision == money.anyoEmision) {
            if (this.valor == money.valor) {
                return 0;
            } else if (this.valor > money.valor) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return this.anyoEmision - money.anyoEmision;
        }
    }

    @Override
    public String toString() {
        return "Valor = " + valor + "\nAño de emisión = " + anyoEmision;
    }
}
