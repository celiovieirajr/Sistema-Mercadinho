package view;

import java.util.Scanner;

import model.Produto;
import service.ProdutoService;

public class MenuProduto extends Menu {
	private ProdutoService produtoService = new ProdutoService();

	@Override
	public void exibirMenu() {
		iniciarMenu("Produto");
	}

	@Override
	protected void mostrarOpcoes() {
		System.out.println("1 - Cadastrar");
		System.out.println("2 - Alterar");
		System.out.println("3 - Consultar");
		System.out.println("4 - Listar");
		System.out.println("0 - Voltar ao menu principal");
	}

	@Override
	protected void processarOpcao(int opcao) {
		Scanner scanner = new Scanner(System.in);
        switch (opcao) {
            case 1:
                // Cadastrar produto
                System.out.print("Digite o nome do produto: ");
                String nomeCadastro = scanner.nextLine();
                System.out.println("Digite a descrição do produto: ");
                String descricaoCadastro = scanner.nextLine();
                System.out.print("Digite o preço do produto: ");
                double precoCadastro = scanner.nextDouble();

                Produto produtoCadastrar = new Produto(nomeCadastro, precoCadastro,descricaoCadastro);
                produtoService.cadastrarProduto(produtoCadastrar);
                System.out.println("Produto cadastrado com sucesso!");
                break;

            case 2:
                // Alterar produto
                System.out.print("Digite o ID do produto que deseja alterar: ");
                int idAlterar = scanner.nextInt();
                scanner.nextLine();  // Consome a linha de quebra de linha
                System.out.print("Digite o novo nome do produto: ");
                String nomeAlterado = scanner.nextLine();
                System.out.println("Digite a nova descrição do produto: ");
                String descricaoAlterada = scanner.nextLine();
                System.out.print("Digite o novo preço do produto: ");
                double precoAlterado = scanner.nextDouble();

                Produto produtoAlterar = new Produto(idAlterar, nomeAlterado, precoAlterado, descricaoAlterada);
                boolean alterado = produtoService.alterarProduto(idAlterar, produtoAlterar);
                if (alterado) {
                    System.out.println("Produto alterado com sucesso!");
                } else {
                    System.out.println("Produto não encontrado.");
                }
                break;

            case 3:
                // Consultar produto
                System.out.print("Digite o ID do produto para consultar: ");
                int idConsulta = scanner.nextInt();
                Produto produtoConsulta = produtoService.consultarProduto(idConsulta);
                if (produtoConsulta != null) {
                    System.out.println("Produto encontrado \nID: " + produtoConsulta.getId() + "\nNome: "+ produtoConsulta.getNome() + "\nDescrição: " + produtoConsulta.getDescricao() + "\nPreço: " + produtoConsulta.getPreco());
                } else {
                    System.out.println("Produto não encontrado.");
                }
                break;

            case 4:
                // Listar produtos
                System.out.println("Lista de produtos:");
                for (Produto p : produtoService.consultarListagemProdutos()) {
                    System.out.println("ID: " + p.getId() + " - Nome: " + p.getNome() + " - Preço: " + p.getPreco());
                }
                break;

            case 0:
                // Sair
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
		
	}

}
