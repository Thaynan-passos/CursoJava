package Exercise01;
import java.util.Locale;
import java.util.Scanner;


public class TriPrograma {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo triangulo = new Triangulo();
		
		System.out.println("Enter the width of the triangle: ");
		triangulo.width = sc.nextDouble();
		
		System.out.println("Enter the height of the triangle: ");
		triangulo.height = sc.nextDouble();
		
		System.out.printf("Area: %.2f%n", triangulo.area());
		System.out.printf("Perimeter: %.2f%n", triangulo.perimeter());
		System.out.printf("Diagonal: %.2f%n", triangulo.diagonal());
		
		sc.close();
	}
	

}
