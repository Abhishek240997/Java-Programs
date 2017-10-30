import java.sql.*;
class dbupdatetest
{public static void main(String s[])
{try
{Connection con = connectionprovider.get();
System.out.println("connection obtained");
Statement st = con.createStatement();
int x = st.executeUpdate("update employees set age=21 where first='Abhishek'");
if(x>=1)
{System.out.println("record updated succesfully");
}
else
{System.out.println("record could not be found");
}
con.close();
}
catch(Exception e)
{e.printStackTrace();
}
}
}