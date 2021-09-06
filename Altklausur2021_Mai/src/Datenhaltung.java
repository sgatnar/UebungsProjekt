import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Datenhaltung {

    public static void speichereTestergebnis(CoronaTest coronatest) throws IOException {
        File file = new File("testergebnisse.txt");
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String vorname = coronatest.getVorname();
        String nachname = coronatest.getNachname();
        String test = String.valueOf(coronatest.getTestergebnis());

        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(vorname + " " + nachname + " : " + test);
            fileWriter.close();
            System.out.println("Erfolgreich gespeichert");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
