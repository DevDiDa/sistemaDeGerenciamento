package br.com.sistemaGerenciamento.model;


public class Convidado {
    private Long id;
    private String nome;
    private int qtdeConvidado;

    public Convidado(Long id, String nome, int qtdeConvidado) {
        this.id = id;
        this.nome = nome;
        this.qtdeConvidado = qtdeConvidado;
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

    public int getQtdeConvidado() {
        return qtdeConvidado;
    }

    public void setQtdeConvidado(int qtdeConvidado) {
        this.qtdeConvidado = qtdeConvidado;
    }
}
