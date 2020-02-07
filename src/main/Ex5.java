package main;

public class Ex5 {

	public static void main(String[] args) {
		int n = 13;
	       int result = 1;
	       for (int i = 1; i < n; i++) {
	           result = result * i;
	       }
	       System.out.println("Factorialul lui n<13 este " + result);
	}
}
