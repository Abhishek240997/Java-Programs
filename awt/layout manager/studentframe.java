import java.awt.*;
class student frame
{frame fr;
Label lb1,lb2;
Button b1;
Textfield tf1,tf2;
student frame()
{fr=new Frame();
fr.setLayout(null);
lb1=new Label("name");
lb2=new Label("rollno");
b1=new Button("submit");
tf1=new TextField();
tf2=new TextField();
lb1.setBounds(30,50,100,50);
tf1.setBounds(150,50,100,50);
lb2.setBounds(30,120,100,50);
tf2.setBounds(150,120,100,50);
b1.setBounds(100,190,100,50);
fr.add(lb1);
fr.add(lb2);
fr.add(tf1);
fr.add(tf2);
fr.add(b1);
fr.setSize(400,400);
fr.setVisible(true);
}
public static void main(String s[])
{new student Frame();
}
}