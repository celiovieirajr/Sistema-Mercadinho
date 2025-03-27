package view;

import exception.MenuException;
import java.util.Scanner;

public class Menu {
    private final Scanner entrada = new Scanner(System.in);

    public void menuOpcoes() {
        System.out.println("Seja bem-vindo ao sistema de Mercadinho!");
        System.out.println("----------------------------------------");

        while (true) {
            mostraSelecaoMenu();
            try {
                int selecao = obterOpcao();
                if (selecao == 0) {
                    System.out.println("Saindo do sistema...");
                    break;
                }
                processarSelecao(selecao);
            } catch (MenuException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

    private int obterOpcao() {
        System.out.print("Escolha uma opção: ");
        String entradaUsuario = entrada.nextLine();
        return MenuException.validarNumero(entradaUsuario);
    }

    private void mostraSelecaoMenu() {
        System.out.println("1 - Clientes");
        System.out.println("2 - Produtos");
        System.out.println("3 - Vendas");
        System.out.println("4 - Recebimentos");
        System.out.println("0 - Sair do sistema");
    }

    private void processarSelecao(int selecao) {
        switch (selecao) {
            case 1 -> new MenuClientes().menuSelecaoClientes();
            case 2 -> System.out.println("Criar menu de produtos.");
            case 3 -> System.out.println("Criar menu de vendas.");
            case 4 -> System.out.println("Criar menu de recebimentos.");
            default -> System.out.println("Opção inválida! Tente novamente.");
        }
    }


}
