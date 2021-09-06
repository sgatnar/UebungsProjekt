import javax.swing.*;

public class MenuForGui extends JMenuBar {

    public MenuForGui() {

        JMenu datei = new JMenu("Datei");
        add(datei);

        JMenuItem beenden = new JMenuItem("Beenden");
        datei.add(beenden);
    }
}
