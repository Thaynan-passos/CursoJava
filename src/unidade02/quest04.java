package unidade02;
import java.util.Scanner;

public class quest04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a hora inicial: ");
		System.out.flush();
		int horaInicial = sc.nextInt();
	    System.out.print("Digite a hora final: ");
	    System.out.flush();
	    int horaFinal = sc.nextInt();
	    
	    int duracao;
	    if (horaFinal > horaInicial) {
	        duracao = horaFinal - horaInicial;
	    } else {
	        duracao = 24 - horaInicial + horaFinal;
	    }
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		sc.close();
	}

}
