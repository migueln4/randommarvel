package Logica;

import Elementos.Villano;

public class GenerarEscenario {

    private static GenerarEscenario generador;
    private StringBuilder imprimir;
    private Configurador c;

    private GenerarEscenario() {
        this.imprimir = new StringBuilder("El villano es: ");
        c = Configurador.getConfigurador();
        iniciar();
    }

    public static GenerarEscenario getGenerador() {
        if(generador == null) {
            generador = new GenerarEscenario();
        }
        else {
            System.out.println("Ya existe un generador único.");
        }
        return generador;
    }

    private void iniciar() {
        int indiceVillano = (int) (Math.random()*c.getVillanos().size());

        Villano villanoElegido = c.getVillanos().get(indiceVillano);
        this.imprimir.append(villanoElegido.getNombre().toUpperCase()).append("\n").append("Dificultad: ");
        int nivelDificultad = (int) (Math.random()*villanoElegido.getNivelesDificultad()+1);

        if(villanoElegido.equals("Brigada de Demolición")) {
            switch(nivelDificultad) {
                case 1:
                    this.imprimir.append("A").append("\n");
                    break;
                case 2:
                    this.imprimir.append("B").append("\n");
                    break;
                case 3:
                    this.imprimir.append("AB").append("\n");
                    break;
            }
        } else {
            switch(nivelDificultad) {
                case 1:
                    this.imprimir.append("Normal").append("\n").append("Conjuntos modulares: \n");
                    this.imprimir.append(" - ").append("Normal").append("\n");
                    break;
                case 2:
                    this.imprimir.append("Experto").append("\n").append("Conjuntos modulares: \n");
                    this.imprimir.append(" - ").append("Normal").append("\n");
                    this.imprimir.append(" - ").append("Experto").append("\n");
                    break;
            }
        }
        if(villanoElegido.getConjuntosObligados() != null) {
            for(int i = 0; i<villanoElegido.getConjuntosObligados().size(); i++) {
                this.imprimir.append(" - ").append(villanoElegido.getConjuntosObligados().get(i)).append("\n");
            }
        }
        if(villanoElegido.getNumeroConjuntos() > 0) {
            for (int i = 0; i < villanoElegido.getNumeroConjuntos(); i++) {
                int numAleatorio = (int) (Math.random() * c.getListaConjuntos().size());
                this.imprimir.append(" - ").append(c.getListaConjuntos().get(numAleatorio).getNombre()).append("\n");
                c.getListaConjuntos().remove(numAleatorio);
            }
        }
    }

    public String imprimirResultado() {
        return imprimir.toString();
    }

}
