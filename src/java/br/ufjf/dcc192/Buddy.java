package br.ufjf.dcc192;

public class Buddy {
    String nome;
    String ocupacao;
    String email;
    Integer disponibilidade;
    Boolean situacao;

    public Buddy(String nome, String ocupacao, Integer disponibilidade, String email) {
        this.nome = nome;
        this.ocupacao = ocupacao;
        this.disponibilidade = disponibilidade;
        this.situacao = true;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupação(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    public Integer getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(Integer disponibilidade) {
        this.disponibilidade = disponibilidade;
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
