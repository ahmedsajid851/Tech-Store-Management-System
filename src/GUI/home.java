package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class home extends JFrame implements ActionListener {
    
    JTextField t1, t2;
    JButton b1, b2, b3, b4, b5, bacc;
    JLabel l1, l2, l3, l6, l4, l5, top, body;
    ImageIcon img1, img2;
    JPanel p1, p2;
    Color c1 = new Color(0,0,153);//blue
    Color c2 = new Color(255,255,255);//white
    Color c3 = new Color(0, 0, 11);//black
    Color c4 = new Color(48, 12, 143);//blueish purple
    
    public home(){
        
        super("Home");
        this.setSize(900, 700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setBackground(c1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        p1 = new JPanel();
        p1.setSize(new Dimension(900,700));
        p1.setBackground(c4);
        p1.setLayout(null);
        

        
        img1 = new ImageIcon(getClass().getResource("images/image6.jpg"));
        JLabel body = new JLabel(img1);
        body.setSize(900, 600);
        body.setBounds(0,0,img1.getIconWidth(),700);
        
        img2 = new ImageIcon(getClass().getResource("images/image61.jpg"));
        top = new JLabel(img2);
        top.setSize(900, 200);
        top.setBounds(0,0,img2.getIconWidth(),80);
        
        
        l2 = new JLabel("XenTech");
        l2.setFont(new Font("Calibri",Font.BOLD,50));
        l2.setForeground(c4);
        l2.setBounds(44,20,200,50);
        
        b1 = new JButton("Login");
        b1.setFont(new Font("Calibri",Font.BOLD,20));
        b1.setForeground(c2);
        b1.setBounds(640,25,100,30);
		
		bacc = new JButton("User account");
        bacc.setFont(new Font("Calibri",Font.BOLD,20));
        bacc.setForeground(c2);
        bacc.setBounds(640,25,180,30);
		bacc.setVisible(false);

        
        b2 = new JButton("Sign up");
        b2.setFont(new Font("Calibri",Font.BOLD,20));
        b2.setForeground(c2);
        b2.setBounds(740,25,100,30);
        
        b3 = new JButton("Explore Products");
        b3.setFont(new Font("Calibri",Font.BOLD,24));
        b3.setForeground(c2);
        b3.setBounds(300,25,280,30);
        
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
		
        
        b3.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                popupMenu.show(b3, e.getX(), e.getY());
            }
        });
        
        l4 =new JLabel();
        l4.setText("Welcome to XenTech!");
        l4.setFont(new Font("Roboto",Font.BOLD,30));
        l4.setBounds(50,100,460,100);
        l4.setForeground(c2);
        
        
        l5 = new JLabel();
        l5.setText("<html><i>Elevate your digital experience with our selection of elite products, designed to empower your skills and performance<i><html>");
        l5.setFont(new Font("Calibri",Font.BOLD,24));
        l5.setBounds(50,220,340,340);
        l5.setForeground(c2);
        
        b4 = new JButton("Leave this page");
        b4.setFont(new Font("Calibri",Font.BOLD,16));
        b4.setForeground(c2);
        b4.setBounds(360,600,160,30);
        
        b1.setContentAreaFilled(false);
        b1.setBorderPainted(false);
        b1.setFocusable(false);
        b1.addActionListener(this); 
		
		bacc.setContentAreaFilled(false);
        bacc.setBorderPainted(false);
        bacc.setFocusable(false);
        bacc.addActionListener(this);   
        
        b2.setContentAreaFilled(false);
        b2.setBorderPainted(false);
        b2.setFocusable(false);
        b2.addActionListener(this);
        
        b3.setContentAreaFilled(false);
        b3.setBorderPainted(false);
        b3.setFocusable(false);
        
        b4.setContentAreaFilled(false);
        b4.setBorderPainted(false);
        b4.setFocusable(false);
        b4.addActionListener(this);
		
        
        p1.add(top);        
        p1.add(body);
        
        top.add(b1);
        top.add(bacc);
        top.add(b2);
        top.add(b3);
        body.add(b4);
        
        top.add(l2);
        body.add(l4);       
        body.add(l5);
        
        
        this.add(p1);       
    }   
	
		public void mouseClicked(MouseEvent me) {}
		public void mousePressed(MouseEvent me) {}
		public void mouseReleased(MouseEvent me) {}
		public void mouseEntered(MouseEvent me) {
	if (me.getSource() == b1||me.getSource() == b2) {
            b1.setBackground(c4);
            b1.setForeground(c2);
			b1.setContentAreaFilled(true);
			b2.setBackground(c2);
            b2.setForeground(c4);
			b2.setContentAreaFilled(true);
        }
    }
    public void mouseExited(MouseEvent me) {
        if (me.getSource() == b1) {
            b1.setContentAreaFilled(false);
            b2.setContentAreaFilled(false);
        }
	}
    public void actionPerformed(ActionEvent ae)
        {
            if(ae.getSource()==b1)
            {
                login1 q1 = new login1();
                q1.setVisible(true);
                this.setVisible(false);
            }
            else if(ae.getSource()==b2)
            {
                sign1 f = new sign1();
                this.setVisible(false);
                f.setVisible(true);
            }else if(ae.getSource()==bacc)
            {
                UserPage userPage = new UserPage();
				userPage.setVisible(true);
				this.setVisible(false);
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
            else if(ae.getSource()==b4)
            {
			int choice = JOptionPane.showConfirmDialog(null, "Do you want to leave this page?", "Exit", JOptionPane.YES_NO_OPTION);
			if (choice == JOptionPane.YES_OPTION) {
					System.exit(0);
               }
			else{ 
	            }
			}
		}
        public static void main(String [] args){
		
            home h1 = new home();
            h1.setVisible(true);
    
        }
}
