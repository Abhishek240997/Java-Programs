import java.net.*;
import java.io.*;
class chatclient
{public static void main(String s[])
{try 
{System.out.println("client started");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the user name");
String name = br.readLine();
Socket sk = new Socket("localhost",1500);
System.out.println("connection established");
ReaderThread rt = new ReaderThread(sk);
rt.start();
DataOutputStream dout = new DataOutputStream(sk.getOutputStream());
System.out.println("Start to Enter the Messages,Enter 'stop' to terminate");
while(true)
{String str = br.readLine();
dout.writeUTF(name+":"+str);
{dout.writeUTF("stop");
dout.flush();
break;
}
}
}
catch(Exception e)
{e.printStackTrace();
}
}
}
class ReaderThread extends Thread
{Socket sk;
ReaderThread(Socket sk)
{this.sk = sk;
this.setDaemon(true);
}
public void run()
{try
{DataInputStream din = new DataInputStream(sk.getInputStream());
while(true)
{String msg = din.readUTF();
System.out.println(msg);
}
}
catch(Exception e)
{e.printStackTrace();
}
}
}