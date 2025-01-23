
public class Anzahlsterne {
	
	public static void main(String[] args) {
		
		char[][] zeichen = {
				{'A','B',' '}, 
				{'*','B','C'}, 
				{'*','*','*'}};
		
		char[][] zeichen2 = {
				{'A','B',' ','*','*'}, 
				{'*','B','C','A', '*'}, 
				{'*','*','*', '*','*'}};
		
		System.out.println("Analyse für Feld 1:");
		berechneSterneProZeile(zeichen);
		berechneSterneProSpalte(zeichen);
		berechneAnzahlZeilen(zeichen);
		
		System.out.print("\n----------------------------\n");
		
		System.out.println("Analyse für Feld 2:");
		berechneSterneProZeile(zeichen2);
		berechneSterneProSpalte(zeichen2);
		berechneAnzahlZeilen(zeichen2);
		
	}
	public static void berechneSterneProZeile(char[][] feld) {
		
		for (int i=0; i<feld.length; i++){
			int n = 0;
			for (int j=0; j<feld[i].length; j++){
				if(feld[i][j] == '*') {
					n++;
				}
			}
			System.out.print(i + ": " +n +"\n");
		}
		System.out.print("\n");
	}
	public static void berechneSterneProSpalte(char[][] feld) {
		
		for (int j=0; j<feld[0].length; j++){
			int n=0;
			for (int i=0; i< feld.length; i++){
				if(feld[i][j] == '*') {
					n++;
				}
			}
			System.out.print(j + ": " +n +"\n");
		}
		System.out.print("\n");
	}
    public static void berechneAnzahlZeilen(char[][] feld) {
    	
    	int z = 0;
    	for(int i = 0; i<feld.length; i++) {
    		int n=0;
    		for(int j = 0; j<feld[i].length; j++) {
    			if(feld[i][j] == '*') {
    				n++;
    			}
    		}
    		if(n>1) {
    			z++;
    		}
    	}
    	System.out.print(z + " Zeilen");
    }
}
