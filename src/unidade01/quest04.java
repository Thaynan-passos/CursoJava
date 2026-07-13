package unidade01;
import java.util.Scanner;
import java.util.Locale;
public class quest04 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero, horas;
		double valorHora, salario;
		
		System.out.println("Digite o numero do funcionario: ");
		System.out.flush();
		numero = sc.nextInt();
		System.out.println("Digite as horas trabalhadas: ");
		System.out.flush();
		horas = sc.nextInt();
		System.out.println("Digite o valor por hora: ");
		System.out.flush();
		valorHora = sc.nextDouble();
		
		salario = valorHora * horas;
		
		System.out.println("NUBER = " + numero);
		System.out.println("SALARY = U$ " + String.format("%.2f", salario));
		sc.close();
	}

}
