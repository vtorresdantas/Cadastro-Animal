package Projetos_2SIH;

// 1SIH

// Gabriel Felix de Oliveira  /  RM: 88875

// Lucas Dellagatti  /  RM: 87481

// Matheus de Oliveira  /  RM: 88430

// Vinícius Heidi Sakai  /  RM: 86985

// Vitor Torres Dantas  /  RM: 88415

import java.util.Scanner;

public class GlobalSolution02 {

	static Scanner entrada = new Scanner(System.in);

	static String[] raca = new String[100];

	static double[] peso = new double[100];

	static int[] idade = new int[100];

	static String[] codigoOriginal = new String[100];

	static String[] codigoCripto = new String[100];

	static String[] caracteres = new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };

	static int[] posicao = new int[5];

	static int i = 0;

	static int cifra = 0;

	public static void main(String[] args) {

		int opcao = 0;
		
		System.out.println("----------- Global Solution 02 ---------------");

		System.out.println("");

		System.out.println("Registro de Animais");

		System.out.println("");

		while (opcao != 4) {

			System.out.println("Menu de Opções:");

			System.out.println("-- (1) Cadastrar");

			System.out.println("-- (2) Relatório");

			System.out.println("-- (3) Pesquisa");

			System.out.println("-- (4) Sair");

			System.out.println("");

			System.out.print("Escolha uma das opções: ");
			opcao = entrada.nextInt();

			switch (opcao) {

			case 1:
				cadastrar();
				break;
			case 2:
				relatorio();
				break;
			case 3:
				pesquisa();
				break;
			case 4:
				System.out.println("Certo, tenha um bom dia.");

				System.exit(0);
				break;
			default:
				System.out.println("Opção Inválida");
			}
		}
	}

	public static void cadastrar() {

		int tipo = 0;

		int[] posicaoCripto = new int[5];

		codigoOriginal[i] = "";

		codigoCripto[i] = "";

		System.out.println("");

		System.out.println("Cadastro");

		System.out.println("");

		System.out.println("Tipos:");

		System.out.println("-- (1) Bovino");

		System.out.println("-- (2) Suíno");

		System.out.println("-- (3) Caprino");

		System.out.println("");

		System.out.print("Escolha um dos tipos: ");
		tipo = entrada.nextInt();

		while (tipo < 1 || tipo > 3) {

			System.out.println("");

			System.out.print("Escolha um tipo de animal válido (1 / 2 / 3): ");
			tipo = entrada.nextInt();
		}

		System.out.println("");

		System.out.println("Dados do Animal " + (i + 1));

		System.out.print("-- Informe a raça: ");
		raca[i] = entrada.next();

		System.out.print("-- Informe o peso: ");
		peso[i] = entrada.nextDouble();

		System.out.print("-- Informe a idade: ");
		idade[i] = entrada.nextInt();

		if (tipo == 1) {

			posicao[0] = 1; // B
			posicao[1] = 14; // O
		} else {
			if (tipo == 2) {

				posicao[0] = 18; // S
				posicao[1] = 20; // U
			} else {

				posicao[0] = 2; // C
				posicao[1] = 0; // A
			}
		}

		for (int j = 2; j < 5; j++) {

			posicao[j] = (int) (Math.random() * 26);
		}

		for (int j = 0; j < 5; j++) {

			codigoOriginal[i] += caracteres[posicao[j]];
		}

		if (i > 0) {

			verificaCodigo();
		}

		if (i == 0) {

			System.out.println("");

			System.out.println("Codificação");

			System.out.print("-- Informe o valor para a cifra de César: ");
			cifra = entrada.nextInt();

			while (cifra % 26 == 0) {

				System.out.println("");

				System.out.print("-- Informe um valor de cifra viável, que não seja múltiplo de 26: ");
				cifra = entrada.nextInt();
			}
		}

		System.out.println("");

		for (int j = 0; j < 5; j++) {

			posicaoCripto[j] = posicao[j] + cifra;

			if (posicaoCripto[j] >= 26) {

				posicaoCripto[j] = posicaoCripto[j] % 26;
			}

			codigoCripto[i] += caracteres[posicaoCripto[j]];
		}

		i++;
	}

	public static void verificaCodigo() {

		for (int j = 0; j < i; j++) {

			while (codigoOriginal[i] == codigoOriginal[j]) {
				
				codigoOriginal[i] = "";

				for (int m = 2; m < 5; m++) {

					posicao[m] = (int) (Math.random() * 26);
				}

				for (int m = 0; m < 5; m++) {

					codigoOriginal[i] += caracteres[posicao[m]];
				}
			}
		}
	}

	public static void relatorio() {

		System.out.println("");

		System.out.println("Relatório");

		System.out.println("");

		System.out.println("Animal \t\t Raça \t\t Peso \t\t Idade \t\t Código Criptografado \t\t Código Descriptografado");

		for (int j = 0; j < i; j++) {

			System.out.println("");

			System.out.println((j + 1) + " \t\t " + raca[j] + " \t\t " + peso[j] + " \t\t " + idade[j] + " \t\t "
					+ codigoCripto[j] + " \t\t\t\t " + codigoOriginal[j]);
		}

		System.out.println("");
	}

	public static void pesquisa() {

		String codPesquisa;

		int sim = 0;

		System.out.println("");

		System.out.println("Pesquisa");

		System.out.println("");

		System.out.print("Informe o código criptografado do animal que procura: ");
		codPesquisa = entrada.next().toUpperCase();

		System.out.println("");

		for (int j = 0; j < i; j++) {

			if (codPesquisa.equalsIgnoreCase(codigoCripto[j])) {

				System.out.println("Esse animal foi registrado, informações:");

				System.out.println("-- Raça: " + raca[j]);

				System.out.println("-- Peso: " + peso[j]);

				System.out.println("-- Idade: " + idade[j]);

				System.out.println("-- Código Criptografado: " + codigoCripto[j]);

				System.out.println("-- Código Descriptografado: " + codigoOriginal[j]);

				sim++;
			}
		}

		if (sim == 0) {

			System.out.println("Sinto muito, esse animal não foi registrado.");
		}

		System.out.println("");
	}

}
