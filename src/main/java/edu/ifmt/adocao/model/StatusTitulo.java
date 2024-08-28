package edu.ifmt.adocao.model;

public enum StatusTitulo {
	VACINADO("vacinado"),
	NAO_VACINADO("nao_vacinado");

	private String descricao;

	StatusTitulo(String descricao) {
		this.descricao=descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
