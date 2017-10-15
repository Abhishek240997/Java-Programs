import java.net.*;
import java.io.*;
class servermsg
{public static void main(String s[])
{System.out.println("server started");
try
{ServerSocket ss = new ServerSocket(1500);
System.out.println("waiting for the client request....");
Socket sk = ss.accept();
System.out.println("client connected");
DataInputStream din = new DataInputStream(sk.getInputStream());
DataOutputStream dout = new DataOutputStream(sk.getOutputStream());
while(true)
{String str = din.readUTF();
System.out.println("client msg : "+str);
try
{Thread.sleep(5000);
}
catch(InterruptedException e)
{str = str.toUpperCase();
dout.writeUTF(str);
dout.flush();
if(str.equalsIgnoreCase("stop"))
break;
}
}
}
catch(Exception e)
{e.printStackTrace();
}
}
}