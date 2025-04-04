package view;

import model.Cliente;
import service.ClienteService;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class MenuClientes extends Menu {
    private final ClienteService clienteService = new ClienteService();
    private final Scanner entrada = new Scanner(System.in);
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); // Buscado do google

    @Override
    public void exibirMenu() {
        iniciarMenu("Menu de Clientes");
    }

    @Override
    protected void mostrarOpcoes() {
        System.out.println("1 - Incluir Cliente");
        System.out.println("2 - Listar Clientes");
        System.out.println("3 - Deletar Cliente");
        System.out.println("0 - Voltar ao menu principal");
    }

    @Override
    protected void processarOpcao(int opcao) {
        switch (opcao) {
            case 1 -> incluirCliente();
            case 2 -> listarClientes();
            case 3 -> deletaCliente();
            default -> System.out.println("Opção inválida! Tente novamente.");
        }
    }


    private void incluirCliente() {
        System.out.print("Nome: ");
        String nome = entrada.nextLine();

        System.out.print("Documento (somente números): ");
        long documento = Long.parseLong(entrada.nextLine());

        System.out.print("Data de nascimento (dd/MM/yyyy): ");
        Date dataNascimento = null;
        try {
            dataNascimento = dateFormat.parse(entrada.nextLine());
        } catch (ParseException e) {
            System.out.println("Formato de data inválido. Use dd/MM/yyyy.");
            return;
        }

        Cliente cliente = new Cliente(nome, dataNascimento, documento);
        clienteService.cadastrarClienteService(cliente);
    }


    private void listarClientes() {
        List<String> clientes = clienteService.listarClientesService();
        for (String cliente : clientes) {
            System.out.println("-------------------");
            System.out.println(cliente);
        }
    }


    private void deletaCliente() {
        System.out.println("Digite o nome de quem deseja deletar: ");
        String nomeCliente = entrada.nextLine();

        try {
            clienteService.deletarClientesService(nomeCliente);
            System.out.println("Cliente "  +  nomeCliente +" deletado com sucesso!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
