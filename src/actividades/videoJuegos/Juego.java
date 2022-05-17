package actividades.videoJuegos;

public class Juego {

    protected String titulo;
    protected String fabricante;
    protected int anyo;
    public double precio;
    public int copiasDisponibles;

    public Juego(String t, String f, int a) {
        this.titulo = t;
        this.fabricante = f;
        this.anyo = a;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    @Override
    public String toString() {
        return "Título = " + titulo + '\n' + " Fabricante = " + fabricante + '\n' + "Anyo = " + anyo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Juego juego = (Juego) o;

        if (anyo != juego.anyo) return false;
        if (titulo != null ? !titulo.equals(juego.titulo) : juego.titulo != null) return false;
        return fabricante != null ? fabricante.equals(juego.fabricante) : juego.fabricante == null;
    }

    public int compareTo(Object o) {
        Juego juego = (Juego) o;

        if (this.getTitulo().equals(juego.getTitulo())) {
            if (this.getFabricante().equals(juego.getFabricante())) {
                return (this.getAnyo() - juego.getAnyo());
            }
            return (this.getFabricante().compareTo(juego.getFabricante()));
        } else {
            return this.getTitulo().compareTo(juego.getTitulo());
        }
    }
}
