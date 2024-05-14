package GUI;
import Entity.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class smartphone3 extends JFrame implements ActionListener{
	
		JTextField t1,t2;
		JButton b1, b2, b3, b4, b5, userb, bca;
		JLabel l1, l2, l3, l4, l5, l6, top, bottom, pc1, pc2;
		ImageIcon img1, img2, img3, img4;
		JPanel p1,p2;
		Color c1 = new Color(0,0,153);
		Color c2 = new Color(255,255,255);
		Color c3 = new Color(0, 0, 11);
		Color c4 = new Color(48, 12, 143);
	
	smartphone3(){
	
		super("Smartphone-3");
		this.setSize(900, 700);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setBackground(c1);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		p1 = new JPanel();
		p1.setSize(new Dimension(900,700));
		p1.setBackground(c2);
		p1.setLayout(null);
		
		
		img2 = new ImageIcon(getClass().getResource("images/image61.jpg"));
        top = new JLabel(img2);
        top.setSize(900, 200);
        top.setBounds(0,0,img2.getIconWidth(),80);
		
		img1 = new ImageIcon(getClass().getResource("images/image61.jpg"));
        bottom = new JLabel(img1);
        bottom.setSize(900, 200);
        bottom.setBounds(0,600,img2.getIconWidth(),200);
		
		img3 = new ImageIcon(getClass().getResource("images/sp5.jpg"));
        pc1 = new JLabel(img3);
        pc1.setSize(228,228);
        pc1.setBounds(260,120,img2.getIconWidth(),200);
		
		
		img4 = new ImageIcon(getClass().getResource("images/sp6.jpg"));
        pc2 = new JLabel(img4);
        pc2.setSize(228,228);
        pc2.setBounds(260,340,img2.getIconWidth(),200);
		

		
		l2 = new JLabel("XenTech");
		l2.setFont(new Font("Calibri",Font.BOLD,50));
		l2.setForeground(c4);
		l2.setBackground(c4);
		l2.setBounds(44,20,200,50);
		
		l1 = new JLabel();
		l1.setText("Category > SmartPhone");		
		l1.setFont(new Font("Calibri",Font.BOLD,24));
		l1.setBounds(50,110,640,40);
		l1.setForeground(c4);
		
		l3 = new JLabel();
		l3.setText("Nova 12 Pro");		
		l3.setFont(new Font("Roboto",Font.BOLD,20));
		l3.setBounds(50,160,640,40);
		l3.setForeground(c3);
		
		l4 = new JLabel();
		l4.setText("<html>>Big, beautiful 6.76-inch OLED display with 120Hz refresh rate for smooth visuals<br>>Powerful Kirin 9000S processor for fast performance in apps and games<br>>50MP main camera for sharp photos, good zoom (up to 10x digital)<br>>Multiple storage options (256GB or 512GB) for your photos and videos<br><br><b>Price: 69,999৳ <s>72,349৳<s><b>");		
		l4.setFont(new Font("Calibri",Font.PLAIN,16));
		l4.setBounds(50,80,460,400);
		l4.setForeground(c3);

		l5 = new JLabel();
		l5.setText("Honor Magic V2");
		l5.setFont(new Font("Roboto",Font.BOLD,20));
		l5.setBounds(50,220,460,340);
		l5.setForeground(c3);
		
		l6 = new JLabel();
		l6.setText("<html>>Super thin foldable phone (9.9mm!) Powerful, big screens (outer 6.43, inner 7.92 LTPO OLED)<br>>Good cameras (50MP main)<br>>Decent battery with fast charging <br>>4600mAh battery<br><br><b>Price: 48,999৳ <s>50,899৳<s><b>");		
		l6.setFont(new Font("Calibri",Font.PLAIN,16));
		l6.setBounds(50,290,460,400);
		l6.setForeground(c3);
		
		userb = new JButton("User account");
		userb.setFont(new Font("Calibri",Font.BOLD,24));
		userb.setForeground(c2);
		userb.setBackground(c4);
		userb.setBounds(560,20,200,40);
		
		
		b1 = new JButton("Add to cart");
		b1.setFont(new Font("Calibri",Font.BOLD,18));
		b1.setForeground(c2);
		b1.setBackground(c4);
		b1.setBounds(620,310,180,30);

		b3 = new JButton("Add to cart");
		b3.setFont(new Font("Calibri",Font.BOLD,20));
		b3.setForeground(c2);
		b3.setBackground(c4);
		b3.setBounds(620,530,180,30);
		
		b4 = new JButton("Back");
		b4.setFont(new Font("Calibri",Font.BOLD,16));
		b4.setForeground(c2);
		b4.setBounds(300,20,160,20);
		
		b5 = new JButton("Home");
		b5.setFont(new Font("Calibri",Font.BOLD,16));
		b5.setForeground(c2);
		b5.setBounds(420,20,160,20);

		bca = new JButton("Explore Products");
        bca.setFont(new Font("Calibri",Font.BOLD,24));
        bca.setForeground(c2);
		bca.setContentAreaFilled(false);
		bca.setFocusable(false);
		bca.setBorderPainted(false);
        bca.setBounds(280,25,280,30);
        
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem desktopi = new JMenuItem("Desktop");
        JMenuItem laptopi = new JMenuItem("Laptop");
        JMenuItem smartphni = new JMenuItem("Smartphone");
        JMenuItem softwarei = new JMenuItem("Software");
		
        
        desktopi.addActionListener(this);
        laptopi.addActionListener(this);
        smartphni.addActionListener(this);
        softwarei.addActionListener(this);
		
		desktopi.setFont(new Font("Calibri", Font.BOLD, 18));
        laptopi.setFont(new Font("Calibri", Font.BOLD, 18));
        smartphni.setFont(new Font("Calibri", Font.BOLD, 18));
        softwarei.setFont(new Font("Calibri", Font.BOLD, 18));
        
        popupMenu.add(desktopi);
        popupMenu.add(laptopi);
        popupMenu.add(smartphni);
        popupMenu.add(softwarei);
		
        
        bca.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                popupMenu.show(bca, e.getX(), e.getY());
            }
        });


		b1.setBorderPainted(false);
		b1.setFocusable(false);
		b1.addActionListener(this);	
		
		userb.setBorderPainted(false);
		userb.setFocusable(false);
		userb.addActionListener(this);
		userb.setContentAreaFilled(false);
		
		b3.setBorderPainted(false);
		b3.setFocusable(false);
		b3.addActionListener(this);
		
		b4.setContentAreaFilled(false);
		b4.setBorderPainted(false);
		b4.setFocusable(false);
		b4.addActionListener(this);
		
		b5.setContentAreaFilled(false);
		b5.setBorderPainted(false);
		b5.setFocusable(false);
		b5.addActionListener(this);
		
		p1.add(top);
		p1.add(bottom);

		p1.add(b1);
		p1.add(b3);
		bottom.add(b4);
		bottom.add(b5);	
		top.add(userb);
		p1.add(pc1);
		p1.add(pc2);
		top.add(l2);
		top.add(bca);
		p1.add(l1);
		p1.add(l4);
		p1.add(l5);
		p1.add(l3);
		p1.add(l6);

		this.add(p1);		
	}	
	
	public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1)
			{
				JOptionPane.showMessageDialog(null,"Successfully added to cart");
				String ProductN = "Nova-12-Pro";
				double Price = 69999.0;
				CreateOrders co = new CreateOrders(ProductN, Price);
				co.addOrders();
			}
			else if(ae.getSource()==b3)
			{
				JOptionPane.showMessageDialog(null,"Successfully added to cart");
				String ProductN = "Honor-Magic-V2";
				double Price = 48999.0;
				CreateOrders co = new CreateOrders(ProductN, Price);
				co.addOrders();
			}
			else if(ae.getSource()==userb)
			{
				if (new File("bin/loginmemory.txt").exists()) {
					
					UserPage userPage = new UserPage();
					userPage.setVisible(true);
					this.setVisible(false);   
				} else {
				
					JOptionPane.showMessageDialog(null,"You have to Login first");
					login1 l = new login1();
					this.setVisible(false);
					l.setVisible(true);
				}
			}
			else if(ae.getSource()==b4)
			{
				smartphone2 h1 = new smartphone2();
				h1.setVisible(true);
				this.setVisible(false);
			}
			else if(ae.getSource()==b5)
			{
				home f = new home();
				this.setVisible(false);
                f.setVisible(true);
				f.bacc.setVisible(true);
				f.b1.setVisible(false);
				f.b2.setVisible(false);
			}
			    else if(ae.getActionCommand().equals("Desktop")) {
                desktop1 f = new desktop1();
                this.setVisible(false);
                f.setVisible(true);
            }
            else if(ae.getActionCommand().equals("Laptop")) {
                laptop1 f = new laptop1();
                this.setVisible(false);
                f.setVisible(true);
            }
            else if(ae.getActionCommand().equals("Smartphone")) {
                smartphone1 f = new smartphone1();
                this.setVisible(false);
                f.setVisible(true);
            }
			else if(ae.getActionCommand().equals("Software")) {
                software1 f = new software1();
                this.setVisible(false);
                f.setVisible(true);
            }
		}
	

}