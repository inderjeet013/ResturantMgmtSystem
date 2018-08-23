import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Nonveg extends JPanel implements ActionListener
{		
static JCheckBox l1[];
JLabel p1,p2,p3;
JLabel c1[];
JLabel image,text;
JLabel cost;
String s1[]={"Nonveg.jpg"};
String s2[]={"130","120","150","120","170","140","100","60","100"};
String s3[]={"Motton Korma","Nihari Gosht","Fish curry","Chicken biryani","chicken","Garlic chicken","Kabab","Omlet","Methi Murg"};
static JTextField fl[];
int y=50;
int sum4;
static String full4;
static JButton b1;
int x[]=new int[9];

Nonveg()
{
Color n=new Color(210,105,30);
c1=new JLabel[9];
Font f1=new Font("verdana",Font.BOLD|Font.ITALIC,17);
setLayout(new BorderLayout());
setBackground(Color.GREEN);
image=new JLabel();//Label for image
image.setBounds(10,10,600,700);
add(image);

Icon j=new ImageIcon(s1[0]);//Backgroundimage
image.setIcon(j);

l1=new JCheckBox[9];
for(int i=0;i<l1.length;i++)
{
l1[i]=new JCheckBox(s3[i]);
l1[i].setBounds(5,y,180,20);
l1[i].setOpaque(true);
Color co=new Color(210,105,30);
l1[i].setBackground(co);
//add(l1);
l1[i].setForeground(Color.black);
l1[i].setFont(f1);
image.add(l1[i]);
y=y+70;
}

cost=new JLabel("price(Rs)");//Main cost Label
cost.setBounds(450,5,130,20);
//cost.setOpaque(true);
cost.setForeground(Color.white);
//cost.setBackground(Color.black); 
Font f2=new Font("jokerman",Font.PLAIN,20);
cost.setFont(f2);
image.add(cost);
y=50;
for(int i=0;i<9;i++)
{    
	c1[i]=new JLabel(s2[i]);
	c1[i].setBounds(450,y,50,20);
	c1[i].setOpaque(true);
    c1[i].setForeground(Color.red);
    c1[i].setBackground(Color.GREEN); 
    c1[i].setFont(f1);
	image.add(c1[i]);
	y=y+70;
}
text=new JLabel("Quantity");
text.setBounds(280,5,130,20);
text.setForeground(Color.white);
text.setFont(f2);
image.add(text);

fl=new JTextField[9];
int z=50;
for(int i=0;i<=8;i++)
{
fl[i]=new JTextField();
	fl[i].setBounds(280,z,40,20);
	fl[i].setBackground(n);
    fl[i].setFont(f1);
	fl[i].setForeground(Color.black);
	image.add(fl[i]);
	z=z+70;
}
for(int i=0;i<=8;i++)
{

fl[i].setEditable(false);
}

for(int i=0;i<l1.length;i++)
{
l1[i].addActionListener(this);
}
b1=new JButton("Add");//Button 
b1.setBounds(460,650,150,30);
image.add(b1);
b1.setBackground(Color.green);
b1.setFont(f1);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
	for(int i=0;i<l1.length;i++)
	{
	if(l1[i].isSelected()==true)
	{
		fl[i].setEditable(true);
	}
	}
	for(int i=0;i<l1.length;i++)
	{
	if(l1[i].isSelected()==false)
	{
		fl[i].setText("");
		fl[i].setEditable(false);
	}
	}
		//String full=project3.pa.getText();//----->Backward Selected Item
		project3.pa.setText("");
		if(l1[0].isSelected())
		{
			project3.pa.setText(project3.pa.getText()+"\n"+l1[0].getText());
		}
        if(l1[1].isSelected())
		{
			project3.pa.setText(project3.pa.getText()+"\n"+l1[1].getText());
		}
		if(l1[2].isSelected())
		{
			project3.pa.setText(project3.pa.getText()+"\n"+l1[2].getText());   
		}
        if(l1[3].isSelected())
		{
			project3.pa.setText(project3.pa.getText()+"\n"+l1[3].getText());
		}
		if(l1[4].isSelected())
		{
			project3.pa.setText(project3.pa.getText()+"\n"+l1[4].getText());
		}
        if(l1[5].isSelected())
		{
			project3.pa.setText(project3.pa.getText()+"\n"+l1[5].getText());
		}
		if(l1[6].isSelected())
		{
			project3.pa.setText(project3.pa.getText()+"\n"+l1[6].getText());
		}
        if(l1[7].isSelected())
		{
			project3.pa.setText(project3.pa.getText()+"\n"+l1[7].getText());
		}
		if(l1[8].isSelected())
		{
			project3.pa.setText(project3.pa.getText()+"\n"+l1[8].getText());
		}
		
		//For Submit
		if(e.getSource()==b1)
		{
		sum4=0;
		project3.pa.setText("");	
		if(l1[0].isSelected())
		{ 
			x[0]=(Integer.parseInt(fl[0].getText()))*(Integer.parseInt(c1[0].getText()));
			project3.pa.setText(project3.pa.getText()+"\n"+l1[0].getText()+"\t"+fl[0].getText()+" * "+c1[0].getText()+" = "+x[0]);   
			sum4=sum4+x[0];
		}
        if(l1[1].isSelected())
		{
			x[1]=(Integer.parseInt(fl[1].getText()))*(Integer.parseInt(c1[1].getText()));
			project3.pa.setText(project3.pa.getText()+"\n"+l1[1].getText()+"\t"+fl[1].getText()+" * "+c1[1].getText()+" = "+x[1]);
			sum4=sum4+x[1];  
		}
		if(l1[2].isSelected())
		{
			x[2]=(Integer.parseInt(fl[2].getText()))*(Integer.parseInt(c1[2].getText()));
			project3.pa.setText(project3.pa.getText()+"\n"+l1[2].getText()+"\t"+fl[2].getText()+" * "+c1[2].getText()+" = "+x[2]);
			sum4=sum4+x[2];
		}
        if(l1[3].isSelected())
		{
			x[3]=(Integer.parseInt(fl[3].getText()))*(Integer.parseInt(c1[3].getText()));
			project3.pa.setText(project3.pa.getText()+"\n"+l1[3].getText()+"\t"+fl[3].getText()+" * "+c1[3].getText()+" = "+x[3]);
			sum4=sum4+x[3];
		}
		if(l1[4].isSelected())
		{
			x[4]=(Integer.parseInt(fl[4].getText()))*(Integer.parseInt(c1[4].getText()));
			project3.pa.setText(project3.pa.getText()+"\n"+l1[4].getText()+"\t"+fl[4].getText()+" * "+c1[4].getText()+" = "+x[4]);
			sum4=sum4+x[4];
		}
        if(l1[5].isSelected())
		{
			
			x[5]=(Integer.parseInt(fl[5].getText()))*(Integer.parseInt(c1[5].getText()));
			project3.pa.setText(project3.pa.getText()+"\n"+l1[5].getText()+"\t"+fl[5].getText()+" * "+c1[5].getText()+" = "+x[5]);
			sum4=sum4+x[5];
		}
		if(l1[6].isSelected())
		{
			x[6]=(Integer.parseInt(fl[6].getText()))*(Integer.parseInt(c1[6].getText()));
			project3.pa.setText(project3.pa.getText()+"\n"+l1[6].getText()+"\t"+fl[6].getText()+" * "+c1[6].getText()+" = "+x[6]);
			sum4=sum4+x[6];
		}
        if(l1[7].isSelected())
		{
			x[7]=(Integer.parseInt(fl[7].getText()))*(Integer.parseInt(c1[7].getText()));
			project3.pa.setText(project3.pa.getText()+"\n"+l1[7].getText()+"\t"+fl[7].getText()+" * "+c1[7].getText()+" = "+x[7]);
			sum4=sum4+x[7];
		}
		if(l1[8].isSelected())
		{
			x[8]=(Integer.parseInt(fl[8].getText()))*(Integer.parseInt(c1[8].getText()));
			project3.pa.setText(project3.pa.getText()+"\n"+l1[8].getText()+"\t"+fl[8].getText()+" * "+c1[8].getText()+" = "+x[8]);	
	     	sum4=sum4+x[8];
		}
		full4=project3.pa.getText();
		System.out.println(full4);
		project3.nonveg=full4;	
	}
	 project3.nonvegsum4=sum4;
}
public static void main(String s[])
{
new Nonveg();
}
}