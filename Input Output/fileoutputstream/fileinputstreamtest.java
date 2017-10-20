import java.io.*;
class fileinputstreamtest
{public static void main(String s[])
{try
{FileInputStream fin = new FileInputStream("abc.txt");
while(true)
{int x = fin.read();
if(x==-1)
break;
System.out.println((char)x);
}
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