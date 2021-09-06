import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {

    JTextField textFuerName;
    JTextField textFuerGeburtsdatum;

    public Gui() {
        this.setTitle("Meine Klausuranwendung");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);

        //Set menu bar
        this.setJMenuBar(new MyMenu());

        //Creating container, leftpanel and rightpanel
        Container container = this.getContentPane();
        container.setLayout(new BorderLayout());

        JPanel southPanel = new JPanel();
        container.add(southPanel, BorderLayout.SOUTH);

        southPanel.setLayout(new FlowLayout());
        JButton zuruecksetzen = new JButton("Zurücksetzen");
        southPanel.add(zuruecksetzen);

        JButton speichern = new JButton("Speichern");
        southPanel.add(speichern);

        speichern.addActionListener(e-> Control.listenerFuerSpeichern());

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(2, 1));
        container.add(mainPanel);

        JPanel obererPanel = new JPanel();
        mainPanel.add(obererPanel);

        obererPanel.setLayout(new GridLayout(1, 2));
        obererPanel.add(new JLabel("Name"));

        textFuerName = new JTextField();
        obererPanel.add(textFuerName);

        JPanel untererPanel = new JPanel();
        mainPanel.add(untererPanel);

        untererPanel.setLayout(new GridLayout(1, 2));
        untererPanel.add(new JLabel("Geburtsdatum"));

        textFuerGeburtsdatum = new JTextField();
        untererPanel.add(textFuerGeburtsdatum);
    }

    public JTextField getTextFuerGeburtsdatum() {
        return textFuerGeburtsdatum;
    }

    public JTextField getTextFuerName() {
        return textFuerName;
    }
}
