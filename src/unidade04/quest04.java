package unidade04;

import java.util.Scanner;

public class quest04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de casos: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			
			System.out.println("Digite dois numeros inteiros: ");
			int x = sc.nextInt();
			int y = sc.nextInt();

			if (y == 0) {
				System.out.println("divisao impossivel");
			} else {
				double div = (double) x / y;
				System.out.printf("%.1f%n", div);
			}
		}

		sc.close();
	}

}
