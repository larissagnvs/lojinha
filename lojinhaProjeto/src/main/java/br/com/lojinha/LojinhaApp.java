package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;
import br.com.lojinha.pojo.ItensInclusos;
import br.com.lojinha.pojo.Produto;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto("Sony", Tamanho.MÉDIO);

            meuProduto.setNome("Play Station 5");
            meuProduto.setValor(3499.90);


            List<ItensInclusos> ItensInclusos = new ArrayList<>();
                ItensInclusos primeiroItemAdicional = new ItensInclusos("Controle", 2);
                ItensInclusos.add(primeiroItemAdicional);

                ItensInclusos segundoItemAdicional = new ItensInclusos("Jogos",3);
                ItensInclusos.add(segundoItemAdicional);

                ItensInclusos terceiroItemAdicional = new ItensInclusos("Cabo de Energia",1);
                ItensInclusos.add(terceiroItemAdicional);

            meuProduto.setItensInclusos(ItensInclusos);

        System.out.println("Começando a apresentar os itens:");

        for (ItensInclusos itemAtual : meuProduto.getItensInclusos()) {
            System.out.println(itemAtual.getNome());
            System.out.println(itemAtual.getQuantidade());
        }

        System.out.println("Os itens acabaram.");

        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Sony", Tamanho.MÉDIO);
        meuProdutoNacional.setImpostoNacional(0.5789);


        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("Sony", Tamanho.MÉDIO);
        meuProdutoInternacional.setTaxaImportacao(2.1236);
        meuProdutoInternacional.setValor(-99);
        System.out.println("valor do Produto:");
        System.out.println(meuProdutoInternacional.getValor());
        System.out.println("Taxa de Importação:");
        System.out.println(meuProdutoInternacional.getTaxaImportacao());

    }
}
