package GUI;
import Entity.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class sign1 extends JFrame implements ActionListener {
    public JTextField fullNameField, addressField, emailField, passwordField, confirmPasswordField;
    public JButton signUpButton, loginButton, backButton;
    public JLabel successLabel;

    public sign1() {
        super("Sign Up");
        this.setSize(900, 700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        ImageIcon img = new ImageIcon(getClass().getResource("images/image4.jpg"));
        JLabel l1 = new JLabel("", img, JLabel.CENTER);
        l1.setBounds(0, 0, img.getIconWidth(), 700);
        panel.add(l1);

        JLabel l2 = new JLabel("New User Sign Up");
        l2.setFont(new Font("Roboto", Font.BOLD, 40));
        l2.setForeground(Color.WHITE);
        l2.setBounds(280, 20, 600, 50);
        l1.add(l2);

        JLabel fullNameLabel = new JLabel("User Name");
        fullNameLabel.setFont(new Font("Calibri", Font.BOLD, 20));
        fullNameLabel.setForeground(Color.WHITE);
        fullNameLabel.setBounds(140, 100, 200, 30);
        l1.add(fullNameLabel);
        fullNameField = new JTextField();
        fullNameField.setBounds(400, 100, 260, 30);
        l1.add(fullNameField);

        JLabel addressLabel = new JLabel("Address");
        addressLabel.setFont(new Font("Calibri", Font.BOLD, 20));
        addressLabel.setForeground(Color.WHITE);
        addressLabel.setBounds(140, 160, 200, 30);
        l1.add(addressLabel);
        addressField = new JTextField();
        addressField.setBounds(400, 160, 260, 30);
        l1.add(addressField);

        JLabel emailLabel = new JLabel("Email");
        emailLabel.setFont(new Font("Calibri", Font.BOLD, 20));
        emailLabel.setForeground(Color.WHITE);
        emailLabel.setBounds(140, 220, 200, 30);
        l1.add(emailLabel);
        emailField = new JTextField();
        emailField.setBounds(400, 220, 260, 30);
        l1.add(emailField);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setFont(new Font("Calibri", Font.BOLD, 20));
        passwordLabel.setForeground(Color.WHITE);
        passwordLabel.setBounds(140, 280, 200, 30);
        l1.add(passwordLabel);
        passwordField = new JPasswordField();
        passwordField.setBounds(400, 280, 260, 30);
        l1.add(passwordField);

        JLabel confirmPasswordLabel = new JLabel("Confirm Password");
        confirmPasswordLabel.setFont(new Font("Calibri", Font.BOLD, 20));
        confirmPasswordLabel.setForeground(Color.WHITE);
        confirmPasswordLabel.setBounds(140, 340, 200, 30);
        l1.add(confirmPasswordLabel);
        confirmPasswordField = new JPasswordField();
        confirmPasswordField.setBounds(400, 340, 260, 30);
        l1.add(confirmPasswordField);

        signUpButton = new JButton("Sign Up");
        signUpButton.setBounds(370, 440, 120, 50);
        signUpButton.setFont(new Font("Calibri", Font.BOLD, 26));
        signUpButton.setForeground(Color.WHITE);
        signUpButton.setBackground(new Color(0, 0, 15));
		signUpButton.setBorderPainted(false);
		signUpButton.setFocusable(false);
        signUpButton.addActionListener(this);
        l1.add(signUpButton);

        loginButton = new JButton("Already have an account? Login");
        loginButton.setBounds(290, 540, 300, 30);
        loginButton.setFont(new Font("Calibri", Font.BOLD, 18));
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusable(false);
		loginButton.setContentAreaFilled(false);
		loginButton.setBorderPainted(false);
        loginButton.addActionListener(this);
        l1.add(loginButton);

        backButton = new JButton("Go back to home");
        backButton.setBounds(335, 600, 200, 30);
        backButton.setFont(new Font("Calibri", Font.BOLD, 18));
        backButton.setForeground(Color.WHITE);
        backButton.setContentAreaFilled(false);
		backButton.setBorderPainted(false);
        backButton.addActionListener(this);
        backButton.addActionListener(this);
        l1.add(backButton);

        successLabel = new JLabel(" ");
        successLabel.setBounds(15, 600, 280, 30);
        successLabel.setFont(new Font("Calibri", Font.BOLD, 20));
        successLabel.setForeground(Color.WHITE);
        l1.add(successLabel);

        this.add(panel);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == signUpButton) {
            String fullName = fullNameField.getText();
            String address = addressField.getText();
            String email = emailField.getText();
            String password = passwordField.getText();
            String confirmPassword = confirmPasswordField.getText();

            if (fullName.isEmpty() || address.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all fields.");
            } else if (!password.equals(confirmPassword)) {
                JOptionPane.showMessageDialog(this, "Passwords do not match.");
            } else {
                CreateAccount createAccount = new CreateAccount(address, email, fullName, password);
                createAccount.addAccount();
                JOptionPane.showMessageDialog(this, "Account created successfully!");
				login1 q1 = new login1();
                q1.setVisible(true);
                this.setVisible(false);
            }
        } else if (ae.getSource() == loginButton) {
            successLabel.setText("Going to login page");
            login1 q1 = new login1();
            q1.setVisible(true);
            this.setVisible(false);
        } else if (ae.getSource() == backButton) {
            this.setVisible(false);
            home homeFrame = new home();
            homeFrame.setVisible(true);
        }
    }

    public static void main(String[] args) {
        sign1 signUpFrame = new sign1();
        signUpFrame.setVisible(true);
    }
}
