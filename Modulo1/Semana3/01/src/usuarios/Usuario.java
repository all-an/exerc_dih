package usuarios;

import java.time.LocalDate;

public class Usuario {
	private String nome;
	private String endereco;
	private int dia;
	private int mes;
	private int ano;
	//private LocalDate dataNascimento;
	
	public Usuario(String nome, String endereco, int dia, int mes, int ano) {
		//super();
		this.nome = nome;
		this.endereco = endereco;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
}
