import java.sql.*;
class dbtest
{public static void main(String s[])
{try
{Connection con = connectionprovider.get();
System.out.println("connection obtained");
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("select * from employees");
while(rs.next())
{System.out.println("\t"+rs.getInt(1));
System.out.println("\t"+rs.getInt(2));
System.out.println("\t"+rs.getString(3));
System.out.println("\t"+rs.getString(4));
}
con.close();
}
catch(Exception e)
{e.printStackTrace();
}
}
}