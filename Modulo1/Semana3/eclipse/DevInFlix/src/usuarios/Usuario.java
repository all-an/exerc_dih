package usuarios;

import java.time.LocalDate;
import java.util.Date;

public class Usuario {
	
	private String nome;
	private String endereco;
	private Date dataNascimento;
	
	public Usuario(String nome, String endereco, Date date) {
		this.nome = nome;
		this.endereco = endereco;
		this.dataNascimento = date;
	}
}
