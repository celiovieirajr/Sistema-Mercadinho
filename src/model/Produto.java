package model;

public class Produto {
	
	private int id;
	private String nome;
	private String descricao;
	private double preco;
	
	public Produto(String nome, double preco, String decricao) {
		this.nome = nome;
		this.descricao = decricao;
		this.preco = preco;
	}
	
	public Produto(int id, String nome, double preco, String decricao) {
		this.id = id;
		this.nome = nome;
		this.descricao = decricao;
		this.preco = preco;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

}
