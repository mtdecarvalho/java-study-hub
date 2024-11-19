package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco"); // Adiciona o Marco na posição 2 da lista
		
		System.out.println(list.size()); // Retorna o tamanho da lista
		
		for (String x : list) {
			System.out.println(x);
		}
		/*
		System.out.println("--------------------------");
		list.remove("Anna"); // Remove a Anna da lista usando comparação entre Strings
		list.remove(1); // Remove o nodo que estiver na posição 1 da lista
		
		for (String x : list) {
			System.out.println(x);
		}
		*/
		System.out.println("--------------------------");
		list.removeIf(x -> x.charAt(0) == 'M'); // Remove da lista usando predicado
		// Nesse caso remove toda string da lista que comece com M
		// Leitura do predicado: Remova toda string x, desde que a string x comece com M
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("--------------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		// Usa comparação para buscar na lista o elemento que seja igual a string "Bob"
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		// Usa comparação para buscar na lista o elemento que seja igual a string "Marco"
		// Retorna -1 pois não existe
		
		// Se a função encontrar o elemento, retorna a posição do mesmo; senão, retorna -1
		System.out.println("--------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		// Essa função filtra a lista e retorna todas as Strings que comecem com A, essa nova lista é armazenada em result
		// Para isso, precisamos converter para uma stream (.stream()), que nos permite utilizar operações lambda
		// Depois, fazemos a operação lambda (.filter(x -> x.charAt(0) == 'A'))
		// Depois, precisamos converter a stream de volta pra uma List, (.collect(Collectors.toList()))
		// Essa nova lista é retornada e armazenada dentro de result
		
		// O tipo stream é um tipo especial do Java 8+ que aceita operações com expressões lambda. 
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("--------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		// Essa função busca na lista e retorna a primeira string que comece com A
		// Para isso precisamos converter para uma stream para usar expressões lambda
		// Aplicamos a expressão lambda .filter(x -> x.charAt(0) == 'A')
		// Depois, a partir do que foi retornado desse filtro, usamos o .findFirst()
		// A função findFirst() retorna uma Optional<String>, um tipo especial do Java 8+
		// Depois colocamos .orElse(null), para que caso nenhuma string que comece com A tenha sido encontrada, retorne null
		
		// Essa função vai retornar Alex
		
		System.out.println(name);
		
		name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		// Esse retorna null pois não temos string que comece com J
		
		System.out.println(name);
		

	}

}
