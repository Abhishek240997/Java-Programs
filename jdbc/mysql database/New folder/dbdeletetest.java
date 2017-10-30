import java.sql.*;
class dbdeletetest
{public static void main(String s[])
{try
{Connection con = connectionprovider.get();
System.out.println("connection obtained");
Statement st = con.createStatement();
int x = st.executeUpdate("delete from employees where id=104");
if(x>=1)
{System.out.println("record deleted succesfully");
}
else
{System.out.println("record could not be deleted");
}
con.close();
}
catch(Exception e)
{e.printStackTrace();
}
}
}