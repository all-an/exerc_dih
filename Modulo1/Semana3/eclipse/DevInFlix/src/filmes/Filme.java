package filmes;

import java.util.UUID;

public class Filme {
	
	private String uniqueID = UUID.randomUUID().toString();
	private Integer id;
	private String nome;
	private String sinopse;
	private String genero;
	private String link;
	private Integer curtidas;

	public Filme(String nome, String sinopse, String genero, String link) {
		this.nome = nome;
		this.sinopse = sinopse;
		this.genero = genero;
		this.link = link;
	}
	
	public Integer getCurtidas() {
		return curtidas;
	}

	public void setCurtida(Integer curtidas) {
		this.curtidas += curtidas;
	}
	
	public Integer getId() {
		return id;
	}
	
}
