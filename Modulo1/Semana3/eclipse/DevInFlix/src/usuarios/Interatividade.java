package usuarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import filmes.Filme;

public class Interatividade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Usuario> listaUsuarios = new ArrayList<>();
		List<Filme> listaFilmes = new ArrayList<>();
		
		System.out.println("Nome: ");
		String nome = sc.next();
		System.out.println("Endereço: ");
		String endereco = sc.next();
		System.out.println("Dio nascimento: ");
		Integer dia = sc.nextInt();
		System.out.println("Mes nascimento: ");
		Integer mes = sc.nextInt();
		System.out.println("Ano nascimento: ");
		Integer ano = sc.nextInt();
		
		listaUsuarios.add(new Usuario(nome, endereco, dia, mes, ano));
		
		System.out.print("Entre o id do filme que deseja curtir: ");
		int id = sc.nextInt();
		Filme filme = listaFilmes.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		 
		System.out.println("Deseja curtir filme s(sim) ou n(não)? ");
		char curtir = sc.next().charAt(0);
		if(curtir == 's') {
			filme.setCurtidas(1);
		}
		
	}

}
