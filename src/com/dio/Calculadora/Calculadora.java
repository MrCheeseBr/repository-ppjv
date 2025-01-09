package com.dio.Calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a, b, op;

		System.out.println("Digite o primeiro valor:");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor:");
		b = scan.nextInt();

		int soma = soma(a, b);
		int subs = subs(a, b);
		int divby = divby(a, b);
		int times = times(a, b);

		System.out.println("Selecione a operação: ");
		System.out.println(" 1 - Soma ");
		System.out.println(" 2 - Subtração ");
		System.out.println(" 3 - Divisão ");
		System.out.println(" 4 - Multiplicação ");

		op = scan.nextInt();

		if (op <= 4) {

			switch (op) {
			case 1: {
				System.out.println("Resultado: " + soma);
				break;
			}
			case 2: {
				System.out.println("Resultado: " + subs);
				break;

			}
			case 3: {
				System.out.println("Resultado: " + divby);
				break;

			}
			case 4: {
				System.out.println("Resultado: " + times);
				break;

			}

			}
		} else {
			System.out.println("O número selecionado (" + op + ") não é uma das opções");
		}

	}

	public static int soma(int a, int b) {
		return a + b;
	}

	public static int subs(int a, int b) {
		return a - b;
	}

	public static int divby(int a, int b) {
		return a / b;
	}

	public static int times(int a, int b) {
		return a * b;
	}

}
