
import javax.swing.*;
public class result extends JFrame
{
	JLabel l1,l2,l3;
	JTextField t1,t2;
	JButton b,b1,b2;
	
	public result(String s)
	{
		super(s);
	}
	public void setComponents()
	{
		l1=new JLabel("YOUR SCORE IS:");
		l2=new JLabel("Score");
		l3=new JLabel("Grade");
		t1=new JTextField();
		t2=new JTextField();
		b1=new JButton("HELP");
		b2=new JButton("Contact Us");
		ImageIcon i=new ImageIcon("home.jpg");
		b=new JButton(i);
		setLayout(null);
		l1.setBounds(100,50,150,70);
		l2.setBounds(80,100,100,30);
		t1.setBounds(160,100,50,20);
		l3.setBounds(80,130,100,30);
		t2.setBounds(160,130,50,20);
		b1.setBounds(80,180,70,20);
		b2.setBounds(170,180,100,20);
		b.setBounds(270,270,30,30);
		add(l1);
		add(l2);
		add(t1);
		add(l3);
		add(t2);
		add(b1);
		add(b2);
		add(b);
	}
	public static void main(String[] args)
	{
		result jf=new result("Result");
		jf.setSize(350,350);
		
		jf.setComponents();
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
		