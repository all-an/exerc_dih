package series;

import filmes.Filme;

public class Serie extends Filme {

	private Integer epis�dios;

	public Serie(String nome, String sinopse, String genero, String link, Integer epis�dios) {
		super(nome, sinopse, genero, link);
		this.epis�dios = epis�dios;
	}
	
	
}
