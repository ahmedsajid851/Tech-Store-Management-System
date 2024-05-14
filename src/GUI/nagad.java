package GUI;



import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class nagad extends JFrame implements ActionListener{
	
		public JLabel userLabel, passLabel, signLabel;
		public JTextField textField, passTextField;
		public JButton b1, b2, b3;
		public JLabel l2;
		public ImageIcon image1;
		Color c1 = new Color(0,0,153);
		Color c2 = new Color(255,255,255);
		Color c3 = new Color(0, 0, 11);
		Color c4 = new Color(227, 11, 110);
	
	nagad(){
		super("nagad");
		
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(c2);
		panel.setLayout(null);
		panel.setSize(new Dimension(600,350));
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.red);
		panel1.setLayout(null);
		panel1.setSize(new Dimension(600,30));
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.red);
		panel2.setLayout(null);
		panel2.setSize(new Dimension(600,20));
		
		image1 = new ImageIcon(getClass().getResource("images/nagad.png"));
		JLabel l1 = new JLabel(image1);
		l1.setSize(100, 60);
		l1.setBounds(230,50,image1.getIconWidth(),100);
		panel.add(l1);
		

		
		JLabel user_label = new JLabel("Moblie No");
		user_label.setFont(new Font("calibri",Font.BOLD,20));
		user_label.setForeground(c3);
		user_label.setBounds(160, 160, 140, 40);	
		panel.add(user_label);

		textField = new JTextField(20);
        textField.setBounds(260, 160, 160, 30);
		textField.setFont(new Font("calibri", 20, 20));
        panel.add(textField);
		
		JLabel passLabel = new JLabel("PIN");
		passLabel.setFont(new Font("calibri",Font.BOLD,20));
		passLabel.setForeground(c3);
		passLabel.setBounds(160, 200, 140, 30);	
		panel.add(passLabel);
		
		passTextField = new JPasswordField(20);
        passTextField.setBounds(260, 200, 160, 30);
		passTextField.setFont(new Font("calibri", 20, 20));
        panel.add(passTextField);
		
		
		b1 = new JButton("Confirm");
		b1.setBounds(240, 260, 100, 40);
		b1.setFont(new Font("calibri",Font.BOLD, 20));
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
	    public void actionPerformed(ActionEvent ae)
        {
            if(ae.getSource()==b1)
			{
				if(!textField.getText().isEmpty() && !passTextField.getText().isEmpty()){
					JOptionPane.showMessageDialog(null,"<html>Successfully Purchased!<br>Thank you for choosing XENTech!</html>");
					File file = new File("bin\\oders.txt");
					if (file.delete()) {
						this.setVisible(false);
						UserPage p1 = new UserPage();
						p1.setVisible(true);
						p1.userb.setVisible(false);
						p1.userb1.setVisible(false);
						p1.itemItem3.setVisible(true);
					}
				}
				else{
					JOptionPane.showMessageDialog(null,"please check the phone num and pin!");
				
            }} else {
				
                System.out.println("Failed to delete the file");
				UserPage userPage = new UserPage();
				userPage.setVisible(true);
				this.setVisible(false);
			}
			}
		
	public static void main(String[] args){
		
		nagad b = new nagad();
		b.setVisible(true);
	}
}

