package teste;

import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Produto p = new Produto();

		p.setMarcaProduto(JOptionPane.showInputDialog("Digite o Tipo de Produto:"));
		p.setQuantidadeProduto(in.nextInt());
		p.setTipoProduto(in.nextLine());
		p.setValorProduto(in.nextDouble());

		System.out.println("Marca: " + p.getMarcaProduto() + "\n Quantidade: " + p.getMarcaProduto() + "\n Tipo: "
				+ p.getTipoProduto() + "\n Valor: R$" + p.getValorProduto());
	}
}
