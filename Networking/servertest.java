import java.net.*;
class servertest
{public static void main(String s[])
{try
{System.out.println("Server Started");
ServerSocket ss = new ServerSocket(1500);
System.out.println("waiting for the client request");
Socket sk = ss.accept();
System.out.println("client connected");
}
catch(Exception e)
{e.printStackTrace();
}
}
}