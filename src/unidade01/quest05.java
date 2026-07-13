package unidade01;
import java.util.Locale;
import java.util.Scanner;


public class quest05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, qua1, qua2;
		double valor1, valor2, total;
		
		System.out.println("Digite o codigo do produto");
		System.out.flush();
		cod1 = sc.nextInt();
		System.out.println("Digite o quantidade do produto");
		System.out.flush();
		qua1 = sc.nextInt();
		System.out.println("Digite o valor do produto");
		System.out.flush();
		valor1 = sc.nextDouble();
		
		System.out.println("Digite o codigo do produto");
		System.out.flush();
		cod2 = sc.nextInt();
		System.out.println("Digite a quantidade do produto");
		System.out.flush();
		qua2 = sc.nextInt();
		System.out.println("Digite o valor do produto");
		System.out.flush();
		valor2 = sc.nextDouble();
		
		total = valor1 * qua1 + valor2 * qua2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		sc.close();
		
			
		
	}
}
