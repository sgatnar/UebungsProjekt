import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Student {

    private String name;
    private LocalDate geburtsdatum;

    public Student(String name, String geburtsdatum) {
        this.name = name;
        setGeburtsdatum(geburtsdatum);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(String geburtsdatumString) throws DateTimeParseException {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            this.geburtsdatum = LocalDate.parse(geburtsdatumString, formatter);
        }
        catch (DateTimeParseException e){
            e.printStackTrace();
        }
    }
}
