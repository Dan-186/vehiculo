
class Avion {
    private String modelo;
    private boolean vuelo;

    public Avion(String modelo) {
        this.modelo = modelo;
        this.vuelo = false;
    }

    public void despegar() {
        if (!vuelo) {
            vuelo = true;
            System.out.println("El avión " + modelo + " ya despegó.");
        }
    }

    public void aterrizar() {
        if (vuelo) {
            vuelo = false;
            System.out.println("El avión " + modelo + " ha aterrizado.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Avion avion = new Avion("Boeing 737");
        avion.despegar();
        avion.aterrizar();
    }
}

