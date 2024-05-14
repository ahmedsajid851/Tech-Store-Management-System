package GUI;
import Entity.*;


import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.*;
import java.io.IOException;

public class UserPage extends JFrame implements ActionListener {
    JButton b5, b1, userb, userb1;
    JLabel l1, l2, l3, l4, l5, l6, l7, l41, l51, l31, top, bottom, itemItem, itemItem3;
    JPanel p1, p2;
    ImageIcon img1, img2, img3, img4;
    Color c1 = new Color(0, 0, 153);
    Color c2 = new Color(255, 255, 255);
    Color c3 = new Color(0, 0, 11);
    Color c4 = new Color(48, 12, 143);

    UserPage() {
        super("User Account");
        this.setSize(900, 700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setBackground(c1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new JPanel();
        p1.setSize(new Dimension(900, 700));
        p1.setBackground(c2);
        p1.setLayout(null);


        img2 = new ImageIcon(getClass().getResource("images/image61.jpg"));
        top = new JLabel(img2);
        top.setSize(900, 100);
        top.setBounds(0, 0, img2.getIconWidth(), 100);

        img1 = new ImageIcon(getClass().getResource("images/image61.jpg"));
        bottom = new JLabel(img1);
        bottom.setSize(900, 200);
        bottom.setBounds(0, 600, img2.getIconWidth(), 200);

        l2 = new JLabel("XenTech");
        l2.setFont(new Font("Calibri", Font.BOLD, 50));
        l2.setForeground(c4);
        l2.setBackground(c4);
        l2.setBounds(44, 30, 200, 50);

        l1 = new JLabel();
        l1.setText("");
        l1.setFont(new Font("Roboto", Font.BOLD, 30));
        l1.setBounds(44, 110, 640, 40);
        l1.setForeground(c4);

        l3 = new JLabel();
        l3.setText("User Name");
        l3.setFont(new Font("Calibri", Font.BOLD, 20));
        l3.setBounds(50, 170, 640, 40);
        l3.setForeground(c3);

        l4 = new JLabel();
        l4.setText("User Email");
        l4.setFont(new Font("Calibri", Font.BOLD, 20));
        l4.setBounds(50, 30, 460, 400);
        l4.setForeground(c3);

        l5 = new JLabel();
        l5.setText("User Address");
        l5.setFont(new Font("Calibri", Font.BOLD, 20));
        l5.setBounds(50, 100, 460, 340);
        l5.setForeground(c3);

		b1 = new JButton("Logout");
        b1.setFont(new Font("Calibri",Font.BOLD,20));
        b1.setForeground(c2);
        b1.setBounds(444, 30, 640, 40);
		b1.setContentAreaFilled(false);
        b1.setFocusable(false);
        b1.setBorderPainted(false);

        l6 = new JLabel("orders");
        l6.setFont(new Font("Calibri", Font.BOLD, 20));
        l6.setBounds(50, 120, 460, 400);
        l6.setForeground(c3);
		
		l7 = new JLabel("prices(BDT)");
        l7.setFont(new Font("Calibri", Font.BOLD, 20));
        l7.setBounds(560, 120, 460, 400);
        l7.setForeground(c3);

        userb = new JButton("Confirm Buy");
        userb.setFont(new Font("Calibri", Font.BOLD, 20));
        userb.setForeground(c2);
        userb.setBackground(c4);
        userb.setFocusable(false);
        userb.setBounds(240, 560, 160, 30);
        userb1 = new JButton("Cancel orders");
		
        userb1.setFont(new Font("Calibri", Font.BOLD, 20));
        userb1.setForeground(c2);
        userb1.setBackground(c4);
        userb1.setFocusable(false);
        userb1.setBounds(480, 560, 160, 30);
		
        b5 = new JButton("Home");
        b5.setFont(new Font("Calibri", Font.BOLD, 18));
        b5.setForeground(c2);
        b5.setContentAreaFilled(false);
        b5.setFocusable(false);
        b5.setBorderPainted(false);
        b5.setBounds(360, 20, 160, 20);
		
		itemItem3 = new JLabel("");
		itemItem3.setFont(new Font("Calibri", Font.PLAIN, 20));
		itemItem3.setBounds(50, 360, 400, 100);
		itemItem3.setText("<html><b>Your Order Has Been Successfully Purchased!<b><br>Thank you for Supporting XENTech!</html>");
		itemItem3.setForeground(Color.green);
		itemItem3.setVisible(false);
		
        int y = 330;
		try {
			BufferedReader reader = new BufferedReader(new FileReader ("bin\\Oders.txt"));
			String line;
			while ((line = reader.readLine())!=null){
				StringTokenizer stn = new StringTokenizer(line);
				String name = stn.nextToken();
				String price = stn.nextToken();
				itemItem = new JLabel("");
				itemItem.setText("<html>"+name+"</html>");
				itemItem.setFont(new Font("Calibri", Font.PLAIN, 16));
				itemItem.setBounds(50, y, 400, 20);
				p1.add(itemItem);
				JLabel itemItem1 = new JLabel("");
				itemItem1.setText("<html>"+price+"</html>");
				itemItem1.setFont(new Font("Calibri", Font.PLAIN, 16));
				itemItem1.setBounds(560, y, 400, 20);
				p1.add(itemItem1);
				y += 20;
			}
			reader.close();
		}
			catch (IOException e){
			e.printStackTrace();
			this.userb.setVisible(false);
			this.userb1.setVisible(false);
        }
        userb.addActionListener(this);
        userb1.addActionListener(this);
        b5.addActionListener(this);
        b1.addActionListener(this);
		
		l41 = new JLabel();
	    l41.setText("User Email");
        l41.setFont(new Font("Calibri", Font.BOLD, 20));p1.add(top);
        l41.setBounds(250, 30, 460, 400);p1.add(bottom);
        l41.setForeground(c3);p1.add(l1);
      	l31 = new JLabel();p1.add(l4);
        l31.setText("User Name");p1.add(l5);
        l31.setFont(new Font("Calibri", Font.BOLD, 20));p1.add(l3);
        l31.setBounds(250, 170, 640, 40);p1.add(l6);
		l31.setForeground(c3);p1.add(l7);
		l51 = new JLabel();p1.add(userb);
		l51.setText("User Address");p1.add(userb1);
		l51.setFont(new Font("Calibri", Font.BOLD, 20));top.add(l2);
		l51.setBounds(250, 100, 460, 340);bottom.add(b5);
		l51.setForeground(c3);
		
		
		CreateAccount account = new CreateAccount();
		String username = "";
		String path = "bin\\loginmemory.txt";
		try {
			File file = new File(path);
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] parts = line.split("\t");
				if (parts.length >= 1) {
					username = parts[0];
					break;
				}
			}
			scanner.close(); 
		} catch (FileNotFoundException e) {
			
			JOptionPane.showMessageDialog(null, "Login memory file not found: " + e.getMessage());
			e.printStackTrace();
		}

			String accountInfo = account.getAccountInfo(username);

            if (accountInfo != null) {

                String[] infoParts = accountInfo.split("\t");

                String userName = infoParts[0];
                //String userPassword = infoParts[1];
                String address = infoParts[2];
                String userEmail = infoParts[3];

                l31.setText(userName);
                l51.setText(address);
                l41.setText(userEmail);
            } else {
                System.out.println("Account not found.");
			}

		
        p1.add(top);
        p1.add(bottom);
        p1.add(l1);
        p1.add(l4);
        p1.add(l41);
        p1.add(l5);
        p1.add(l51);
        p1.add(l31);
        p1.add(l3);
        p1.add(l6);
        p1.add(l7);
        p1.add(itemItem3);
        p1.add(userb);
        p1.add(userb1);
        top.add(l2);
        bottom.add(b5);
        top.add(b1);

        this.add(p1);
	}
	
	
    public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == userb) {
			PurchasePage h = new PurchasePage();
			h.setVisible(true);
			this.setVisible(false);
			
		}else if (ae.getSource() == b5) {
				home f = new home();
				this.setVisible(false);
                f.setVisible(true);
				f.bacc.setVisible(true);
				f.b1.setVisible(false);
				f.b2.setVisible(false);
		}else if (ae.getSource() == b1) {
			int choice = JOptionPane.showConfirmDialog(null, "Do you want to logout?", "Logout", JOptionPane.YES_NO_OPTION);
			if (choice == JOptionPane.YES_OPTION) {
				File file = new File("bin/loginmemory.txt");
				if (file.delete()) {
					JOptionPane.showMessageDialog(null,"Successfully Loggedout!");
					home f = new home();
					this.setVisible(false);
					f.setVisible(true);
					f.b1.setVisible(true);
					f.b2.setVisible(true);
					f.bacc.setVisible(false);
				}
				else{
					JOptionPane.showMessageDialog(null,"Something Went wrong!");
					home f = new home();
					this.setVisible(false);
					f.setVisible(true);
					f.b1.setVisible(true);
					f.b2.setVisible(true);
					f.bacc.setVisible(false);
				
				}
			}
					
		} else if (ae.getSource() == userb1) {
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to remove your orders?", "Remove", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            File file = new File("bin/Oders.txt");
            if (file.delete()) {
				this.setVisible(false);
				UserPage p1 = new UserPage();
				p1.setVisible(true);
				JOptionPane.showMessageDialog(null,"Successfully removed!");
				p1.userb.setVisible(false);
				p1.userb1.setVisible(false);
            } else {
				
                System.out.println("Failed to delete the file");
            }
        }

    }
	}

}
