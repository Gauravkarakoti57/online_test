
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


public class reg extends JFrame implements ActionListener{
		JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
		JTextField t1,t2,t3,t4,t5,t6,t7,t8;
		JButton b1,b2;
		Connection con;
		PreparedStatement ps;
		ResultSet rs;


		public reg(){ 
			super("in reg");
			l1=new JLabel("New Registration Form");
			l2=new JLabel("First Name");
			l3=new JLabel("Last Name");
			l4=new JLabel("D.O.B");
			l5=new JLabel("Contact");
			l6=new JLabel("E-mail");
			l7=new JLabel("Address");
			l8=new JLabel("Username");
			l9=new JLabel("Password");
			t1=new JTextField();
			t2=new JTextField();
			t3=new JTextField();
			t4=new JTextField();
			t5=new JTextField();
			t6=new JTextField();
			t7=new JTextField();
			t8=new JTextField();
			b1=new JButton("Login");
			b2=new JButton("SignUp");
			setLayout(null);
			l1.setBounds(300,50,200,20);
			l2.setBounds(300,100,100,20);
			t1.setBounds(500,100,100,20);
			l3.setBounds(300,140,100,20);
			t2.setBounds(500,140,100,20);
			l4.setBounds(300,180,200,20);
			t3.setBounds(500,180,100,20);
			l5.setBounds(300,220,200,20);
			t4.setBounds(500,220,100,20);
			l6.setBounds(300,260,200,20);
			t5.setBounds(500,260,100,20);
			l7.setBounds(300,300,200,20);
			t6.setBounds(500,300,100,20);
			l8.setBounds(300,340,200,20);
			t7.setBounds(500,340,100,20);
			l9.setBounds(300,380,200,20);
			t8.setBounds(500,380,100,20);
			b1.setBounds(300,440,100,20);
			b2.setBounds(500,440,100,20);
			b1.addActionListener(this);
			b2.addActionListener(this); 
			add(l1);
			add(l2);
			add(t1);
			add(l3);
			add(t2);
			add(l4);
			add(t3);
			add(l5);
			add(t4);
			add(l6);
			add(t5);
			add(l7);
			add(t6);
			add(l8);
			add(t7);
			add(l9);
			add(t8);
			add(b1);
			add(b2);
			try
		{
		Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/online_test","root","root");
		}
		catch(Exception e)
		{
			System.out.println("\nError:"+e);
		}
			setSize(1000,1000);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		}
			public void actionPerformed(ActionEvent ae)
			{
				Object o = ae.getSource();

				if(o==b1)
				{
					new Login();
					this.dispose();
				}

				if(o==b2)
				{
				/*int a=Integer.parseInt(t1.getText());
				int b=Integer.parseInt(t2.getText());
				int c=Integer.parseInt(t3.getText());
				int d=Integer.parseInt(t4.getText());
				int e=Integer.parseInt(t5.getText());
				int f=Integer.parseInt(t6.getText());
				int g=Integer.parseInt(t7.getText());
				int h=Integer.parseInt(t8.getText());*/
				
				
				try{
					ps=con.prepareStatement("insert into registration values (?,?,?,?,?,?,?,?)");
					ps.setString(1,t1.getText());
					ps.setString(2,t2.getText());
					ps.setString(3,t3.getText());
					ps.setString(4,t4.getText());
					ps.setString(5,t5.getText());
					ps.setString(6,t6.getText());
					ps.setString(7,t7.getText());
					ps.setString(8,t8.getText());
					ps.executeUpdate();
					    
						JOptionPane.showMessageDialog(this,"values added to reg ","OK",JOptionPane.INFORMATION_MESSAGE);
				   }
				catch(Exception s)
				   {
					 System.out.print(s);  
				   }
				}
				else
				{
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					t6.setText("");
					t7.setText("");
					t8.setText("");
				}

			}
		
		/*class handlers implements ActionListener{
			public void actionPerformed(ActionEvent e)
			{
				String sql = "insert into registration "
										+ "	 (fname, lname,dob,contact, email,address,uname,pass)" + " values (?, ?, ?,?,?,?,?,?)";

				myStmt = conn.prepareStatement(sql);

				myStmt.setString(1, fName);
				myStmt.setString(2, lName);
				myStmt.setString(3, email);
				myStmt.setString(1, lastName);
				myStmt.setString(1, lastName);
				myStmt.setString(1, lastName);
				myStmt.setString(1, lastName);
				myStmt.setString(1, lastName);

				myStmt.executeUpdate();
			}
		}*/
	public static void main(String args[])
	{
		//Connection con=null;		 
		//try{
	//con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_test","root","root");
	//		}
	//		catch(Exception e)
	//		{
	//			System.out.println("\nError:"+e);
	//		}
		reg jf=new reg();
		
	}
}