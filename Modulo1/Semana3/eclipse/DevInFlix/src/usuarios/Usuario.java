package usuarios;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import filmes.Filme;

public class Usuario {
	
	String uniqueID = UUID.randomUUID().toString();
	private String nome;
	private String endereco;
	private Date dataNascimento;
	private List<String> recomendacoes = new ArrayList<>(); //TODO:

	private static Integer curtir;
	
	public Usuario(String nome, String endereco, Date dataNascimento) {
		this.nome = nome;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setCurtir(Filme filme) {
		this.curtir++;
		filme.setCurtida(1);
	}
	
}
