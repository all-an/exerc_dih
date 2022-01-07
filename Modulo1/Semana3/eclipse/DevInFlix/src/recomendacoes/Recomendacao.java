package recomendacoes;

import filmes.Filme;
import usuarios.Usuario;

public class Recomendacao {
	
	private Usuario recomendou;
	private Usuario recebeu;
	private Filme filme;
	private String mensagem;
	
	public Recomendacao(Usuario recomendou, Usuario recebeu, Filme filme, String mensagem) {
		this.recomendou = recomendou;
		this.recebeu = recebeu;
		this.filme = filme;
		int maxLength = 20;
		this.mensagem = (mensagem.length() > maxLength) ? mensagem.substring(0, maxLength) 
				: mensagem;
	}
}
