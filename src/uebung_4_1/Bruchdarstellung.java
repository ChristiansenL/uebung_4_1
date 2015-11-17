package uebung_4_1;

public class Bruchdarstellung {

	public static void bruch(int a, int b) {

		double c = a;
		double d = b;
		double x = 0;

		double ergebnis = c / d;
		
		if (a < b) {x = b;}
		else {x = a;}

		System.out.println(a);
		System.out.println("-" + " = " + ergebnis);
		System.out.println(b);
		System.out.println("");

	}

	public static void main(String[] args) {

		int zaehler = 9;
		int nenner = 4;

		bruch(zaehler, nenner);

	}

}
