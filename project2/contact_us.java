import javax.swing.*;
import java.awt.event.*;
public class contact_us extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JPanel jp;
	JButton b1;
	ImageIcon img;
	public contact_us()
	{
		super("Contact Us");
		l1=new JLabel("CONTACT US");
		l2=new JLabel("For any further queries, you can:");
		l3=new JLabel("Email us on: manavpathania@gmail.com");
		l4=new JLabel("amanaggarwal146@gmail.com");
		l5=new JLabel("gauravkarakoti@gmail.com");
		l6=new JLabel("palakdhamija25@gmail.com");
		l7=new JLabel("Or you can call us on:9728637766");
		l8=new JLabel("7888687064");
		img=new ImageIcon("home.jpg");
		b1=new JButton(img);
		setLayout(null);
		//b1.setIcon(new ImageIcon("home.jpg"));

		l1.setBounds(200,20,250,70);
		l2.setBounds(80,100,350,20);
		l3.setBounds(80,130,250,20);
		l4.setBounds(150,160,250,20);
		l5.setBounds(150,190,250,20);
		l6.setBounds(150,220,250,20);
		l7.setBounds(80,250,250,20);
		l8.setBounds(200,280,250,20);
		b1.setBounds(455,435,30,30);
		b1.setBorder(null);
		b1.addActionListener(this);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(l8);
		add(b1);
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		public void actionPerformed(ActionEvent e)
			{
				new Login();
				this.dispose();
			}
		
	public static void main(String[] args)
	{
		contact_us jf=new contact_us();
	}
}