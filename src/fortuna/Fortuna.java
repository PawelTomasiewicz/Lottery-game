package fortuna;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by Paweł Tomasiewicz
 */

public class Fortuna extends JFrame
{
    JPanel panelTop;
    JPanel panelBootom;
    JPanel panelCenter;

    JLabel player;
    JLabel fortuna;

    JButton buttonCheck;

    JTextField fortunaField1;
    JTextField fortunaField2;
    JTextField fortunaField3;
    JTextField fortunaField4;
    JTextField fortunaField5;
    JTextField fortunaField6;

    JTextField playerField1;
    JTextField playerField2;
    JTextField playerField3;
    JTextField playerField4;
    JTextField playerField5;
    JTextField playerField6;

    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JLabel label5;
    JLabel label6;

    boolean correct1;
    boolean correct2;
    boolean correct3;
    boolean correct4;
    boolean correct5;
    boolean correct6;

    public Fortuna()
    {
        this.setBounds(100, 250, 1200, 400);
        this.setTitle("Fortuna");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        initComponents();
        setBorder();
        setFonts();
        listnener();
    }

    void initComponents()
    {
        panelTop = new JPanel();
        panelBootom = new JPanel();
        panelCenter = new JPanel();

        this.getContentPane().add(panelTop, BorderLayout.PAGE_START);
        this.getContentPane().add(panelCenter, BorderLayout.CENTER);
        this.getContentPane().add(panelBootom, BorderLayout.PAGE_END);

        player = new JLabel("Proszę wytypować sześć liczb od 1 do 49, następnie wprowadzić je w wybrane pola i zatwierdzić każdą podaną liczbę ENTERem");
        fortuna = new JLabel("Pola maszyny losującej");

        playerField1 = new JTextField(1);
        playerField2 = new JTextField(1);
        playerField3 = new JTextField(1);
        playerField4 = new JTextField(1);
        playerField5 = new JTextField(1);
        playerField6 = new JTextField(1);

        fortunaField1 = new JTextField(1);
        fortunaField2 = new JTextField(1);
        fortunaField3 = new JTextField(1);
        fortunaField4 = new JTextField(1);
        fortunaField5 = new JTextField(1);
        fortunaField6 = new JTextField(1);

        label1 = new JLabel("");
        label2 = new JLabel("");
        label3 = new JLabel("Pola maszyny losującej");
        label4 = new JLabel("");
        label5 = new JLabel("");
        label6 = new JLabel("");

        buttonCheck = new JButton("Losuj");

        panelTop.add(player, BorderLayout.CENTER);
        panelBootom.add(buttonCheck, BorderLayout.CENTER);

        GridLayout gridLayout = new GridLayout(3, 6);
        panelCenter.setLayout(gridLayout);

        panelCenter.add(playerField1);
        panelCenter.add(playerField2);
        panelCenter.add(playerField3);
        panelCenter.add(playerField4);
        panelCenter.add(playerField5);
        panelCenter.add(playerField6);

        panelCenter.add(label1);
        panelCenter.add(label2);
        panelCenter.add(label3);
        panelCenter.add(label4);
        panelCenter.add(label5);
        panelCenter.add(label6);

        panelCenter.add(fortunaField1);
        panelCenter.add(fortunaField2);
        panelCenter.add(fortunaField3);
        panelCenter.add(fortunaField4);
        panelCenter.add(fortunaField5);
        panelCenter.add(fortunaField6);
    }

    public void setBorder()
    {
        panelCenter.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
        panelCenter.setBackground(Color.ORANGE);
        buttonCheck.setBackground(Color.cyan);
    }

    public void setFonts()
    {
        Font font = new Font("Comic Sans MS", Font.BOLD, 30);
        Font font2 = new Font("Comic Sans MS", Font.BOLD, 16);

        buttonCheck.setFont(font2);
        label3.setFont(font2);
        player.setFont(font2);

        playerField1.setFont(font);
        playerField2.setFont(font);
        playerField3.setFont(font);
        playerField4.setFont(font);
        playerField5.setFont(font);
        playerField6.setFont(font);

        fortunaField1.setFont(font);
        fortunaField2.setFont(font);
        fortunaField3.setFont(font);
        fortunaField4.setFont(font);
        fortunaField5.setFont(font);
        fortunaField6.setFont(font);
    }

