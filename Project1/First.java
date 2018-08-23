import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*; 
import java.io.*;
import java.util.logging.*;

class First implements ActionListener
{
JFrame fr1;
JPanel p1,p2,p3;
JTextField f1;
JPasswordField jp;
JButton b1;
JLabel l1,l2,l3,l4,l5;
Timer t1;
int cn;
String s1[]={"delicious-and-yummy-food-photos.jpg","delicious-and-yummy-food-photos-8.jpg","delicious-and-yummy-food-photos-16.jpg","delicious-and-yummy-food-photos-17.jpg"};
String s2[]={"logo2.jpg"};
int cnt;
String id,pass;
Connection con;
Statement st;
ResultSet rs;

First()
{
    try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("connected");
        String url="jdbc:mysql://localhost:3306/restaurant";
        System.out.println("connected");
		String username="root";
        String password="";
        con=DriverManager.getConnection(url,username,"");
        System.out.println("connected");
		st=con.createStatement();
		rs=st.executeQuery("select * from user");
		System.out.println("connected");
		rs.next();
		}
		catch (Exception e) 
		{
            System.out.println(e);//Logger.getLogger(First.class.getName()).log(Level.SEVERE, null, ex);
        }
 
fr1=new JFrame("Log in");
fr1.setSize(800,800);
fr1.setLayout(null);
	
p1=new JPanel();//For Panel 1
p1.setBounds(0,0,800,200);
fr1.add(p1);
l4=new JLabel();
l4.setBounds(-10,0,800,200);
p1.add(l4);

Font fp1=new Font("jokerman",Font.PLAIN,30);

l5=new JLabel();
l5.setBounds(140,30,800,100);
p1.add(l5);
Icon j=new ImageIcon(s2[0]);//Image on panel 3
l4.setIcon(j);
	
// 1. l5.setFont(fp1);
//p1.setBackground(Color.RED);

p2=new JPanel();//For panel 2
p2.setBounds(0,200,500,600);
p2.setLayout(null);
fr1.add(p2);
p2.setBackground(Color.RED);

Font f=new Font("verdana",Font.HANGING_BASELINE,20);

l1=new JLabel("Email id              :");//Label for email
l1.setBounds(30,80,250,50);
p2.add(l1);
l1.setFont(f);

l2=new JLabel("Password             :");//Label for Password
l2.setBounds(30,200,250,50);
p2.add(l2);
l2.setFont(f);

p3=new JPanel();//For Panel 3
p3.setBounds(500,200,300,600);	
fr1.add(p3);
l3=new JLabel();
l3.setBounds(0,0,300,600);
p3.add(l3);//Button p3 add on panel p3
p3.setBackground(Color.BLACK);//dark-grey
p3.setOpaque(true);
f1=new JTextField("you@example.com");//For Text field in panel p2
f1.setBounds(300,90,190,30);
p2.add(f1);

jp=new JPasswordField("");
jp.setBounds(300,210,190,30);
p2.add(jp);

b1=new JButton("Submit");
b1.setBounds(200,350,120,50);
p2.add(b1);
Icon i=new ImageIcon(s1[cn]);//Image on panel 3
l3.setIcon(i);
		
t1=new Timer(1000,this);//Timer
t1.start();

b1.addActionListener(this);
fr1.setResizable(false);
fr1.setVisible(true);
}
public static void main(String s[])throws Exception
{		
new First();

}
public void actionPerformed(ActionEvent e)
{	
	if(e.getSource()==b1)
	{
		if (f1.getText().equals("you@example.com"))
		{
	     JOptionPane.showMessageDialog(fr1,"Please Enter the Your Email id","Message",JOptionPane.WARNING_MESSAGE);
		}
		else if(f1.getText().equals("")&&jp.getText().equals(""))
		{
	    JOptionPane.showMessageDialog(fr1,"Please Enter the Email id And Password","Message",JOptionPane.WARNING_MESSAGE);
		}
		else if(f1.getText().equals(""))
		{
		JOptionPane.showMessageDialog(fr1,"Please Enter the Email id","Email",JOptionPane.WARNING_MESSAGE); 
		}
		else if(jp.getText().equals(""))
		{ 			   
		JOptionPane.showMessageDialog(fr1,"Please Enter the Password","Password",JOptionPane.WARNING_MESSAGE);
		}	
	else
		{
			try{		
				id=f1.getText();
				pass=jp.getText();
				if((rs.getInt(2)==Integer.parseInt(pass))&&(rs.getString(1).equals(id)))
				{
				JOptionPane.showMessageDialog(null,"Thanx U For Login");	
				fr1.dispose();
				new project3();
				}
				else
				{
				JOptionPane.showMessageDialog(fr1,"Please Enter the valid detail","",JOptionPane.WARNING_MESSAGE);
				}
				}
			catch(Exception ep)
				{
				ep.printStackTrace();
				}	    
		}
	}
Icon i=new ImageIcon(s1[cn]);//Image on panel 3
l3.setIcon(i);
if(cn==0)
{
l3.setIcon(i);
p1.setBackground(Color.DARK_GRAY);
cn=cn+1;		  
}
else if(cn==1)
{ 
l3.setIcon(i);
p1.setBackground(Color.BLACK);
cn=cn+1;	
}
else 
{
p1.setBackground(Color.DARK_GRAY);
cn=0;	
}
}
}