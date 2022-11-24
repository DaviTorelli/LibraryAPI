package br.com.davisadoraADS.LibraryAPI.model;

import lombok.*;
import org.springframework.hateoas.RepresentationModel;
import javax.persistence.*;

@Entity
@Table(name= "livros")
public class Livro extends RepresentationModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private long id;

    @Column (nullable = false, length = 13)
    @Getter @Setter
    private long isbn;

    @Column (nullable = false, length = 50)
    @Getter @Setter
    private String nome;

    @Column (nullable = false, length = 10)
    @Getter @Setter
    private String data_lancamento;

    @Column (nullable = false, length = 50)
    @Getter @Setter
    private String tema;

    @Column (nullable = false, length = 50)
    @Getter @Setter
    private String pais;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    @Setter @Getter
    private Autor autores;
}
