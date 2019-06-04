package br.com.sistemaGerenciamento.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Convidado implements Serializable {

    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int qtdeAcompanhantes;

    public Convidado() {
    }

    public Convidado(String nome, int qtdeAcompanhantes) {

        this.nome = nome;
        this.qtdeAcompanhantes = qtdeAcompanhantes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdeAcompanhantes() {
        return qtdeAcompanhantes;
    }

    public void setQtdeAcompanhantes(int qtdeAcompanhantes) {
        this.qtdeAcompanhantes = qtdeAcompanhantes;
    }
}
