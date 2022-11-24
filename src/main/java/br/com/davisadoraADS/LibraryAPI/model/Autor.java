package br.com.davisadoraADS.LibraryAPI.model;
import lombok.*;
import org.springframework.hateoas.RepresentationModel;
import javax.persistence.*;

@Entity
@Table(name= "autores")
public class Autor extends RepresentationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter @Getter
    private long id;

    @Column (name= "nome", nullable = false, length = 50)
    @Getter @Setter
    private String nome;

    @Column (name= "nacionalidade", nullable = true, length = 50)
    @Getter @Setter
    private String nacionalidade;

    @Column (name = "nascimento", nullable = false, length = 10)
    @Getter @Setter
    private String nascimento;

}
