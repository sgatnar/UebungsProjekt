package IO;

import Model.CustomException;
import Model.Student;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Datenhaltung {

    private static String matrikelNummer;
    private static  String anrede;
    private static String name;

    public static void speichereStudent(Student student) throws IOException{
        File file = new File("Datendatei.txt");
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
        anrede = student.getAnrede();
        name = student.getName();
        matrikelNummer = String.valueOf(student.getMatriculationNumber());

        student = new Student(anrede, name, matrikelNummer);
        } catch (CustomException e) {
            e.printStackTrace();
        }

        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(anrede + " " + name + "(MatNr.: " + matrikelNummer + ")");
            fileWriter.close();
            System.out.println("Erfolgreich gespeichert");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            speichereStudent(new Student("Herr", "Gatnar", "209050"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }
}
