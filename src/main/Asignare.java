package main;

public class Asignare {

	public static void main(String[] args) {
		int a = 3;
		int b = (a=2)*a;
		int c = b * (b=5);
		System.out.println("a=" + a + ", b=" + b + ", c=" + c);
	}
}
// afiseaza a=2, b=5, c=20
// a=2 deoarece afiseaza valoarea inainte de incrementarea cu 1
// b=5 deoarece afiseaza valoarea inainte de incrementarea cu 1
// c=20 deoarece 4*5 = 20 (valoare pozitiva)
