package calculadora;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
		while (true) {
			System.out.println("\n1 - soma\n2 -  subtrair\n3 -  dividir\n4 - multiplicar\n5 sair ");
			System.out.println("digite uma opçao");
			int opcao = input.nextInt();
			if (opcao == 1) {
				System.out.println("digite uma opção");
				int n1 = input.nextInt();
				System.out.println("digite outro numero");
				int n2 = input.nextInt();
				int soma = n1 + n2;
				System.out.println("A soma  é igual" + soma);
			} else if (opcao == 2) {
				System.out.println("digite um numero");
				int n1 = input.nextInt();
				System.out.println("digite outro numero");
				int n2 = input.nextInt();
				int sub = n1 - n2;
				System.out.println("o resutado da subtração é" + sub);
			} else if (opcao == 3) {
				System.out.println("digite um numero");
				int n1 = input.nextInt();
				System.out.println("digite outro numero");
			
			int n2 = input.nextInt();
			int mult = n1 * n2;
			System.out.println("o resultado é" + mult);
			
			}
		}

	}

}

}

