package br.ufjf.dcc192;

public class Estrangeiro {

    String nome;
    String nacionalidade;
    String email;
    Integer necessidade;
    Boolean situacao;

    public Estrangeiro(String nome, String nacionalidade, Integer necessidade, String email) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.necessidade = necessidade;
        this.situacao = true;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Integer getNecessidade() {
        return necessidade;
    }

    public void setNecessidade(Integer necessidade) {
        this.necessidade = necessidade;
    }

    public Boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
