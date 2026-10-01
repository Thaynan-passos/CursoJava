package application;

import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] vect = sc.nextLine().split(" ");
		 try {
			 int position = Integer.parseInt(sc.nextLine());
			 System.out.println(vect[position]);
		 }
		 catch(ArrayIndexOutOfBoundsException e) {
			 System.out.println("Invalid position!");
			 e.printStackTrace();
		 }
		 catch(NumberFormatException e) {
			 System.out.println("Input is not a valid integer!");
			 e.printStackTrace();
		 }
		 
		 System.out.println("End of program");
		
		
		sc.close();

	}

}
