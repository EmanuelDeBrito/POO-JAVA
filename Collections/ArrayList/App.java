package br.fatec.pg;

import java.util.ArrayList;
import java.util.List;

public class App{
    public static void main(String[] args){
        // Criando o catalogo
        Catalogo catalogo = new Catalogo();

        // Criando os produtos
        Produto mouse = new Produto("yxz", "Mouse Logitech", 130.00);
        Produto teclado = new Produto("def", "Teclado Gamer", 321.99);
        Produto placaDeVideo = new Produto("abc", "Placa de Vídeo", 500.99);
        Produto gabinete = new Produto("hij", "Gabinete Gamer", 100.99);
        Produto processador = new Produto("lmn", "Processador Xeon", 50);

        // Adicionando produtos no catalogo
        catalogo.adicionarProduto(mouse);
        catalogo.adicionarProduto(teclado);
        catalogo.adicionarProduto(placaDeVideo);
        catalogo.adicionarProduto(gabinete);
        catalogo.adicionarProduto(processador);

        // Mostrando produtos
        System.out.println("\n" + catalogo.mostrarProdutos());

        // Removendo um produto por SKU
        System.out.println("\n" + catalogo.removerProdutoPorSku("aaa"));

        // Buscando produto por nome
        List<Produto> produtosFiltradosPorNome = catalogo.buscarProdutoPorNome("Gamer");
        System.out.println("\n" + produtosFiltradosPorNome);

        // Estratégia - SKU
        System.out.println("\n" + catalogo.ordenarPor(Catalogo.POR_SKU));

        // Estratégia - Nome
        System.out.println("\n" + catalogo.ordenarPor(Catalogo.POR_NOME));

        // Estratégia - Preço ASC
        System.out.println("\n" + catalogo.ordenarPor(Catalogo.POR_PRECO_ASC));

        // Estratégia - Preço DESC
        System.out.println("\n" + catalogo.ordenarPor(Catalogo.POR_PRECO_DESC));
    }
}