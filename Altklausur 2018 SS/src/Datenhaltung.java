import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Datenhaltung {

    public static void speichereStudent(Student student){
        File file = new File("C:/Hochschule IO Order/Datendatei.txt");
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String name = student.getName();
        LocalDate geburtstag = student.getGeburtsdatum();

        String geburtstagString = geburtstag.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(name + ";" +geburtstagString);
            fileWriter.close();
            System.out.println("Erfolgreich gespeichert");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
