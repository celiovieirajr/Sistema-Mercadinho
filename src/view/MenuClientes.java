package view;

public class MenuClientes extends Menu {
    @Override
    public void exibirMenu() {
        executarLoop("Menu de Clientes");
    }

    @Override
    protected void mostrarOpcoes() {
        System.out.println("1 - Incluir Cliente");
        System.out.println("2 - Editar Cliente");
        System.out.println("3 - Consultar Cliente");
        System.out.println("4 - Deletar Cliente");
        System.out.println("0 - Cancelar operação e voltar para menu principal");
    }

    @Override
    protected void processarOpcao(int opcao) {
        switch (opcao) {
            case 1 -> System.out.println("Incluir Cliente (lógica a implementar)");
            case 2 -> System.out.println("Editar Cliente (lógica a implementar)");
            case 3 -> System.out.println("Consultar Cliente (lógica a implementar)");
            case 4 -> System.out.println("Deletar Cliente (lógica a implementar)");
            default -> System.out.println("Opção inválida! Tente novamente.");
        }
    }
}
