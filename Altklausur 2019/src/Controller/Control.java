package Controller;

import IO.Datenhaltung;
import Model.CustomException;
import Model.Student;
import View.GUI;

import javax.swing.*;
import java.io.IOException;
import java.time.format.DateTimeParseException;

public class Control {
    public static GUI gui;
    public static Student student;

    public static void listenerFuerSpeichern() {

        try {
            String anredeCombo = gui.getComboBox().getSelectedItem().toString();
            String nameTextfield = gui.getTextFuerName().getText();
            String geburtstagTextField = gui.getTextFuerMat().getText();

            student = new Student(anredeCombo, nameTextfield, geburtstagTextField);

            int dialogOptions = JOptionPane.showConfirmDialog(null, anredeCombo + " " + nameTextfield + " erfolgreich gespeichert.", "MELDUNG", JOptionPane.YES_NO_OPTION);
            if (dialogOptions == JOptionPane.YES_OPTION) {
                Datenhaltung data = new Datenhaltung();
                try {
                    data.speichereStudent(student);
                } catch (IOException e) {
                    e.printStackTrace();
                }
               // JOptionPane.showConfirmDialog(null, student.getName() + " erfolgreich gespeichert!", "MELDUNG", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE);
            }
        } catch (DateTimeParseException | CustomException exception) {
            JOptionPane.showConfirmDialog(null, " " + exception.getMessage(), "FEHLERMELDUNG", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE);
        }
    }

    public static void main(String[] args) {
        gui = new GUI();
        gui.setVisible(true);
    }
}
