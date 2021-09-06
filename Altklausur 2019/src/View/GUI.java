package View;

import Controller.Control;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {


    private JTextField textFuerName;
    private JTextField textFuerMat;
    private JComboBox comboBox;
    private Container container;
    private JButton speichern;
    private JPanel mainPanel = createMainPanel();
    private JPanel southPanel = createSouthPanel();

    public GUI() {
        this.setTitle("Meine Klausuranwendung");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);

        //Creating container, leftpanel and rightpanel
        container = this.getContentPane();
        container.setLayout(new BorderLayout());

        container.add(southPanel, BorderLayout.SOUTH);
        container.add(mainPanel);

        JPanel obererPanel = new JPanel();
        obererPanel.setLayout(new GridLayout(1, 2));
        mainPanel.add(obererPanel);

        JPanel panelRight = new JPanel();
        panelRight.setLayout(new FlowLayout(FlowLayout.LEFT));
        obererPanel.add(panelRight);

        String[] combo = new String[]{"Herr", "Frau", "Divers"};
        comboBox = new JComboBox(combo);
        panelRight.add(comboBox);

        textFuerName = new JTextField();
        obererPanel.add(textFuerName);

        JPanel untererPanel = new JPanel();
        untererPanel.setLayout(new GridLayout(1, 2));
        mainPanel.add(untererPanel);

        JLabel labelMat = new JLabel("MatrNr.");
        untererPanel.add(labelMat);

        textFuerMat = new JTextField();
        untererPanel.add(textFuerMat);
    }

    private JPanel createSouthPanel(){
        southPanel = new JPanel();
        southPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

        speichern = new JButton("Speichern");
        speichern.addActionListener(e -> Control.listenerFuerSpeichern());
        southPanel.add(speichern);

        return southPanel;
    }

    private JPanel createMainPanel(){
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(2, 1));

        return mainPanel;
    }

    public JTextField getTextFuerName() {
        return textFuerName;
    }

    public JTextField getTextFuerMat() {
        return textFuerMat;
    }

    public JComboBox getComboBox(){
        return comboBox;
    }
}
