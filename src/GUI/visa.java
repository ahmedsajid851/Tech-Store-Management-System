package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class visa extends JFrame implements ActionListener {
    
    public JLabel userLabel, passLabel, signLabel, visaLabel;
    public JTextField textField, passTextField, additionalTextField1, additionalTextField2;
    public JButton b1, b2, b3;
    public JLabel l2;
    public ImageIcon image1;
    Color c1 = new Color(0,0,153);
    Color c2 = new Color(255,255,255);
    Color c3 = new Color(0, 0, 11);
    Color c4 = new Color(227, 11, 110);
    
    visa() {
        super("Visa Payment");
        
        this.setSize(700, 400);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setBackground(c2);
        panel.setLayout(null);
        panel.setSize(new Dimension(700, 350));
        
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.blue);
        panel1.setLayout(null);
        panel1.setSize(new Dimension(700, 30));
        
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.blue);
        panel2.setLayout(null);
        panel2.setSize(new Dimension(700, 20));
        
        image1 = new ImageIcon(getClass().getResource("images/visa.png"));
        JLabel l1 = new JLabel(image1);
        l1.setSize(150, 70);
        l1.setBounds(275, 10, image1.getIconWidth(), 100);
        panel.add(l1);
        
        visaLabel = new JLabel("Visa Payment");
        visaLabel.setFont(new Font("calibri", Font.BOLD, 20));
        visaLabel.setForeground(c3);
        visaLabel.setBounds(300, 100, 140, 40);    
        panel.add(visaLabel);
        
        JLabel userLabel = new JLabel("Card Number");
        userLabel.setFont(new Font("calibri", Font.BOLD, 20));
        userLabel.setForeground(c3);
        userLabel.setBounds(160, 140, 140, 40);    
        panel.add(userLabel);
        
        textField = new JTextField(20);
        textField.setBounds(340, 140, 160, 30);
        textField.setFont(new Font("calibri", 20, 20));
        panel.add(textField);
        
        JLabel passLabel = new JLabel("Expiration Date");
        passLabel.setFont(new Font("calibri", Font.BOLD, 20));
        passLabel.setForeground(c3);
        passLabel.setBounds(160, 180, 140, 30);    
        panel.add(passLabel);
        
        passTextField = new JPasswordField(20);
        passTextField.setBounds(340, 180, 160, 30);
        passTextField.setFont(new Font("calibri", 20, 20));
        panel.add(passTextField);
        
        JLabel additionalLabel1 = new JLabel("Security Code");
        additionalLabel1.setFont(new Font("calibri", Font.BOLD, 20));
        additionalLabel1.setForeground(c3);
        additionalLabel1.setBounds(160, 220, 140, 30);    
        panel.add(additionalLabel1);
        
        additionalTextField1 = new JTextField(20);
        additionalTextField1.setBounds(340, 220, 160, 30);
        additionalTextField1.setFont(new Font("calibri", 20, 20));
        panel.add(additionalTextField1);
        
        JLabel additionalLabel2 = new JLabel("Name on Card");
        additionalLabel2.setFont(new Font("calibri", Font.BOLD, 20));
        additionalLabel2.setForeground(c3);
        additionalLabel2.setBounds(160, 260, 140, 30);    
        panel.add(additionalLabel2);
        
        additionalTextField2 = new JTextField(20);
        additionalTextField2.setBounds(340, 260, 160, 30);
        additionalTextField2.setFont(new Font("calibri", 20, 20));
        panel.add(additionalTextField2);
        
        b1 = new JButton("Confirm");
        b1.setBounds(300, 300, 100, 40);
        b1.setFont(new Font("calibri", Font.BOLD, 20));
        b1.setBorderPainted(false);
        b1.setFocusable(false);
        b1.setForeground(c2);
        b1.setBackground(Color.orange);
        b1.addActionListener(this);
        panel.add(b1);
        
        this.add(panel1);
        this.add(panel);
        this.add(panel2);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            if (!textField.getText().isEmpty() && !passTextField.getText().isEmpty() &&
                !additionalTextField1.getText().isEmpty() && !additionalTextField2.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "<html>Successfully Purchased!<br>Thank you for choosing XENTech!</html>");
                    File file = new File("bin\\oders.txt");
                    if (file.delete()) {
                        this.setVisible(false);
                        UserPage p1 = new UserPage();
                        p1.setVisible(true);
                        p1.userb.setVisible(false);
                        p1.userb1.setVisible(false);
                        p1.itemItem3.setVisible(true);
                    }
            } else {
                JOptionPane.showMessageDialog(null, "Please fill in all the required fields!");
            }
        } else {
            System.out.println("Failed to delete the file");
            UserPage userPage = new UserPage();
            userPage.setVisible(true);
            this.setVisible(false);
        }
    }
}

