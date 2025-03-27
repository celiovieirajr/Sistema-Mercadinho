package view;

import exception.MenuException;
import java.util.Scanner;

public class MenuClientes {
    private final Scanner entrada = new Scanner(System.in);

    public void menuSelecaoClientes() {
        while (true) {
            System.out.println("\n### Menu de Clientes ###");
            System.out.println("1 - Incluir Cliente");
            System.out.println("2 - Editar Cliente");
            System.out.println("3 - Consultar Cliente");
            System.out.println("4 - Deletar Cliente");
            System.out.println("0 - Cancelar operação e voltar para menu principal");

            try {
                System.out.print("Escolha uma opção: ");
                int opcao = MenuException.validarNumero(entrada.nextLine());

                if (opcao == 0) {
                    System.out.println("Voltando ao menu principal...");
                    break;
                }

                processarOpcao(opcao);
            } catch (MenuException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

    private void processarOpcao(int opcao) {
        switch (opcao) {
            case 1 -> System.out.println("Incluir Cliente (lógica a implementar)");
            case 2 -> System.out.println("Editar Cliente (lógica a implementar)");
            case 3 -> System.out.println("Consultar Cliente (lógica a implementar)");
            case 4 -> System.out.println("Deletar Cliente (lógica a implementar)");
            default -> System.out.println("Opção inválida! Tente novamente.");
        }
    }
}
