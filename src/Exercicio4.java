import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cliente1 = sc.nextInt();
		int cliente2 = sc.nextInt();
		int cliente3 = sc.nextInt();
		int cliente4 = sc.nextInt();
		int cliente5 = sc.nextInt();
		int cliente6 = sc.nextInt();

		int soma = cliente1 + cliente2 + cliente3 + cliente4 + cliente5 + cliente6;

		if (soma > 54000) {
			System.out.println("valor superado " + (soma - 54000));
		}

		sc.close();

	}

}
