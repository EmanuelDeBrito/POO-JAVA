package br.fatec.pg;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Catalogo {
    private List<Produto> produtos = new ArrayList<Produto>();

    public List<Produto> mostrarProdutos(){
        return this.produtos;
    }
    
    public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
    }

    public String removerProdutoPorSku(String sku){
        if(this.produtos.removeIf(produto -> produto.getSku().equalsIgnoreCase(sku))){
            return "Produto de SKU(" + sku + ") removido com sucesso";
        }

        return "Produto de SKU(" + sku + ") não encontrado";
    }

    public List<Produto> buscarProdutoPorNome(String nomeProduto){
        List<Produto> listaProdutosProcuradosPorNome = new ArrayList<Produto>();

        for (Produto produto : produtos) {
            if(produto.getNome().contains(nomeProduto)){
                listaProdutosProcuradosPorNome.add(produto); 
            }
        }

        listaProdutosProcuradosPorNome.sort(POR_NOME);

        return listaProdutosProcuradosPorNome;
    }

    public List<Produto> ordenarPor(Comparator<Produto> estrategia){
        List<Produto> listaProdutosComEstrategia = new ArrayList<Produto>(this.produtos);
        listaProdutosComEstrategia.sort(estrategia);

        return listaProdutosComEstrategia;
    }

    // Estratégias
    public static final Comparator<Produto> POR_SKU = Comparator.comparing(Produto::getSku, String.CASE_INSENSITIVE_ORDER);

    public static final Comparator<Produto> POR_NOME = Comparator.comparing(Produto::getNome, String.CASE_INSENSITIVE_ORDER);

    public static final Comparator<Produto> POR_PRECO_ASC = Comparator.comparingDouble(Produto::getPreco);

    public static final Comparator<Produto> POR_PRECO_DESC = POR_PRECO_ASC.reversed();
}