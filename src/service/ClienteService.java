package service;

import model.Cliente;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class ClienteService {
    private final List<Cliente> clientes = new ArrayList<>();


    public void cadastrarClienteService(Cliente cliente) {
        clientes.add(cliente);
    }


    public List<String> listarClientesService() {
        List<String> dadosClientes = new ArrayList<>();
        for (Cliente cliente : clientes) {
                    dadosClientes.add(cliente.getNome() +
                    cliente.getDocumento() +
                    cliente.getDataNascimento());
        }
        return dadosClientes;
    }


    public Cliente consultarClientePorNomeService(String nomeCliente) {
        for (Cliente consultaCliente : clientes) {
            if (consultaCliente.getNome().equalsIgnoreCase(nomeCliente)) {
                return consultaCliente;
            }
        }
        return null;
    }


    public void deletarClientesService(String nomeCliente) {
        Cliente clienteEncontrado = consultarClientePorNomeService(nomeCliente);
        if (clienteEncontrado != null)
            clientes.remove(clienteEncontrado);
    }
}
