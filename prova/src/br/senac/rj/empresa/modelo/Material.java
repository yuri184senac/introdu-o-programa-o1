package br.senac.rj.empresa.modelo;

public class Material {
	private int codMaterial;
	private String descMaterial;
	private int qtdeEstoque;
	
	public int getCodMaterial() {
		return codMaterial;
	}
	public void setCodMaterial(int codMaterial) {
		this.codMaterial = codMaterial;
	}
	public String getDescMaterial() {
		return descMaterial;
	}
	public void setDescMaterial(String descMaterial) {
		this.descMaterial = descMaterial;
	}
	public int getQtdeEstoque() {
		return qtdeEstoque;
	}
	
	public void cadastrarMaterial(int cod, String descr) {
		this.setCodMaterial(cod);
		this.setDescMaterial(descr);
		System.out.println("Material cadastrado com sucesso!");
	}
	
	public void entrarMaterial(int qtde) {
		this.qtdeEstoque += qtde;
	}
	
	public void saidaMaterial(int qtde) {
		int qtdeAtual = this.getQtdeEstoque();
		qtdeAtual -= qtde;
		if (qtdeAtual <= 0) {
			System.out.println("Estoque insuficiente");
		} else {
			this.qtdeEstoque -= qtde;
			System.out.println("Saída do material com sucesso!");
		}
			
		
	}
	
	
}
