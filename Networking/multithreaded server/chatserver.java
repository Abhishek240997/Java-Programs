import java.net.*;
import java.io.*;
class chatserver
{public static void main(String s[])
{try
{System.out.println("Server Started");
ServerSocket ss = new ServerSocket(1500);
Socket sk1 = ss.accept();
System.out.println("First client connected");
Socket sk2 = ss.accept();
System.out.println("Second client connected");
new ClientThread(sk1,sk2);
new ClientThread(sk2,sk1);
}
catch(Exception e)
{e.printStackTrace();
}
}
}
class ClientThread extends Thread
{Socket sender,receiver;
ClientThread(Socket sender,Socket receiver)
{this.sender = sender;
this.receiver = receiver;
start();
}
public void run()
{try
{DataInputStream din = new DataInputStream(sender.getInputStream());
DataOutputStream dout = new DataOutputStream(receiver.getOutputStream());
while(true)
{String msg = din.readUTF();
if(msg.equals("stop"))
{dout.writeUTF("Another client get closed");
dout.writeUTF(msg);
break;
}
dout.writeUTF(msg);
dout.flush();
}
}
catch(Exception e)
{e.printStackTrace();
}
}
} 