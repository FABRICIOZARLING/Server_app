package br.com.essen.bean;


import java.io.InputStream;

public class ProdutosBean {
	private int idProduto;
	private String nomeProduto;
	private String descricaoProduto;
	private double valorProduto;
	private int idCategoria;
	private InputStream imgProduto;

	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getDescricaoProduto() {
		return descricaoProduto;
	}
	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}
	public InputStream getImgProduto() {
		return imgProduto;
	}
	public void setImgProduto(InputStream imgProduto) {
		this.imgProduto = imgProduto;
	}
	public double getValorProduto() {
		return valorProduto;
	}
	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
}
