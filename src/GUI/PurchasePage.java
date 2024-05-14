package GUI;
import Entity.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;


public class PurchasePage extends JFrame implements ActionListener{

    JButton backButton, bikash, rocket, nagad, visa;
    JLabel titleLabel, itemLabel, priceLabel, itemItem, top, purchaseLabel, totalLabel;
    JPanel panel;
    ImageIcon img1, img2;
	Color c1 = new Color(0, 0, 153);
    Color c2 = new Color(255, 255, 255);
    Color c3 = new Color(0, 0, 11);
    Color c4 = new Color(48, 12, 143);


    PurchasePage(){


        setTitle("Purchase Page");
        setSize(900, 700);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        panel = new JPanel();
        panel.setLayout(null);
        
		img2 = new ImageIcon(getClass().getResource("images/image61.jpg"));
        top = new JLabel(img2);
        top.setSize(900, 100);
        top.setBounds(0, 0, img2.getIconWidth(), 100);
		
        titleLabel = new JLabel("Purchase Page");
        titleLabel.setFont(new Font("Roboto", Font.BOLD, 30));
		titleLabel.setForeground(Color.white);
        titleLabel.setBounds(50, 25, 400, 40);
		
		totalLabel = new JLabel("Total:  ");
        totalLabel.setFont(new Font("Roboto", Font.BOLD, 20));
		totalLabel.setForeground(c3);
        totalLabel.setBounds(340, 420, 200, 30);
		
		purchaseLabel = new JLabel("Purchase Option");
        purchaseLabel.setFont(new Font("Roboto", Font.BOLD, 24));
		purchaseLabel.setForeground(c4);
        purchaseLabel.setBounds(340, 460, 200, 40);
        
        backButton = new JButton("Back to User Page");
        backButton.setFont(new Font("Calibri", Font.BOLD, 16));
        backButton.setBounds(660, 30, 180, 32);
		backButton.setFocusable(false);
		backButton.setContentAreaFilled(false);
		backButton.setForeground(Color.white);
        backButton.addActionListener(this);
		
		bikash = new JButton("Bkash");
        bikash.setFont(new Font("Calibri", Font.BOLD, 20));
        bikash.setBounds(200, 510, 180, 40);
		bikash.setFocusable(false);
		bikash.setForeground(c2);
		bikash.setBackground(c4);
        bikash.addActionListener(this);
		
		rocket = new JButton("Rocket");
        rocket.setFont(new Font("Calibri", Font.BOLD, 20));
        rocket.setBounds(500, 510, 180, 40);
		rocket.setFocusable(false);
		rocket.setBackground(c4);
		rocket.setForeground(c2);
        rocket.addActionListener(this);
		
		nagad = new JButton("Nagad");
        nagad.setFont(new Font("Calibri", Font.BOLD, 20));
        nagad.setBounds(200, 580, 180, 40);
		nagad.setFocusable(false);
		nagad.setBackground(c4);
		nagad.setForeground(c2);
        nagad.addActionListener(this);
		
		visa = new JButton("Visa");
        visa.setFont(new Font("Calibri", Font.BOLD, 20));
        visa.setBounds(500, 580, 180, 40);
		visa.setFocusable(false);
		visa.setBackground(c4);
		visa.setForeground(c2);
        visa.addActionListener(this);
        
		
        itemLabel = new JLabel("Items in Cart:");
        itemLabel.setFont(new Font("Calibri", Font.BOLD, 20));
        itemLabel.setBounds(50, 120, 200, 30);
        
        priceLabel = new JLabel("Prices(BDT)");
        priceLabel.setFont(new Font("Calibri", Font.BOLD, 20));
        priceLabel.setBounds(560, 120, 200, 30);
        try {
            CreateOrders orders = new CreateOrders();
            double totalPrice = orders.getTotalPrice();
            totalLabel.setText("Total Price: " + totalPrice);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        int y = 150;

			try {
			BufferedReader reader = new BufferedReader(new FileReader("bin\\Oders.txt"));
			String line;
			while ((line = reader.readLine()) != null) {
				StringTokenizer stn = new StringTokenizer(line);
				String name = stn.nextToken();
				String price = stn.nextToken();

				JLabel itemNameLabel = new JLabel("<html>" + name + "</html>");
				itemNameLabel.setFont(new Font("Calibri", Font.PLAIN, 16));
				itemNameLabel.setBounds(50, y, 460, 20);
				panel.add(itemNameLabel);

				JLabel itemPriceLabel = new JLabel("<html>" + price + "</html>");
				itemPriceLabel.setFont(new Font("Calibri", Font.PLAIN, 16));
				itemPriceLabel.setBounds(560, y, 400, 20);
				panel.add(itemPriceLabel);

				y += 20;
			}
			reader.close();
			}
			catch (IOException e){
			e.printStackTrace();
		
        }
		panel.add(top);
        top.add(titleLabel);
        
        top.add(backButton);
        panel.add(itemLabel);
        panel.add(priceLabel);
        panel.add(purchaseLabel);
        panel.add(totalLabel);
        panel.add(rocket);
        panel.add(bikash);
        panel.add(visa);
        panel.add(nagad);

        add(panel);

        panel.revalidate();
        panel.repaint();
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == backButton) {
            try{
			UserPage userPage = new UserPage();
            userPage.setVisible(true);
            this.setVisible(false);
			}
			catch (Exception e){
			e.printStackTrace();
		
        }
        }
		else if(ae.getSource() == bikash){
			bikashpage b = new bikashpage();
			b.setVisible(true);
			this.setVisible(false);
		}else if(ae.getSource() == visa){
			visa b = new visa();
			b.setVisible(true);
			this.setVisible(false);
		}else if(ae.getSource() == nagad){
			nagad b = new nagad();
			b.setVisible(true);
			this.setVisible(false);
		}else if(ae.getSource() == rocket){
			rocket b = new rocket();
			b.setVisible(true);
			this.setVisible(false);
		}
    }

    public static void main(String args[]) {
        PurchasePage h1 = new PurchasePage();
        h1.setVisible(true);
    }
}