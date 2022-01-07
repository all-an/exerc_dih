package series;

import filmes.Filme;

public class Serie extends Filme {

	private Integer episódios;

	public Serie(String nome, String sinopse, String genero, String link, Integer episódios) {
		super(nome, sinopse, genero, link);
		this.episódios = episódios;
	}
	
	
}
