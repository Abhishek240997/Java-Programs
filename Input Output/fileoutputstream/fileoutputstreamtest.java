import java.io.*;
class fileoutputstreamtest
{public static void main(String s[])
{try
{String lines[] = {"This is the first line","This is the second line \n","This is the third line"};
FileOutputStream fout = new FileOutputStream("abc.txt");
int i = 0;
while(i<3)
{byte b[] = lines[i].getBytes();
fout.write(b);
fout.flush();
i++;
}
System.out.println("lines written into file succesfully");
fout.close();
}
catch(Exception e)
{e.printStackTrace();
}
}
}