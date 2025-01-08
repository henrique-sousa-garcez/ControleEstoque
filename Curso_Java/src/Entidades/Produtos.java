package Entidades;

public class Produtos {
	public String nome;
	public double preco;
	public int quantidade;
	
	
	public double TotalValoremEstoque() {
		return preco * quantidade;
	}
	
	public void AdicionarProdutos(int quantidades) {
		this.quantidade += quantidades;
	}
	
	public void RemoveProdutos(int quantidades) {
		this.quantidade -= quantidades;
	}
	
	public String toString() {
    	return nome
    		+ ", $"
    		+ String.format("%.2f", preco)
    		+ ", "
    		+ quantidade
    		+ " units, Total: $ "
    		+ String.format("%.2f",TotalValoremEstoque());
	}
}