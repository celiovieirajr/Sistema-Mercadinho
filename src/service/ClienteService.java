package service;

import model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteService {

    private List<Cliente> clientes = new ArrayList<>();

    public void cadastrarClientes(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso! " + cliente.getNome());
    }

    public void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cadastro de clientes encontrado!");
            return;
        } for (Cliente cliente : clientes) {
            System.out.println("Nome: " + cliente.getNome() + "\n" +
                                "Documento: " + cliente.getDocumento() + "\n" +
                                "Data de Nascimento: " + cliente.getDataNascimento() + "\n");
        }
    }



}
