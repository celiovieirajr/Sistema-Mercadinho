package view;

import exception.MenuException;
import java.util.Scanner;

public abstract class Menu implements IMenu {
    protected final Scanner entrada = new Scanner(System.in);

    protected int obterOpcao() {
        System.out.print("Escolha uma opção: ");
        return MenuException.validarNumero(entrada.nextLine());
    }

    protected void iniciarMenu(String titulo) {
        System.out.println("\n### " + titulo + " ###");
        while (true) {
            mostrarOpcoes();
            try {
                int opcao = obterOpcao();
                if (opcao == 0) {
                    System.out.println("Voltando ao menu anterior...");
                    break;
                }
                processarOpcao(opcao);
            } catch (MenuException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

    protected abstract void mostrarOpcoes();

    protected abstract void processarOpcao(int opcao);
}
