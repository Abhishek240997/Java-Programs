import java.io.*;
class checkexptest
{public static void main(String s[]) throws IOException
{int x,y,z;
x=Integer.parseInt(s[0]);
y=Integer.parseInt(s[1]);
if(y==0)
throw new IOException("second value cannot be zero");
z=x/y;
System.out.println("Result = "+z);
System.out.println("thank you");
}
} 