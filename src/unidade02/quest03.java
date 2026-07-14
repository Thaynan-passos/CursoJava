package unidade02;
import java.util.Scanner;

public class quest03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um números inteiros:");
		System.out.flush();
		int A = sc.nextInt();
		System.out.println("Digite outro número inteiro:");
		System.out.flush();
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("São múltiplos");
		} else {
			System.out.println("Não são múltiplos");
		}
		sc.close();
	}
}
