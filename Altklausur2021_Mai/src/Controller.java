import javax.swing.*;
import java.io.IOException;

public class Controller {
    private static GUI gui;

    public static void main(String[] args) {
        gui = new GUI();
        gui.setVisible(true);
    }

    public static void listenerFuerSpeichern() throws IOException {
        try {
            String vornameText = gui.getTextFuerVorname().getText();
            String nachnameTextField = gui.getTextFuerNachname().getText();

            Testergebnis testergebnis = null;
            if (gui.getPositiv().isSelected())
            {
                testergebnis = Testergebnis.POSITIV;
            }
            else if (gui.getNegativ().isSelected())
            {
                testergebnis = Testergebnis.NEGATIV;
            }

            System.out.println(vornameText);
            System.out.println(nachnameTextField);
            System.out.println(testergebnis);

            CoronaTest c = new CoronaTest(vornameText, nachnameTextField, Testergebnis.NEGATIV );

            int dialogOptions = JOptionPane.showConfirmDialog(null, "Testergebnis für " + vornameText + " " + nachnameTextField + " wurde gespeichert", "SPEICHERN", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE);
            if ( dialogOptions == JOptionPane.YES_OPTION) {
                Datenhaltung data = new Datenhaltung();
                data.speichereTestergebnis(c);
            }
        } catch (CustomException c){
            JOptionPane.showConfirmDialog(null, "Vorname und Nachname müssen mindestens 3 Zeichen lang sein:\n", "FEHLERMELDUNG", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE);
        }
    }
}
