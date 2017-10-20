import java.io.*;
class fileinputstreamtest2
{public static void main(String s[])
{try
{FileInputStream fin = new FileInputStream("abc.txt");
int size = fin.available();
byte b[] = new byte[size];
fin.read(b);
String str = new String(b);
System.out.println(str);
fin.close();
}
catch(FileNotFoundException e)
{e.printStackTrace();
}
catch(IOException e)
{e.printStackTrace();
}
}
}