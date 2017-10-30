import java.sql.*;
class dbinserttest
{
public static void main(String s[])
{try
{Connection con = connectionprovider.get();
System.out.println("connection obtained");
Statement st = con.createStatement();
int x = st.executeUpdate("insert into employees values (104,20,'Abhishek','Mishra')");
if(x==1)
{System.out.println("record inserted succesfully");
}
else
{System.out.println("record could not be inserted");
}
con.close();
}
catch(Exception e)
{e.printStackTrace();
}
}
}