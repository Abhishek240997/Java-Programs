import java.io.*;
class systeminputest
{public static void main(String s[])
{try
{FileOutputStream fout = new FileOutputStream("student.txt");
System.out.println("enter the name");
while(true)
{int x = System.in.read();
if(x==10)
break;
fout.write(x);
}
fout.close();
FileInputStream fin = new FileInputStream("student.txt");
byte b[] = new byte[fin.available()];
fin.read(b);
String str = new String(b);
System.out.println(str);
fin.close();
}
catch(Exception e)
{e.printStackTrace();
}
}
}