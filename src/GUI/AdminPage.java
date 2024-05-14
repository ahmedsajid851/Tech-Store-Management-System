package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminPage extends JFrame implements ActionListener {
    JButton backButton;
    JLabel titleLabel, descriptionLabel, l2, l4;
    JPanel panel;
    ImageIcon topImage, bottomImage;
    Color backgroundColor = new Color(0, 0, 153);
    Color textColor = new Color(255, 255, 255);
    Color headingColor = new Color(48, 12, 143);

    AdminPage() {
        super("Admin Page");
        this.setSize(900, 700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setBackground(backgroundColor);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setSize(new Dimension(900, 700));
        panel.setBackground(textColor);
        panel.setLayout(null);
		
		l2 = new JLabel("XenTech");
		l2.setFont(new Font("Calibri",Font.BOLD,50));
		l2.setForeground(headingColor);
		l2.setBackground(headingColor);
		l2.setBounds(44,30,200,50);
		
        topImage = new ImageIcon(getClass().getResource("images/image61.jpg"));
        JLabel topLabel = new JLabel(topImage);
        topLabel.setSize(900, 100);
        topLabel.setBounds(0, 0, topImage.getIconWidth(), 100);

        bottomImage = new ImageIcon(getClass().getResource("images/image61.jpg"));
        JLabel bottomLabel = new JLabel(bottomImage);
        bottomLabel.setSize(900, 200);
        bottomLabel.setBounds(0, 600, topImage.getIconWidth(), 200);

        titleLabel = new JLabel("Admin Dashboard");
        titleLabel.setFont(new Font("Calibri", Font.BOLD, 30));
        titleLabel.setForeground(headingColor);
        titleLabel.setBounds(314, 130, 400, 50);
		
		l4 = new JLabel();
		l4.setText("<html><b>Current products for sell:  <br><br>>Desktop:<t> 6 types<br>>Laptop: <t> 6 types<br>>SmartPhone: <t> 6 types<br>>Software: <t> 6 types</html>");		
		l4.setFont(new Font("Calibri",Font.PLAIN,20));
		l4.setBounds(50,200,460,400);
		l4.setForeground(Color.black);

        descriptionLabel = new JLabel("Welcome, Admin!");
        descriptionLabel.setFont(new Font("Calibri", Font.BOLD, 24));
        descriptionLabel.setBounds(44, 180, 400, 40);
        descriptionLabel.setForeground(headingColor);

        backButton = new JButton("Back to Home");
        backButton.setFont(new Font("Calibri", Font.BOLD, 18));
        backButton.setForeground(textColor);
        backButton.setContentAreaFilled(false);
        backButton.setFocusable(false);
        backButton.setBorderPainted(false);
        backButton.setBounds(560, 40, 160, 20);
        backButton.addActionListener(this);

        panel.add(topLabel);
        topLabel.add(l2);
        panel.add(bottomLabel);
        panel.add(l4);
        panel.add(titleLabel);
        panel.add(descriptionLabel);
        topLabel.add(backButton);

        this.add(panel);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == backButton) {
            home home = new home();
            this.setVisible(false);
            home.setVisible(true);
        }
    }

}
