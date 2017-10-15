import java.io.*;
import java.net.*;
class msg
{public static void main(String s[])
{
try
{System.out.println("client started");
Socket sk = new Socket("localhost",1500);
System.out.println("connection established");
DataOutputStream dout = new DataOutputStream(sk.getOutputStream());
DataInputStream din = new DataInputStream(sk.getInputStream());
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
while(true)
{System.out.println("Enter the msg,enter 'stop' to terminate");
String str = br.readLine();
dout.writeUTF(str);
dout.flush();
if(str.equals("stop"))
break;
String msg = din.readUTF();
System.out.println(msg);
}
}
catch(Exception e)
{e.printStackTrace();
}
}
}