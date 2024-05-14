package GUI;

import Entity.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class login1 extends JFrame implements ActionListener{
	
		public JLabel userLabel, passLabel, signLabel;
		public JTextField textField, passTextField;
		public JButton b1, b2, b3;
		public JLabel l2;
		public ImageIcon image1;
	
	login1(){
		super("Login");
		
		this.setSize(900, 700);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		Color c1 = new Color(0,0,153);
		Color c2 = new Color(255,255,255);
		panel.setBackground(c1);
		panel.setLayout(null);
		
		
		image1 = new ImageIcon(getClass().getResource("images/image1.jpg"));
		JLabel l1 = new JLabel(image1);
		l1.setSize(800, 600);
		l1.setBounds(0,10,image1.getIconWidth(),700);
		panel.add(l1);
		
		l2 = new JLabel("User Login");
		l2.setFont(new Font("Roboto",Font.BOLD,40));
		l2.setForeground(c2);
		l2.setBounds(340,30,600,50);
		l1.add(l2);
		
		JLabel user_label = new JLabel("user name");
		user_label.setFont(new Font("calibri",Font.BOLD,30));
		user_label.setForeground(c2);
		user_label.setBounds(240, 180, 140, 40);	
		l1.add(user_label);

		textField = new JTextField(20);
        textField.setBounds(400, 180, 200, 30);
		textField.setFont(new Font("calibri", 20, 20));
        l1.add(textField);
		
		JLabel passLabel = new JLabel("password");
		passLabel.setFont(new Font("calibri",Font.BOLD,30));
		passLabel.setForeground(c2);
		passLabel.setBounds(240, 260, 140, 40);	
		l1.add(passLabel);
		
		passTextField = new JPasswordField(20);
        passTextField.setBounds(400, 260, 200, 30);
		passTextField.setFont(new Font("calibri", 20, 20));
        l1.add(passTextField);
		
		JLabel sign_label = new JLabel("");
		sign_label.setBounds(350, 400, 200, 30);
		sign_label.setForeground(c2);
		sign_label.setFont(new Font("Roboto",15,15));
		l1.add(sign_label);
		
		b1 = new JButton("login");
		b1.setBounds(380, 340, 100, 40);
		b1.setFont(new Font("calibri",Font.BOLD, 20));
		//b1.setBorderPainted(false);
		b1.setFocusable(false);
		b1.setForeground(c2);
		b1.setBackground(c1);
		b1.addActionListener(this);
		l1.add(b1);
		
		b2 = new JButton("Or, don't have an account? Sign up");
		b2.setBounds(290, 420, 300, 30);
		b2.setFont(new Font("calibri",Font.BOLD,18));
		b2.setForeground(c2);
		b2.setBorderPainted(false);
		b2.setContentAreaFilled(false);
		b2.addActionListener(this);
		l1.add(b2);
		
		b3 = new JButton("Go back to home");
		b3.setBounds(335, 540, 200, 30);
		b3.setFont(new Font("calibri",Font.BOLD,18));
		b3.setForeground(c2);
		b3.setContentAreaFilled(false);
		b3.setBorderPainted(false);
		b3.addActionListener(this);
		l1.add(b3);
		
		
		this.add(panel);
	}
	

	public void actionPerformed(ActionEvent ae)
		{
	
		    if(ae.getSource()==b1){
				String userName = textField.getText();
				String userPassword =  passTextField.getText();
				CreateAccount ca1 = new CreateAccount();
				
				if ((userName.equals("admin") && userPassword.equals("123") )||(userName.equals("admin2") && userPassword.equals("wasd") )) {
				AdminPage q = new AdminPage();
				this.setVisible(false);
				q.setVisible(true);
				}
				else{
				File file = new File("bin/loginmemory.txt");
				if(ca1.getAccount(userName, userPassword)&&file.delete()) {
				JOptionPane.showMessageDialog(null,"Login Successful");

                home f = new home();
				this.setVisible(false);
                f.setVisible(true);
				f.bacc.setVisible(true);
				f.b1.setVisible(false);
				f.b2.setVisible(false);
				String a = userName;
				loginmemory lm1 = new loginmemory(a);
				lm1.addMemory1();
				}
				else if(ca1.getAccount(userName, userPassword)){
				JOptionPane.showMessageDialog(null,"Login Successful");
                home f = new home();
				this.setVisible(false);
                f.setVisible(true);
				f.bacc.setVisible(true);
				f.b1.setVisible(false);
				f.b2.setVisible(false);
				String	 a = userName;
				loginmemory lm1 = new loginmemory(a);
				lm1.addMemory1();									
				}
				else {
				JOptionPane.showMessageDialog(null,"Failed to login");
			}
			}
		}
			else if(ae.getSource()==b2)
			{
				sign1 s1 = new sign1();
				this.setVisible(false);
				s1.setVisible(true);
			}
			else if(ae.getSource()==b3)
			{
				home s1 = new home();
				this.setVisible(false);
				s1.setVisible(true);
			}
		}
		
	

}