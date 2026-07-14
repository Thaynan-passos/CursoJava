package unidade04;

import java.util.Locale;
import java.util.Scanner;

public class quest03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o número de casos de teste: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			
			System.out.printf("Digite a primeira nota: ");
			System.out.flush();
			double a = sc.nextDouble();
		    System.out.printf("Digite a segunda nota: ");
		    System.out.flush();
			double b = sc.nextDouble();
			System.out.printf("Digite a terceira nota: ");
			System.out.flush();
			double c = sc.nextDouble();

			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

			System.out.printf("%.1f%n", media);
		}

		sc.close();
	}
}
