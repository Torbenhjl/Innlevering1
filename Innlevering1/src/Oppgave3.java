import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;



public class Oppgave3 {

	public static void main(String[] args) {
		
		int fact = 1;
		String nummerTxt = showInputDialog("Skriv et tall :");
		int nummer = parseInt(nummerTxt);
		
		for (int i = 1; i <= nummer; i++) {
			fact = fact * i;
		}
		showMessageDialog(null, "fakultet av " + nummer + " er: " + fact);
	}

}
