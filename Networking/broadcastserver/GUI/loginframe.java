import java.awt.*;
class loginframe
{Frame fr;
Label lb1;
Button b1;
TextField tf1;
loginframe()
{fr = new Frame();
fr.setLayout(null);
lb1 = new Label("Enter UserName");
b1 = new Button("Login");
tf1 = new TextField();
lb1.setBounds(60,100,200,100);
b1.setBounds(200,380,200,100);
tf1.setBounds(300,100,200,100);
fr.add(lb1);
fr.add(b1);
fr.add(tf1);
fr.setSize(800,800);
lb1.setSize(200,200);
fr.setVisible(true);
}
public static void main(String s[])
{new loginframe();
}
}