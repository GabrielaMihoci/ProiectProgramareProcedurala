package main;

public class Ex4 {

	public static void main(String[] args) {
		int suma = 0;
		for(int i = 1; i< 10; i++) {
			suma += suma + i;
		}
System.out.print("Suma este: " + suma);
	}
}
// Suma este 1013
