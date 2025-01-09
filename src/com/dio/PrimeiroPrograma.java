package com.dio;

import com.dio.Model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gatinho = new Gato("Muffin", "preto", 2);
		Livro pqnPrincipe = new Livro();
		
		System.out.println(gatinho);
		System.out.println(pqnPrincipe);
		
	}
	
}
class Livro{
	String nome;
	Integer pgNum;
}
