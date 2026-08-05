package application;

import java.util.Scanner;
import java.util.Locale;

public class Program01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of people: ");
		int n = sc.nextInt();
		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Enter the height of person " + (i + 1) + ": ");
			vect[i] = sc.nextDouble();
		}

		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}

		double avg = sum / n;

		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);

		sc.close();
	}

}
