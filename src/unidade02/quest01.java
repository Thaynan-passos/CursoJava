package unidade02;
import java.util.Scanner;

public class quest01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		
		int A = sc.nextInt();
		
		if(A < 0) {
			System.out.println("O valor de A é negativo.");
		}
		else if(A > 0) {
			System.out.println("O valor de A é positivo.");
		}
		else {
			System.out.println("O valor de A é zero.");
		}
		sc.close();
	}

}
