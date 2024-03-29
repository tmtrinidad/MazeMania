package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This is the Main Menu for MazeMania
 */
public class MenuView extends JFrame
{
    JButton start;
    JButton rules;
    ImageIcon image = new ImageIcon("mazeManiaMenu.png");

    private int clicked = 0;

    /**
     * Constructs a new MenuView
     */
    public MenuView() {

        setSize(image.getIconWidth(),image.getIconHeight());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Main Menu");
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(new BorderLayout());

        JLabel background=new JLabel(image);
        add(background);

        start = new JButton("");
        start.setBounds(263,500,122,75);
        start.setOpaque(false);
        start.setContentAreaFilled(false);
        start.setBorderPainted(false);

        rules = new JButton("");
        rules.setBounds(267,385,122,75);
        rules.setOpaque(false);
        rules.setContentAreaFilled(false);
        rules.setBorderPainted(false);

        //making the buttons work
        start.addActionListener(new ActionListener() {
            @Override
            /**
             * This method gives the start button its functionality
             * @param ActionEvent e
             *
             */
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
                clicked++;
                System.out.println("clicked");
            }
        });
        /**
         * This method gives the rules button its functionality
         * @param ActionEvent e
         *
         */
        rules.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
                RulesView rulesScreen = new RulesView();
            }
        });

        background.add(start);
        background.add(rules);

        this.getContentPane().add(background);
        setVisible(true);
    }

    /**
     * Gets clicked, clicked is used to make the start button function
     * @return returns clicked
     */
    public int getClicked() {
        return clicked;
    }
}