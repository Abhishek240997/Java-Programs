import java.net.*;
import java.io.*;
import java.util.*;
class chatclienttest
{public static void main(String s[]) throws Exception
{System.out.println("client started");
System.out.println("enter ip address of the server");
Scanner sc = new Scanner(System.in);
String ip = sc.nextLine();
Socket sk = new Socket(ip,1500);
System.out.println("connection established");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter name");
String name = br.readLine();
DataOutputStream dout = new DataOutputStream(sk.getOutputStream());
dout.writeUTF("login#"+name);
dout.flush();
new readerthread(sk);
System.out.println("start to enter the msgs, enter 'stop' to terminate");
while(true)
{String msg = br.readLine();
if(msg.equalsIgnoreCase("stop"))
{dout.writeUTF("logout#"+name);
dout.flush();
break;
}
msg = "message#"+name+":"+msg;
dout.writeUTF(msg);
dout.flush();
}
}
}
class readerthread extends Thread
{Socket sk;
readerthread(Socket sk)
{this.sk = sk;
setDaemon(true);
start();
}
public void run()
{try
{while(true)
{DataInputStream din = new DataInputStream(sk.getInputStream());
String msg = din.readUTF();
System.out.println(msg);
}
}
catch(Exception e)
{e.printStackTrace();
}
}
}