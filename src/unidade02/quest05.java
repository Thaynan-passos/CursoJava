package unidade02;
import java.util.Scanner;

public class quest05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    
		System.out.println("Digite o código do produto e a quantidade desejada:");
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		double total;
		
		if( codigo ==1) {
			total = quantidade * 4.00;
		} else if (codigo == 2) {
			total = quantidade * 4.50;
		} else if (codigo == 3) {
			total = quantidade * 5.00;
		} else if (codigo == 4) {
			total = quantidade * 2.00;
		} else if (codigo == 5) {
			total = quantidade * 1.50;
		} else {
			total = 0.0;
		}
			
		System.out.printf("Total: R$ %.2f%n", total);
		sc.close();
	}

}
