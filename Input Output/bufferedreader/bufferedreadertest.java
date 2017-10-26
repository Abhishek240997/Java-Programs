import java.io.*;
class bufferedreadertest
{public static void main(String s[])
{try
{FileReader fr = new FileReader("abc.txt");
BufferedReader br = new BufferedReader(fr);
while(true)
{String str = br.readLine();
if(str==null)
break;
System.out.println(str);
}
br.close();
}
catch(Exception e)
{e.printStackTrace();
}
}
}