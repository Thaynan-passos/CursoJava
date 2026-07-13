package unidade01;
import java.util.Scanner;

public class quest03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, dif;
		System.out.println("Digite os valores de A, B, C e D: ");
		System.out.print("A: ");
		System.out.flush();
		A = sc.nextInt();
		System.out.print("B: ");
		System.out.flush();
		B = sc.nextInt();
		System.out.print("C: ");
		System.out.flush();
		C = sc.nextInt();
		System.out.print("D: ");
		System.out.flush();
		D = sc.nextInt();
		
		dif = A * B - C * D;
		
		System.out.println("DIFERENCA = " + dif);
		sc.close();
		
	}
	
}
