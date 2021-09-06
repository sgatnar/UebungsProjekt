import javax.swing.*;

public class MyMenu extends JMenuBar {

    public MyMenu() {
        JMenu datei = new JMenu("Datei");
        add(datei);

        JMenuItem beenden = new JMenuItem("Beenden");
        datei.add(beenden);

    }
}
