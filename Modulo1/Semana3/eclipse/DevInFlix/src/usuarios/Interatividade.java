package usuarios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import filmes.Filme;
import recomendacoes.Recomendacao;

public class Interatividade {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Usuario> listaUsuarios = new ArrayList<>();
		List<Filme> listaFilmes = new ArrayList<>();
		
		//criar classe sugestão
		
		System.out.println("Nome: ");
		String nome = sc.next();
		System.out.println("Endereço: ");
		String endereco = sc.next();
		System.out.print("Data de Nascimento (DD/MM/YYYY): ");
		Date dataInput = sdf.parse(sc.next()); 
		
		listaUsuarios.add(new Usuario(nome, endereco, dataInput));
		
		System.out.print("Digite o id do filme que deseja assistir: ");
		int id = sc.nextInt();
		Filme filme = listaFilmes.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		 
		System.out.println("Deseja curtir filme s(sim) ou n(não)? ");
		char curtir = sc.next().charAt(0);
		if(curtir == 's') {
			filme.setCurtida(1);
		}
		
		System.out.println("Deseja recomendar o filme s(sim) ou n(não)? ");
		char recom = sc.next().charAt(0);
		if(recom == 's') {
			Recomendacao recomendou = new Recomendacao(null, null, filme, endereco);
		}
		
		System.out.println("Deseja sugerir um filme s(sim) ou n(não)? ");
		char sugere = sc.next().charAt(0);
		if(sugere == 's') {
			filme.setCurtida(1);
		}
	}

}
