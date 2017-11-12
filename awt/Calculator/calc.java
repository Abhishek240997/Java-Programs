import java.awt.*;

class calc
{
	TextField tf;
	Frame fr;
	Button b[]=new Button[16];
	String value[]={"1","2","3","+","4","5","6","-","7","8","9","*",".","0","=","/"};
	
	calc()
	{	

		Frame fr=new Frame("Calculator");
		fr.setLayout(null);
		TextField tf=new TextField();

		for(int i=0; i<b.length; i++)
		{
		 b[i]=new Button(value[i]);
		}
		tf.setBounds(15,50,350,50);
		int x=15,y=70,c=0;
		for(int i=0; i<b.length; i++)
		{
		 if(c%4==0)
			{
			x=15;
			y=y+60;
			}
		b[i].setBounds(x,y,85,50);
		x=x+90;
		c=c+1;
		}

		fr.add(tf);
		for(int i=0; i<b.length;i++)
		{
		fr.add(b[i]);
		}

		fr.setSize(400,400);
		fr.setVisible(true);
	
	}

	public static void main(String s[])
	{
	new calc();
	}

}