
import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;

public class Oppgave1 {

	public static void main(String[] args) {

		double skatt = 0;
		double brutto = parseDouble(showInputDialog("Inntekt :"));

		if (brutto >= 934051) {
			skatt = brutto * 0.1452;

		} else if (934050 >= brutto && brutto >= 580650) {
			skatt = brutto * 0.1152;

		} else if (580650 >= brutto && brutto >= 230950) {
			skatt = brutto * 0.0241;

		} else if (230950 >= brutto && brutto >= 164100) {
			skatt = brutto * 0.0093;

		} else {
			skatt = 0;

		}

		showMessageDialog(null, "din skatt blir " + skatt + "kr");

	}

}
