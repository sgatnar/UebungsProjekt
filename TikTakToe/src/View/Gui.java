package View;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class Gui extends JFrame{

    private JPanel mainPanel = new JPanel();
    private JPanel lowerPanel = new JPanel();

    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JPanel panel6;
    private JPanel panel7;
    private JPanel panel8;
    private JPanel panel9;

    private Container contentPane;
    private static String player1;
    private int playercounter = 0;
    private static String player2;
    private String randomPlayer;
    private JLabel label;
    private static JButton button1;
    public static boolean button1State = false;

    public Gui() {
        this.setTitle("Tik Tak Toe");//Defines a title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 800);//Width and Height of the window
        this.setLocationRelativeTo(null);//Defines the location of the window
        this.setResizable(true);//Window is resizable
        Border border = BorderFactory.createLineBorder(Color.darkGray);

        JTextField player1Text = new JTextField(8);
        JTextField player2Text = new JTextField(8);

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Player 1:"));
        myPanel.add(player1Text);
        myPanel.add(new JLabel("Player 2:"));
        myPanel.add(player2Text);

        Object[] options1 = { "START GAME", "QUIT" };

        int result = JOptionPane.showOptionDialog(null, myPanel, "DEFAULT SETTINGS",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options1, null);
        player1 = player1Text.getText().toUpperCase();
        player2 = player2Text.getText().toUpperCase();
        if (result == JOptionPane.OK_OPTION) {
            System.out.println("Player 1: " + player1);
            System.out.println("Player 2: " + player2);
        }else {
            System.exit(0);
        }

        //Creating a container and set a layout
        this.contentPane = this.getContentPane();
        contentPane.setLayout(new BorderLayout());

        System.out.println("Random number: " + generateRandomNumber());
        if (generateRandomNumber() % 2 == 0){
            System.out.println("DURCH 2 TEILBAR");
            System.out.println(getPlayer1() + "starts the game");
            randomPlayer = getPlayer1();
        }
        else {
            System.out.println("NICHT DURCH 2 TEILBAR");
            System.out.println(getPlayer2() + " starts the game");
            randomPlayer = getPlayer2();
        }

        label = new JLabel("It's " + randomPlayer + "'s turn");
        label.setFont(new Font("Calibri", Font.BOLD, 26));
        lowerPanel.setBackground(Color.GRAY);
        lowerPanel.add(label);

        mainPanel.setLayout(new GridLayout(3, 3));
        contentPane.add(mainPanel, BorderLayout.CENTER);
        contentPane.add(lowerPanel, BorderLayout.SOUTH);

        panel1 = new JPanel();
        panel1.setBorder(null);
        panel1.setLayout(new BorderLayout());
        button1 = new JButton();
        button1.setBackground(Color.white);
        panel1.add(button1);
        button1.setForeground(new Color(0, 135, 200).brighter());
        UIManager.put("Button.select", new Color(3, 59, 90));
        button1.setForeground(new Color(0, 135, 200).brighter());
        button1.setHorizontalTextPosition(SwingConstants.CENTER);
        button1.setBorder(null);

        System.out.println(" Die erste");
        isButtonPressed();

        UIManager.put("Button.select", new Color(3, 59, 90));
        button1.addMouseListener(new MouseListener() {
            @Override
            public void mouseReleased(MouseEvent e) {
                button1.setBackground(Color.BLUE.brighter());
                playercounter++;
                System.out.println(playercounter);
                label.setText("It's " + player2Text.getText() + "'s turn");
                System.out.println(player2Text.getText().toUpperCase());
                isButtonPressed();
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseClicked(MouseEvent e) {
            }
        });

        mainPanel.add(panel1);

        panel2 = new JPanel();
        panel2.setBorder(border);
        mainPanel.add(panel2);

        panel3 = new JPanel();
        panel3.setBorder(border);
        mainPanel.add(panel3);

        panel4 = new JPanel();
        panel4.setBorder(border);
        mainPanel.add(panel4);

        panel5 = new JPanel();
        panel5.setBorder(border);
        mainPanel.add(panel5);

        panel6 = new JPanel();
        panel6.setBorder(border);
        mainPanel.add(panel6);

        panel7 = new JPanel();
        panel7.setBorder(border);
        mainPanel.add(panel7);

        panel8 = new JPanel();
        panel8.setBorder(border);
        mainPanel.add(panel8);

        panel9 = new JPanel();
        panel9.setBorder(border);
        mainPanel.add(panel9);
    }

    private JPanel createPanels(){
        for (int i = 1; i < 10; i++) {

        }
        return panel1;
    }

    private static void isButtonPressed(){
        if (button1.isEnabled()){
            button1State = true;
            System.out.println(button1State);
        }
    }

    private static int generateRandomNumber(){
        Random randomNumber = new Random();
        return randomNumber.nextInt();
    }

    public static String getPlayer1() {
        return player1;
    }

    public static String getPlayer2() {
        return player2;
    }
}
