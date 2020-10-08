import Logica.GenerarEscenario;

public class Main {

    public static void main(String[] args) {
        GenerarEscenario ge = GenerarEscenario.getGenerador();
        System.out.println(ge.imprimirResultado());
    }
}