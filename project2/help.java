
import javax.swing.*;
import java.awt.event.*;
public class help extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6;
	JButton b1;
	ImageIcon img;
	public help()
	{
		super("HELP");
		l1=new JLabel("HELP");
		l2=new JLabel("The test contains 6 subjects.");
		l3=new JLabel("Each module consists of 10 questions for your test.");
		l4=new JLabel("You can test yourself in different language or subject.");
		l5=new JLabel("As many times you give the test, it increases your ");
		l6=new JLabel("knowledge as well as your practice.");
		setLayout(null);
		img=new ImageIcon("home.jpg");
		b1=new JButton(img);
		l1.setBounds(200,20,250,70);
		l2.setBounds(80,100,350,20);
		l3.setBounds(80,140,350,20);
		l4.setBounds(80,180,350,20);
		l5.setBounds(80,220,350,20);
		l6.setBounds(80,260,350,20);
		b1.setBounds(455,435,30,30);
		b1.setBorder(null);
		b1.addActionListener(this);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
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
		help jf=new help();
	}
}