package Elementos;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Villano {

    private String nombre;
    private Integer nivelesDificultad;
    private Boolean conjuntoNormal;
    private Boolean conjuntoExperto;
    private Integer numeroConjuntos;
    private List<String> conjuntosObligados;

    public boolean equals(Villano comparacion) {
        return comparacion.getNombre().equals(this.nombre);
    }

    public boolean equals(String comparacion) {
        return comparacion.equals(this.nombre);
    }

}
