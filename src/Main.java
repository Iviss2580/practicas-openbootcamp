public class Main {
    public static void main(String[] args) {

        Coche miCoche = new Coche();
        miCoche.SumarPuertas();
        miCoche.SumarPuertas();
        System.out.println(miCoche.puertas);
    }


    static class Coche {
        public int puertas = 4;

        public void SumarPuertas() {
            this.puertas++;
        }
    }
}



