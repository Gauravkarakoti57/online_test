

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
		
		JLabel l1,l2,l3;
		JTextField t1,t2;
		JButton b1,b2;

		public Login(){ 
			super("in Login");
			l1=new JLabel("Login:");
			l2=new JLabel("Username :");
			l3=new JLabel("Password :");
			t1=new JTextField();
			t2=new JTextField();
			b1=new JButton("Login");
			b2=new JButton("New User");
			setLayout(null);
			l1.setBounds(110,50,200,20);
			l2.setBounds(50,80,100,20);
			t1.setBounds(150,80,100,20);
			l3.setBounds(50,110,100,20);
			t2.setBounds(150,110,100,20);
			b1.setBounds(50,140,90,20);
			b2.setBounds(150,140,90,20);
			b1.addActionListener(this);
			b2.addActionListener(this); 
			add(l1);
			add(l2);
			add(t1);
			add(l3);
			add(t2);
			add(b1);
			add(b2);
			setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
			public void actionPerformed(ActionEvent e)
			{
				Object o = ae.getSource();
				if(o==b1)
				{
					if((user.equals(username)) && (pass.equals(password)))
						{
						 new help();
						 this.dispose();
						} 
					else{
   						JOptionPane.showMessageDialog(null, "alert", "alert", JOptionPane.ERROR_MESSAGE);
						}

				}
				if(o==b2)
				{	new reg();
					this.dispose();
				}
			}
		
	public static void main(String args[])
	{
		Login jf=new Login();
		

	}
}