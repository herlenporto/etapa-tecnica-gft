import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		System.out.printf("%d, %d, %d", A, B, C);
		System.out.println(" ");

		if (A < B) {
			if (C < B) {
				System.out.printf("%d, %d, %d", A, B, C);
			} else if (A < C) {
				System.out.printf("%d, %d, %d", A, C, B);
			} else {
				System.out.printf("%d, %d, %d", C, A, B);
			}
		} else if (B < C) {
			if (A < C) {
				System.out.printf("%d, %d, %d", B, A, C);
			} else {
				System.out.printf("%d, %d, %d", B, C, A);
			}
		} else
			System.out.printf("%d, %d, %d", C, B, A);

		System.out.println(" ");

		if (A > B) {
			if (C > B) {
				System.out.printf("%d, %d, %d", A, B, C);
			} else if (A > C) {
				System.out.printf("%d, %d, %d", A, C, B);
			} else {
				System.out.printf("%d, %d, %d", C, A, B);
			}
		} else if (B > C) {
			if (A > C) {
				System.out.printf("%d, %d, %d", B, A, C);
			} else {
				System.out.printf("%d, %d, %d", B, C, A);
			}
		} else
			System.out.printf("%d, %d, %d", C, B, A);
	}

}
