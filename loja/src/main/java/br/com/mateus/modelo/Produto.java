package br.com.mateus.modelo;

import java.math.BigDecimal;

import javax.persistence.*;

@Entity
@Table(name = "produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(name = "descricao")
    private String desc;
    private BigDecimal preco;

    
}
