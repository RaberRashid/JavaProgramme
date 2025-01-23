// Dieses Java-Programm überprüft, ob eine eingegebene Zahl ein "Pangramm" ist,
// d.h. ob jede Ziffer von 0 bis 9 mindestens einmal in der Zahl vorkommt.
import java.util.Scanner;

public class pangramm {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Geben sie eine ganze Zahl ein: \n");
		long eingabe = sc.nextLong();
		boolean ergebnis = istPangramm(eingabe);
		System.out.print(ergebnis);
		sc.close();
	}
	static boolean istPangramm(long x) {
		long letzteziffer = 0;
		boolean hat0 = false, hat1 = false, hat2 = false, hat3 = false, hat4 = false;
		boolean hat5 = false, hat6 = false, hat7 = false, hat8 = false, hat9 = false;
		
		while (x > 0) {
			letzteziffer = x % 10;
			
			if (letzteziffer == 0) {
				hat0 = true;
			}
			else if (letzteziffer == 1) {
				hat1 = true;
			}
			else if (letzteziffer == 2) {
				hat2 = true;
			}
            else if (letzteziffer == 3) {
            	hat3 = true;
			}
            else if (letzteziffer == 4) {
            	hat4 = true;
			}
            else if (letzteziffer == 5) {
            	hat5 = true;
			}
            else if (letzteziffer == 6) {
            	hat6 = true;
			}
            else if (letzteziffer == 7) {
            	hat7 = true;
            }
            else if (letzteziffer == 8) {
            	hat8 = true;
			}
            else if (letzteziffer == 9) {
            	hat9 = true;
			}		
			x = x/10;
		}
		return hat0 && hat1 && hat2 && hat3 && hat4 && hat5 && hat6 && hat7 && hat8 && hat9;
		
	}
	

}
