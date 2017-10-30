import java.net.*;
import java.util.*;
import java.io.*;
class broadcastservertest
{static ArrayList sockets;
public static void main(String s[]) 
{try
{sockets = new ArrayList();
ServerSocket ss = new ServerSocket(1500);
System.out.println("server started");
//System.out.println("enter 'stop' to stop the server");
while(true)
{System.out.println("waiting for client request");
Socket client = ss.accept();
sockets.add(client);
new clientthread(client);
/*Scanner sc = new Scanner(System.in);
String text = sc.nextLine();
if(text.equalsIgnoreCase("stop"))
break;*/
}
}
catch(Exception e)
{e.printStackTrace();
}
}
}
class clientthread extends Thread
{Socket client;
clientthread(Socket client)
{this.client = client;
start();
}
public void run()
{try
{DataInputStream din = new DataInputStream(client.getInputStream());
while(true)
{String msg = din.readUTF();
String tokens[] = msg.split("#");
if(tokens[0].equals("login"))
{msg = tokens[1]+"loggedin";
}
else if(tokens[0].equals("logout"))
{msg = tokens[1]+"loggedout";
}
else
{msg = tokens[1];
}
broadcast(msg);
if(tokens[0].equals("logout"))
{broadcastservertest.sockets.remove(client);
break;
}
}
}
catch(Exception e)
{e.printStackTrace();
}
}
void broadcast(String msg)
{try
{for(Object ob:broadcastservertest.sockets)
{Socket client = (Socket)ob;
DataOutputStream dout = new DataOutputStream(client.getOutputStream());
dout.writeUTF(msg);
dout.flush();
}
}
catch(Exception e)
{e.printStackTrace();
}
}
}
