package br.com.lojinha.pojo;

import br.com.lojinha.interfaces.Favorito;

public class ProdutoInternacional extends Produto implements Favorito {

    private double TaxaImportacao;

    public ProdutoInternacional(String marcaInicial, br.com.lojinha.enums.Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }


    public void setValor(double novoValor) {
        if (novoValor > -100) {
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("Valores devem ser maiores que -100.");
        }
    }


    public double getTaxaImportacao() {
        return TaxaImportacao;
    }

    public void setTaxaImportacao(double novoImpostoInternacional) {
        TaxaImportacao = novoImpostoInternacional;
    }


    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getMarca() + " e " + getValor();
    }

}
