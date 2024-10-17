package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import java.util.List;

public class Produto {

    private String nome;
    private String marca;
    protected Double valor;
    private Tamanho Tamanho;
    private List<ItensInclusos> ItensInclusos;


    public Produto(String marcaInicial, Tamanho tamanhoInicial) {
        this.marca = marcaInicial;
        this.Tamanho = tamanhoInicial;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }


    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String novaMarca){
        this.marca = novaMarca;
    }


    public double getValor() {
        return this.valor;
    }
    public void setValor(double novoValor) {
        if (novoValor > 0) {
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("Valores devem ser maiores que 0.");
        }
    }

    public Tamanho getTamanho() {
        return this.Tamanho;
    }
    public void setTamanho(Tamanho novoTamanho) {
        this.Tamanho = novoTamanho;
    }


    public List<ItensInclusos> getItensInclusos() {
        return ItensInclusos;
    }

    public void setItensInclusos(List<ItensInclusos> novosItensInclusos) {
         this.ItensInclusos = novosItensInclusos;
    }
}