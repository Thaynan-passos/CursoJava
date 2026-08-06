package application;

public class Demo00 {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria", "Alex", "Bob"};
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		for (String obj : vect) {
			System.out.println(obj);
		}

	}

}
