import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class GUI extends JFrame {

    private JPanel untererPanel = createUntererPanel();
    private JPanel mainpanel = createMainPanel();
    private JTextField textFeldFuerVorname;
    private JTextField textFeldFuerNachname;

    private JRadioButton negativRadioButton;
    private JRadioButton positivRadioButton;

    public GUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 450);
        setLocationRelativeTo(null);
        setJMenuBar(new MenuForGui());

        Container container = this.getContentPane();
        container.setLayout(new BorderLayout());

        JLabel coronaTestergebnis = new JLabel("Corona Testergebnis");
        container.add(coronaTestergebnis, BorderLayout.NORTH);

        container.add(mainpanel);
        container.add(untererPanel, BorderLayout.SOUTH);
    }

    private JPanel createUntererPanel(){
        untererPanel = new JPanel();
        untererPanel.setLayout(new FlowLayout());

        JButton speichern = new JButton("speichern");
        speichern.addActionListener(e-> {
            try {
                Controller.listenerFuerSpeichern();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });
        untererPanel.add(speichern);

        JButton zuruecksetzen = new JButton("zurücksetzen");
        untererPanel.add(zuruecksetzen);

        return untererPanel;
    }

    private JPanel createMainPanel(){
        mainpanel = new JPanel();
        mainpanel.setLayout(new GridLayout(2, 3));

        mainpanel.add(new JLabel("Vorname"));

        textFeldFuerVorname = new JTextField();
        mainpanel.add(textFeldFuerVorname);

        positivRadioButton = new JRadioButton("positiv");
        mainpanel.add(positivRadioButton);

        mainpanel.add(new JLabel("Nachname"));

        textFeldFuerNachname = new JTextField();
        mainpanel.add(textFeldFuerNachname);

        negativRadioButton = new JRadioButton("negativ");
        mainpanel.add(negativRadioButton);

        return mainpanel;
    }

    public JTextField getTextFuerVorname() {
        return textFeldFuerVorname;
    }

    public JTextField getTextFuerNachname() {
        return textFeldFuerNachname;
    }

    public JRadioButton getPositiv(){
        return positivRadioButton;
    }

    public JRadioButton getNegativ(){
        return negativRadioButton;
    }
}
