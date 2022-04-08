import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int totalReprovados = 0;
		int totalReprovadosFrequencia = 0;
		double maiorNota = 0.0;
		double menorNota = 0.0;

		for (int i = 0; i < 1; i++) {
			String entrada = sc.nextLine();
			String[] dados = entrada.split(" ");

			double nota1 = Double.valueOf(dados[1]);
			double nota2 = Double.valueOf(dados[2]);
			double nota3 = Double.valueOf(dados[3]);

			double media = (nota1 + nota2 + nota3) / 3;

			System.out.println(Arrays.toString(dados));

		}

		sc.close();
		
		
		
	}

}
