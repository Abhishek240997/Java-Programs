import java.net.*;
import java.io.*;
class clienttest
{public static void main(String s[])
{try
{System.out.println("client started");
System.out.println("sending the connection request");
Socket sc = new Socket("local host",1500);
System.out.println("connection established");
}
catch(UnknownHostException e)
{e.printStackTrace();
}
catch(IOException e)
{e.printStackTrace();
}
}
}