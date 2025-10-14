package br.fatec.pg;

public class Produto {
    private String sku;
    private String nome;
    private double preco;

    public Produto(String sku, String nome, double preco){
        this.sku = sku;
        this.nome = nome;
        this.preco = preco;
    }

    public String getSku(){
        return this.sku;
    }

    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setSku(String novoSku){
        this.sku = novoSku;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public void setPreco(double novoPreco){
        this.preco = novoPreco;
    }

    @Override public String toString(){
        return "%s - %s (R$ %.2f)".formatted(this.sku, this.nome, this.preco);
    }
}
