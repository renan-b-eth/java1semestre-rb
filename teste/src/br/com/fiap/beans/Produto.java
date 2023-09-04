package br.com.fiap.beans;

public class Produto {
	
	private String tipoProduto, marcaProduto;
	private int quantidadeProduto;
	private double valorProduto;
	
	public void setTipoProduto(String p) {
		this.tipoProduto = p;
	}
	
	public String getTipoProduto() {
		return tipoProduto;
	}
	
	public void setMarcaProduto(String m) {
		this.marcaProduto = m;
	}
	
	public String getMarcaProduto() {
		return marcaProduto;
	}
	
	public void setQuantidadeProduto(int q) {
		this.quantidadeProduto = q;
	}
	
	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}

	public void setValorProduto(double v) {
		this.valorProduto = v;
	}
	
	public double getValorProduto() {
		return valorProduto;
	}
	
}
