package br.com.lojinha.pojo;

public class ItensInclusos {

    private String nome;
    private int quantidade;


    public ItensInclusos(String nomeInicial, int quantidadeInicial) {
        this.nome = nomeInicial;
        this.quantidade = quantidadeInicial;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}

