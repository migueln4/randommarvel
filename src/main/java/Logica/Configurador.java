package Logica;

import Elementos.ConjuntoModular;
import Elementos.Villano;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
public class Configurador {

    private static Configurador configurador;
    private List<ConjuntoModular> listaConjuntos;
    private List<Villano> villanos;

    // El constructor es privado, no permite que se genere un constructor por defecto.
    private Configurador() {
        this.listaConjuntos = new ArrayList<ConjuntoModular>();
        this.villanos = new ArrayList<Villano>();
        inicializarConjuntos();
        inicializarVillanos();
    }

    public static Configurador getConfigurador() {
        if (configurador == null){
            configurador = new Configurador();
        }
        else{
            System.out.println("Ya existe un configurador único.");
        }

        return configurador;
    }

    private void inicializarConjuntos() {
        //this.listaConjuntos.add(new ConjuntoModular("Normal"));
        //this.listaConjuntos.add(new ConjuntoModular("Experto"));
        this.listaConjuntos.add(new ConjuntoModular("Amenaza de bomba"));
        this.listaConjuntos.add(new ConjuntoModular("Señores del Mal"));
        this.listaConjuntos.add(new ConjuntoModular("Civiles en peligro"));
        this.listaConjuntos.add(new ConjuntoModular("Legiones de Hydra"));
        this.listaConjuntos.add(new ConjuntoModular("La silla del Juicio Final"));
        this.listaConjuntos.add(new ConjuntoModular("Trucos de Duende"));
        this.listaConjuntos.add(new ConjuntoModular("Un auténtico estropicio"));
        this.listaConjuntos.add(new ConjuntoModular("Alta tensión"));
        this.listaConjuntos.add(new ConjuntoModular("Impedimentos"));
        this.listaConjuntos.add(new ConjuntoModular("Fanático Kree"));
        //this.listaConjuntos.add(new ConjuntoModular("Armas experimentales"));
        this.listaConjuntos.add(new ConjuntoModular("Asalto de Hydra"));
        this.listaConjuntos.add(new ConjuntoModular("Patrulla de Hydra"));
        this.listaConjuntos.add(new ConjuntoModular("Maestro de armas"));
        this.listaConjuntos.add(new ConjuntoModular("Temporal"));
        this.listaConjuntos.add(new ConjuntoModular("Anacronautas"));
        this.listaConjuntos.add(new ConjuntoModular("Amo del tiempo"));
    }

    private void inicializarVillanos() {
        villanos.add(new Villano("Rino",2,Boolean.TRUE,Boolean.TRUE,1,null));
        villanos.add(new Villano("Klaw",2,Boolean.TRUE,Boolean.TRUE,1,null));
        villanos.add(new Villano("Ultrón",2,Boolean.TRUE,Boolean.TRUE,1,null));
        villanos.add(new Villano("Norman Osborn",2,Boolean.TRUE,Boolean.TRUE,1,null));
        villanos.add(new Villano("Duende Verde",2,Boolean.TRUE,Boolean.TRUE,1,null));
        villanos.add(new Villano("Brigada de Demolición",3,Boolean.FALSE,Boolean.FALSE,0,null));
        villanos.add(new Villano("Calavera",2,Boolean.TRUE,Boolean.TRUE,3,new ArrayList<String>(Arrays.asList("Armas experimentales"))));
        villanos.add(new Villano("Hombre Absorbente",2,Boolean.TRUE,Boolean.TRUE,1,null));
        villanos.add(new Villano("Supervisor",2,Boolean.TRUE,Boolean.TRUE,1,null));
        villanos.add(new Villano("Zola",2,Boolean.TRUE,Boolean.TRUE,1,null));
        villanos.add(new Villano("Cráneo Rojo",2,Boolean.TRUE,Boolean.TRUE,2,null));
        villanos.add(new Villano("Kang",2,Boolean.TRUE,Boolean.TRUE,1,null));
    }
}