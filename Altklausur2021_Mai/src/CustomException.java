import java.io.IOException;

public class CustomException extends IOException {
    public CustomException() {
        super("Bitte geben Sie mindestens 3 Zeichen ein!");
    }
}
