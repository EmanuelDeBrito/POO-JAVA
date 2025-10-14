package br.fatec.pg;

public class App{
    public static void main(String[] args){
        // Criando Repositório com os clientes
        RepositorioCliente repositorio = new RepositorioCliente(MapFactory.criar(PoliticaMap.ORDEM_INSERCAO));

        // Criando clientes
        Cliente emanuel = new Cliente("123", "Emanuel", "emanuel@gmail.com");
        Cliente viviane = new Cliente("456", "Viviane", "viviane@gmail.com");
        Cliente danilo = new Cliente("789", "Danilo", "danilo@gmail.com");

        // Adicionando os clientes ao repositório
        repositorio.salvarCliente(emanuel);
        repositorio.salvarCliente(viviane);
        repositorio.salvarCliente(danilo);

        // Buscando um cliente por CPF
        System.out.println(repositorio.buscarCliente("456"));

        // Removendo um cliente do repositório
        repositorio.removerCliente("123");

        // Mostrando todos os clientes no repositório de forma ordenada(pelo nome)
        System.out.println(repositorio.mostrarTodosOsClientesOrdenadosPorNome());
    }
}