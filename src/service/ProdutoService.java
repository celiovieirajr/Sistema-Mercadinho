package service;

import java.util.ArrayList;
import java.util.List;
import model.Produto;

public class ProdutoService {
	private List<Produto> produtos = new ArrayList<>(); // Lista para armazenar produtos
	
	 // Variável estática para controlar o próximo ID a ser atribuído
    private static int contadorId = 1;
	
    // Método para cadastrar produto
	public void cadastrarProduto(Produto produto) {
        produtos.add(produto);  // Adiciona o produto à lista
        produto.setId(contadorId++); // Atribui o ID atual e incrementa para o próximo
		
	};
	
	// Método para alterar produto
	public boolean alterarProduto(int id, Produto produtoAlterado) {
		for (Produto produto : produtos) {
			if (produto.getId() == id) {
				produto.setNome(produtoAlterado.getNome());
				produto.setDescricao(produtoAlterado.getDescricao());
	            produto.setPreco(produtoAlterado.getPreco());
	            // Alterar outros campos conforme necessário
	            return true; // Produto alterado com sucesso
	            }
	        }
	        return false; // Produto não encontrado	
	};
	
	// Método para consultar produto por ID
	public Produto consultarProduto(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;  // Retorna o produto encontrado
            }
        }
        return null; // Produto não encontrado		
	};
	
	// Método para consultar a listagem de todos os produtos
	public List<Produto> consultarListagemProdutos() {
		return produtos;  // Retorna a lista de produtos
	};
	


}
