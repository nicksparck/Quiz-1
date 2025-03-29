package quiz.universidades.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name= "Uni")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Uni {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int Numero_de_estudiantes;
    private int Número_de_programas_académicos;
    private int Costo_de_matrícula;
    private String Nombre_de_la_universidad;
    private int Ranking;
}
