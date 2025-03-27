package exception;

public class MenuException extends RuntimeException {
    public MenuException(String mensagem) {
        super(mensagem);
    }

    public static int validarNumero(String entrada) {
        try {
            return Integer.parseInt(entrada);
        } catch (NumberFormatException e) {
            throw new MenuException("Opção inválida! Digite um número de 0 a 4.");
        }
    }
}