    public void getNumbers()
    {
        Random random = new Random();
        int losuje1 = random.nextInt(49);
        int losuje2 = random.nextInt(49);
        int losuje3 = random.nextInt(49);
        int losuje4 = random.nextInt(49);
        int losuje5 = random.nextInt(49);
        int losuje6 = random.nextInt(49);

        String player1 = playerField1.getText();
        String player2 = playerField2.getText();
        String player3 = playerField3.getText();
        String player4 = playerField4.getText();
        String player5 = playerField5.getText();
        String player6 = playerField6.getText();

        if (!(player1.equals(" ") && !player1.isEmpty()) &&
                (!player2.isEmpty() && !(player2.equals(" ")) &&
                        (!player3.isEmpty()) && !(player3.equals(" ")) &&
                        (!player4.isEmpty()) && !(player4.equals(" ")) &&
                        (!player5.isEmpty()) && !(player5.equals(" ")) &&
                        (!player6.isEmpty()) && !(player6.equals(" "))))
        {
            fortunaField1.setText(String.valueOf(losuje1));
            fortunaField2.setText(String.valueOf(losuje2));
            fortunaField3.setText(String.valueOf(losuje3));
            fortunaField4.setText(String.valueOf(losuje4));
            fortunaField5.setText(String.valueOf(losuje5));
            fortunaField6.setText(String.valueOf(losuje6));
        }

        if (player1.equalsIgnoreCase(String.valueOf(losuje1)) ||
                player1.equalsIgnoreCase(String.valueOf(losuje2)) ||
                player1.equalsIgnoreCase(String.valueOf(losuje3)) ||
                player1.equalsIgnoreCase(String.valueOf(losuje4)) ||
                player1.equalsIgnoreCase(String.valueOf(losuje5)) ||
                player1.equalsIgnoreCase(String.valueOf(losuje6)))
        {
            correct1 = true;
        }

        if (player2.equalsIgnoreCase(String.valueOf(losuje1)) ||
                player2.equalsIgnoreCase(String.valueOf(losuje2)) ||
                player2.equalsIgnoreCase(String.valueOf(losuje3)) ||
                player2.equalsIgnoreCase(String.valueOf(losuje4)) ||
                player2.equalsIgnoreCase(String.valueOf(losuje5)) ||
                player2.equalsIgnoreCase(String.valueOf(losuje6)))
        {
            correct2 = true;
        }

        if (player3.equalsIgnoreCase(String.valueOf(losuje1)) ||
                player3.equalsIgnoreCase(String.valueOf(losuje2)) ||
                player3.equalsIgnoreCase(String.valueOf(losuje3)) ||
                player3.equalsIgnoreCase(String.valueOf(losuje4)) ||
                player3.equalsIgnoreCase(String.valueOf(losuje5)) ||
                player3.equalsIgnoreCase(String.valueOf(losuje6)))
        {
            correct3 = true;
        }

        if (player4.equalsIgnoreCase(String.valueOf(losuje1)) ||
                player4.equalsIgnoreCase(String.valueOf(losuje2)) ||
                player4.equalsIgnoreCase(String.valueOf(losuje3)) ||
                player4.equalsIgnoreCase(String.valueOf(losuje4)) ||
                player4.equalsIgnoreCase(String.valueOf(losuje5)) ||
                player4.equalsIgnoreCase(String.valueOf(losuje6)))
        {
            correct4 = true;
        }

        if (player5.equalsIgnoreCase(String.valueOf(losuje1)) ||
                player5.equalsIgnoreCase(String.valueOf(losuje2)) ||
                player5.equalsIgnoreCase(String.valueOf(losuje3)) ||
                player5.equalsIgnoreCase(String.valueOf(losuje4)) ||
                player5.equalsIgnoreCase(String.valueOf(losuje5)) ||
                player5.equalsIgnoreCase(String.valueOf(losuje6)))
        {
            correct5 = true;
        }

        if (player6.equalsIgnoreCase(String.valueOf(losuje1)) ||
                player6.equalsIgnoreCase(String.valueOf(losuje2)) ||
                player6.equalsIgnoreCase(String.valueOf(losuje3)) ||
                player6.equalsIgnoreCase(String.valueOf(losuje4)) ||
                player6.equalsIgnoreCase(String.valueOf(losuje5)) ||
                player6.equalsIgnoreCase(String.valueOf(losuje6)))
        {
            correct6 = true;
        }

        if (correct1 == true || correct2 == true || correct3 == true || correct4 == true || correct5 == true || correct6 == true)
        {
            JOptionPane optionPane = new JOptionPane();
            optionPane.showMessageDialog(null, "Gratulacje mamy trafienie!!!");
        }
        else if(!(correct1 == true || correct2 == true || correct3 == true || correct4 == true || correct5 == true || correct6 == true))
        {
            JOptionPane optionPane = new JOptionPane();
            optionPane.showMessageDialog(null, "Niestety nie ma ani jednego trafienia");
        }
    }

    public void listnener() {
        buttonCheck.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                getNumbers();
            }
        });
    }

    public static void main(String[] args)
    {
        new Fortuna().setVisible(true);

    }
}