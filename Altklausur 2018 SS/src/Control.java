import javax.swing.*;
import java.time.format.DateTimeParseException;

public class Control {

    private static Gui gui;

    public static void listenerFuerSpeichern(){
        gui = new Gui();
        try {
            String nameTextfield = gui.getTextFuerName().getText();
            String geburtstagTextField = gui.getTextFuerGeburtsdatum().getText();

            Student student = new Student(nameTextfield, geburtstagTextField);

            int dialogOptions = JOptionPane.showConfirmDialog(null, "Student speichern?", "SPEICHERN", JOptionPane.YES_NO_OPTION);
            if (dialogOptions == JOptionPane.YES_OPTION) {
                Datenhaltung data = new Datenhaltung();
                data.speichereStudent(student);
                JOptionPane.showConfirmDialog(null, student.getName() + " erfolgreich gespeichert!", "MELDUNG", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE);
            }
        } catch (DateTimeParseException exception) {
            JOptionPane.showConfirmDialog(null, "Folgender Fehler:\n" + exception.getMessage(), "FEHLERMELDUNG", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE);
        }
    }

    public static void main(String[] args) {
        gui = new Gui();
        gui.setVisible(true);
    }
}
