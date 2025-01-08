package Programa;

import java.util.Locale;
import java.util.Scanner;
import Entidades.Produtos;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		Produtos Produto = new Produtos();
		System.out.println("Entre com os dados do produto: ");
		System.out.printf("Nome: ");
		Produto.nome = sc.next();
		System.out.printf("Preço: ");
		Produto.preco = sc.nextDouble();
		System.out.printf("Quantidade em estoque: ");
		Produto.quantidade = sc.nextInt();
		System.out.printf("Dados do produto: " + Produto);
		System.out.println();
		System.out.printf("Entre com a quantidade de produtos que você deseja adicionar no estoque: ");
		int quantidade = sc.nextInt();
		Produto.AdicionarProdutos(quantidade);
		System.out.println("Dados Atualizados: " + Produto);
		System.out.printf("Entre com a quantidade que você deseja remover do estoque: ");
		int remove = sc.nextInt();
		Produto.RemoveProdutos(remove);
		System.out.printf("Dados Atualizados: " + Produto);
		
		sc.close();

	}

}
