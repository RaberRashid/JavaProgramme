// Dieses Java-Programm berechnet das Guthaben einer Geldanlage basierend auf der gewählten Verzinsung
// und der Bonuszahlung für eine angegebene Laufzeit und einen Anlagebetrag. Der Benutzer kann zwischen
// verschiedenen Verzinsungsoptionen wählen und das endgültige Guthaben wird berechnet.
import java.util.Scanner;

public class Geldanlage {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Geben sie die Jahreslaufzeit ein: \n");
		int laufzeit = sc.nextInt();
		
		
		System.out.print("Geben sie den Anlagebetrag in Euro ein:  \n");
		double anlagebetrag = sc.nextDouble();
		
		System.out.print("--------------------------------------"
				+ "-------------\n"
				+ "1.  1,5 % Verzinsung ohne Bonuszahlung\n"
				+ "2.  0,7 % Verzinsung mit 15 Euro Bonuszahlung\n"
				+ "3.  0,4 % Verzinsung mit 20 Euro Bonuszahlung\n"
				+ "4.  0,1 % Verzinsung mit 50 Euro Bonuszahlung\n"
				+ "5.  Fertig\n"
				+ "---------------------------------------------"
				+ "------\n");
		
		int auswahl;
		double guthaben = 0;
		do {
		System.out.print("Bitte wählen sie eine der Möglichkeiten 1-5 aus: ");
		auswahl = sc.nextInt();
		} 
		while (auswahl < 1 || auswahl > 5);
		
		if (auswahl == 1) {
			guthaben = berechneGuthaben(anlagebetrag, laufzeit, 0.015, 0);
		}
		else if (auswahl == 2) {
			guthaben = berechneGuthaben(anlagebetrag, laufzeit, 0.007, 15);
		}
		else if (auswahl == 3) {
			guthaben = berechneGuthaben(anlagebetrag, laufzeit, 0.004, 20);
		}
		else if (auswahl == 4) {
			guthaben = berechneGuthaben(anlagebetrag, laufzeit, 0.001, 50);
		}
		else if (auswahl == 5) {
			System.out.print("Alles klar! \n");
		}
		System.out.print(guthaben);
		
	}
	public static double berechneGuthaben(double abetrag, int lzeit, 
			double zsatz, int bzahlung) {
		
		double ghaben = abetrag + (abetrag * lzeit * (zsatz + bzahlung));
		return ghaben;
		
	}
}
