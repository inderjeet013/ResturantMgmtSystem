import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;
class Second implements ActionListener 
{
JFrame fr;
JTextArea ta1, ta2,ta3;
JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10;
JPanel p1,cust;
JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8;
JButton b2,b1,b3,Submit;
int cn;
Timer t1;
int maintotal;
String s1[]={"chef2.jpg","restaurant-1284351_960_720.jpg"};
String s2[]={"c.jpg"};
String mkdir1;
Connection con;
Statement st;
Second()
{
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("connected");
        String url="jdbc:mysql://localhost:3306/project";
        System.out.println("connected");
		String username="root";
        String password="";
        con=DriverManager.getConnection(url,username,"");
        System.out.println("connected");
		st=con.createStatement();
		}
		catch (Exception e) 
		{
            System.out.println(e);//Logger.getLogger(First.class.getName()).log(Level.SEVERE, null, ex);
        }
fr=new JFrame("Customer details");
fr.setSize(1000,1000);
fr.setLayout(null);
Container c=fr.getContentPane();
c.setBackground(Color.pink);

p1=new JPanel();
p1.setBounds(600,0,400,1000);
fr.add(p1);

cust=new JPanel();
cust.setBounds(0,0,600,200);
fr.add(cust);
cust.setBackground(Color.GREEN);

lb2=new JLabel();
lb2.setBounds(0,0,600,200);
cust.add(lb2);
Icon x=new ImageIcon(s2[0]);	
lb2.setIcon(x);

lb1=new JLabel();
p1.add(lb1);
p1.setBackground(Color.green);
Font ft=new Font("verdana",Font.PLAIN,17);
Font f=new Font("verdana",Font.BOLD,17);
lb3=new JLabel("First Name                  : ");
lb3.setBounds(5,190,250,100);
fr.add(lb3);

tf5=new JTextField();//First name text field
tf5.setBounds(300,230,250,30);
fr.add(tf5);

lb4=new JLabel("Last Name                   : ");
lb4.setBounds(5,260,250,100);
fr.add(lb4);

tf6=new JTextField();//Last name TextField
tf6.setBounds(300,295,250,30);
fr.add(tf6);

lb5=new JLabel("Address                       : ");
lb5.setBounds(5,330,250,100);
fr.add(lb5);

ta2=new JTextArea();//Address TextField
ta2.setBounds(300,350,250,60);
fr.add(ta2);

lb8=new JLabel("E-Mail                          : ");
lb8.setBounds(5,410,250,90);
fr.add(lb8);

tf10=new JTextField("you@example.com");
tf10.setBounds(300,440,250,30);
fr.add(tf10);

lb6=new JLabel("Contact No                  : ");
lb6.setBounds(5,455,250,100);
fr.add(lb6);

tf7=new JTextField();//Contact TextField
tf7.setBounds(300,490,250,30);
fr.add(tf7);

lb7=new JLabel("Locality                       : ");
lb7.setBounds(5,520,250,100);
fr.add(lb7);

tf8=new JTextField();
tf8.setBounds(300,550,250,30);
fr.add(tf8);

b2=new JButton("Book");
b2.setBounds(30,615,400,30);
fr.add(b2);

b3=new JButton("Logout");
b3.setBounds(450,615,100,30);
fr.add(b3);

lb3.setFont(f);
lb4.setFont(f);
lb5.setFont(f);
lb6.setFont(f);
lb7.setFont(f);
lb8.setFont(f);
b2.setFont(f);
tf5.setFont(ft);
tf5.setForeground(Color.GREEN);
tf6.setFont(ft);
tf6.setForeground(Color.GREEN);
tf7.setFont(ft);
tf7.setForeground(Color.GREEN);
tf8.setFont(ft);
tf8.setForeground(Color.GREEN);
ta2.setFont(ft);
ta2.setForeground(Color.GREEN);

t1=new Timer(1000,this);
t1.start();
Icon j=new ImageIcon(s1[cn]);	   
lb1.setIcon(j);
b2.addActionListener(this);
b3.addActionListener(this);   
fr.setResizable(false);
fr.setVisible(true);
}
public static void main(String s[])
{
new Second();
}
public void actionPerformed(ActionEvent e)
{	
if(cn==0)
{
Icon j=new ImageIcon(s1[cn]);	   
lb1.setIcon(j);
cn=cn+1;
}
else
{
Icon j=new ImageIcon(s1[cn]);	   
lb1.setIcon(j);
cn=0;
}
if(e.getSource()==b3)
{
	fr.dispose();
	new First();
}

if(e.getSource()==b2)
{ 
try{
	
		if (tf5.getText().equals(""))
		{
	     JOptionPane.showMessageDialog(fr,"Please Enter the First Name","Message",JOptionPane.WARNING_MESSAGE);
		}
		else if (tf6.getText().equals(""))
		{
	     JOptionPane.showMessageDialog(fr,"Please Enter the Last Name","Message",JOptionPane.WARNING_MESSAGE);
		}
		else if (ta2.getText().equals(""))
		{
	     JOptionPane.showMessageDialog(fr,"Please Enter the Address","Message",JOptionPane.WARNING_MESSAGE);
		}
		else if (tf10.getText().equals("you@example.com"))
		{
	     JOptionPane.showMessageDialog(fr,"Please Enter the Email id","Message",JOptionPane.WARNING_MESSAGE);
		}
		else if (tf10.getText().equals(""))
		{
	     JOptionPane.showMessageDialog(fr,"Please Enter the Email id","Message",JOptionPane.WARNING_MESSAGE);
		}
		else if (tf7.getText().equals(""))
		{
	     JOptionPane.showMessageDialog(fr,"Please Enter the Phone_No","Message",JOptionPane.WARNING_MESSAGE);
		}
		else if (tf8.getText().equals(""))
		{
	     JOptionPane.showMessageDialog(fr,"Please Enter the Locality","Message",JOptionPane.WARNING_MESSAGE);
		}
		else {
String first=tf5.getText();
String second=tf6.getText();
mkdir1=first+second;
maintotal=project3.amount;
String location="D:\\Project\\Project1\\Orders\\";
File F1=new File(location+mkdir1);
F1.mkdir();//Create Directory
	
File F2=new File(F1,"Order.txt");
F2.createNewFile();
PrintStream ps=new PrintStream(F2);
ps.println("Name :  "+tf5.getText());
ps.println("Last Name :  "+tf6.getText());
ps.println("Address : "+ta2.getText());
ps.println("Locality :  "+tf8.getText());
ps.println("Contact No :  "+tf7.getText());
ps.println("Email Id :  "+tf10.getText());
ps.println("\n\n");
ps.println("Your Selected Items are :");
ps.println("\n\n");
ps.println(project3.drinks);
ps.println(project3.indianfood);
ps.println(project3.chinesefood);
ps.println(project3.nonveg);
ps.println(project3.sweets);
ps.println(project3.pizza);
ps.println(project3.others);
ps.println("\n");
ps.println("\n");
ps.println("\n");
ps.println("*******************************************************");
ps.println("\n");
ps.println("\n");
ps.println("Your Total amount : "+maintotal);

String email=tf10.getText();
String n=tf7.getText();
System.out.println("eeeee");
String query="insert into student12 values('"+email+"',"+n+")";
int x=st.executeUpdate(query);
Thread.sleep(2000);
JOptionPane.showMessageDialog(fr,"Your Order Successfully Booked :)","Success Order",JOptionPane.INFORMATION_MESSAGE);
fr.dispose();
new project3();
}
}
catch(Exception fi)
{
	System.out.println(e);
}   
}
}
}