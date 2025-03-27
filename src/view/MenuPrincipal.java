package view;

public class MenuPrincipal extends Menu {
    @Override
    public void exibirMenu() {
        iniciarMenu("Menu Principal");
    }

    @Override
    protected void mostrarOpcoes() {
        System.out.println("1 - Clientes");
        System.out.println("2 - Produtos");
        System.out.println("3 - Vendas");
        System.out.println("4 - Recebimentos");
        System.out.println("0 - Sair do sistema");
    }

    @Override
    protected void processarOpcao(int opcao) {
        switch (opcao) {
            case 1 -> new MenuClientes().exibirMenu();
            case 2 -> System.out.println("Criar menu de produtos.");
            case 3 -> System.out.println("Criar menu de vendas.");
            case 4 -> System.out.println("Criar menu de recebimentos.");
            case 0 -> System.out.println("Saindo do sistema...");
            default -> System.out.println("Opção inválida! Tente novamente.");
        }
    }
}
