package br.fatec.pg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

public class RepositorioCliente {
    private final Map<String, Cliente> clientes;

    public RepositorioCliente(Map<String, Cliente> implementacao){
        this.clientes = implementacao;
    }

    public Cliente buscarCliente(String cpfCliente){
        return clientes.get(cpfCliente);
    }

    public void salvarCliente(Cliente cliente){
        clientes.put(cliente.getCpf(), cliente);
    }

    public void removerCliente(String cpfCliente){
        clientes.remove(cpfCliente);
    }

    public Collection<Cliente> mostrarTodosOsClientesOrdenadosPorNome(){
        ArrayList<Cliente> listaClientesOrdenadosPorNome = new ArrayList<Cliente>(clientes.values());
        listaClientesOrdenadosPorNome.sort(POR_NOME);

        return listaClientesOrdenadosPorNome;
    }

    // Estratégia
    public static final Comparator<Cliente> POR_NOME = Comparator.comparing(Cliente::getNome, String.CASE_INSENSITIVE_ORDER);
}
