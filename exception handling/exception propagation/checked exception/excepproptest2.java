import java.io.IOException;
class excepproptest2
{public static void main(String s[])
{int x,y,z;
try
{x=Integer.parseInt(s[0]);
y=Integer.parseInt(s[1]);
z=calc(x,y);
System.out.println("result ="+z);
}
catch(IOException e)
{e.printStackTrace();
}
finally
{System.out.println("finally in mains");
}
System.out.println("thank you");
}
static int calc(int a,int b) throws IOException
{try
{System.out.println("welcome in calc");
int c;
if(b==0)
{
throw new IOException("second value cannot be zero");
}
c=a/b;
return(c);
}
finally
{System.out.println("finally in calc");
}
}
} 