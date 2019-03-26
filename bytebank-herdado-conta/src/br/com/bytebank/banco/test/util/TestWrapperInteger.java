package br.com.bytebank.banco.test.util;

import java.util.*;

public class TestWrapperInteger {

	public static void main(String[] args) {
		//int [] idades = new int[5];
		//String[] nomes = new String[5];

		int idade = 29;

		Integer idadeRef = Integer.valueOf(29);
		int valor = idadeRef.intValue();

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);

		if(args.length > 0) {
			String s = args[0];
			Integer numero = Integer.valueOf(s);
			int numeru = Integer.parseInt(s);
			System.out.println(numero);
			System.out.println(numeru);
			System.out.println(numero.floatValue());
		}

		List<Integer> numeros = new ArrayList<Integer>();

		numeros.add(idade); //Autoboxing

		System.out.println(numeros);
	}

}
