package main;

public class Ex2 {

	public static void main(String[] args) {
		double d = 2.95;
		int i = 4;
		System.out.println(++d>i?d:i);
	}
}
// afiseaza 4.0 // fara eroare 
// deoarece prima instructiuni nu e adevarata atunci afiseaza valoarea lui i, adica 4