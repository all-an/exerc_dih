package usuarios;

import filmes.Filme;

public class Usuario {
	
	private String nome;
	private String endereco;
	private Integer dia;
	private Integer mes;
	private Integer ano;
	private static Integer curtir;
	
	public Usuario(String nome, String endereco, Integer dia, Integer mes, Integer ano) {
		this.nome = nome;
		this.endereco = endereco;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public Integer getDia() {
		return dia;
	}

	public Integer getMes() {
		return mes;
	}

	public Integer getAno() {
		return ano;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setDia(Integer dia) {
		this.dia = dia;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	public void setCurtir(Filme filme) {
		this.curtir++;
		filme.setCurtidas(1);
	}
	
	
}
