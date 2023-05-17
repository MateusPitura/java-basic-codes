package br.com.mateus.modelo;

import javax.persistence.*;

@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf){
        this.nome=nome;
        this.cpf=cpf;
    }

    public Cliente(){
    }

    
}
