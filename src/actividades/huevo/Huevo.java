package actividades.huevo;

public class Huevo {

    private String tamanyo; //(S, M, L, XL)

    public Huevo(String tamanyo) {
        this.tamanyo = tamanyo;
    }

    @Override
    public String toString() {
        return "Huevo{" + "tamanyo= '" + tamanyo + '}';
    }

    public class Clara {

        private String color;

        public Clara(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "Clara{ " + "color= '" + color + '}';
        }
    }

    public class Yema {

        private String color;

        public Yema(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "Yema{" +
                    "color= '" + color + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Huevo huevo = new Huevo("XL");
        Huevo.Clara clara = huevo.new Clara("azul");
        Huevo.Yema yema = huevo.new Yema("naranja");
    }
}
