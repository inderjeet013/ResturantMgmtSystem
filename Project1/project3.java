import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

class project3 implements ActionListener 
{
static String my;
JFrame fr;
JTabbedPane tb;
//JButton b1,b2,b3,b4; 
JPanel p1;
ImageIcon i1;
JLabel l1;
JTextField f1[];
Container c;
static JTextArea pa;
JLabel la;
JButton show,save;
static String drinks="";  
static String indianfood="";
static String chinesefood="";
static String nonveg="";
static String sweets="";
static String pizza="";
static String others="";
static int total;
static int drinkssum1,indianfoodsum2,chinesefoodsum3,nonvegsum4,sweetssum5,pizzasum6,otherssum7;
JLabel l12,l13; 
static int amount;
  
project3()
{
Font fn=new Font("verdana",Font.BOLD,20);//For Label on Panel
Font fn2=new Font("verdana",Font.BOLD,16);
Font fo=new Font("verdana",Font.BOLD,15);//For TextField On panel
Color f=new Color(213,134,145,50);
Color fz=new Color(204,255,204);	
	  
fr=new JFrame("A.C Restaurant");
fr.setSize(900,900);
fr.setLayout(null);
c=fr.getContentPane();
c.setBackground(f);
	
tb=new JTabbedPane();
tb.setBounds(10,10,600,900);
fr.add(tb);
          	
tb.addTab(" Drinks ",new Drinks());
tb.addTab("Indian    Food ",new IndianFood());
tb.addTab("Chinese   Food",new ChineseFood());
tb.addTab("Non  Veg  Food",new Nonveg());
tb.addTab("Sweets",new Sweets());
tb.addTab(" Pizza ",new Pizza());
tb.addTab("Other    Items",new Others());

p1=new JPanel();
p1.setBounds(612,10,280,900);
fr.add(p1);
p1.setBorder(new LineBorder(Color.black,3));
p1.setBackground(f);
p1.setLayout(null);
la=new JLabel("Selected Item :-");
la.setBounds(5,10,200,30);
p1.add(la);
la.setFont(fn);
	
pa=new JTextArea();
pa.setBounds(5,50,272,500);
p1.add(pa);
pa.setBackground(fz);
pa.setEditable(false);
pa.setFont(fo);
pa.setForeground(Color.DARK_GRAY);
	
show=new JButton("Show Item");
show.setBounds(30,600,100,40);
p1.add(show);  
Icon i=new ImageIcon("show.jpg");

save=new JButton("Save");
save.setBounds(150,600,100,40);
p1.add(save);
Icon j=new ImageIcon("save.jpg");

show.addActionListener(this);	
save.addActionListener(this);	
  
fr.setResizable(false);
fr.setVisible(true);
}
public static void main(String s[])
{
new project3();
}
public void actionPerformed(ActionEvent e)
{
	my=(drinks)+"\n"+(indianfood)+"\n"+(chinesefood)+"\n"+(nonveg)+"\n"+(sweets)+"\n"+(pizza)+"\n"+(others);
	if(e.getSource()==show)
	{
		for(int i=0;i<Drinks.l1.length;i++)
		{
		Drinks.l1[i].setEnabled(false);
		}
		for(int i=0;i<Drinks.fl.length;i++)
		{
   	    Drinks.fl[i].setEditable(false);
		}
	    for(int i=0;i<IndianFood.l1.length;i++)
	    {
   	    IndianFood.l1[i].setEnabled(false);
		}
	    for(int i=0;i<IndianFood.fl.length;i++)
		{
		IndianFood.fl[i].setEditable(false);
	    }
		for(int i=0;i<ChineseFood.l1.length;i++)
		{
		ChineseFood.l1[i].setEnabled(false);
		}
		for(int i=0;i<ChineseFood.fl.length;i++)
		{
	    ChineseFood.fl[i].setEditable(false);
		}
		for(int i=0;i<Nonveg.l1.length;i++)
		{
	    Nonveg.l1[i].setEnabled(false);
		}
	    for(int i=0;i<Nonveg.fl.length;i++)
		{
	    Nonveg.fl[i].setEditable(false);
		}
	    for(int i=0;i<Sweets.l1.length;i++)
	    {
     	Sweets.l1[i].setEnabled(false);
		}
		for(int i=0;i<Sweets.fl.length;i++)
		{
	    Sweets.fl[i].setEditable(false);
	    }
		for(int i=0;i<Pizza.l1.length;i++)
		{
	    Pizza.l1[i].setEnabled(false);
		}
		for(int i=0;i<Pizza.fl.length;i++)
	    {
	    Pizza.fl[i].setEditable(false);
		}
		for(int i=0;i<Others.l1.length;i++)
		{
    	Others.l1[i].setEnabled(false);
	    }
	    for(int i=0;i<Others.fl.length;i++)
		{
	    Others.fl[i].setEditable(false);
	    }
		 
		Drinks.b1.setEnabled(false);
		IndianFood.b1.setEnabled(false);
		ChineseFood.b1.setEnabled(false);
		Nonveg.b1.setEnabled(false);
		Sweets.b1.setEnabled(false);
		Pizza.b1.setEnabled(false);
		Others.b1.setEnabled(false);
		l13=new JLabel("*****************************************************");//Payable amount Label
        l13.setBounds(0,447,272,10);	
	    project3.pa.add(l13);
	
	 l12=new JLabel();//Payable amount Label
     l12.setBounds(5,450,250,40);	
	 project3.pa.add(l12);
	 
	 l12.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,17));
	 project3.pa.setText(my);
     int total=(drinkssum1)+(indianfoodsum2)+(chinesefoodsum3)+(nonvegsum4)+sweetssum5+pizzasum6+otherssum7;	 
	 l12.setText("Payable Amount : "+total);
	}
	if(e.getSource()==save)
	 {
	 fr.dispose();
     new Second();
	 }
}
}