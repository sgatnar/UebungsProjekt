package Model;

public class CustomException extends Exception {

    public CustomException() {
        super("Fehlermeldung: Die Matrikelnummer muss aus 6 Zeichen bestehen!");
    }
}
