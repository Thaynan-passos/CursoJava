package unidade02;
import java.util.Scanner;

public class quest02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		
		int A = sc.nextInt();
		
		if(A % 2 == 0) {
			System.out.println("O valor de A é par.");
		}
	
		else {
			System.out.println("O valor de A é impar.");
		}
		sc.close();
	}

}