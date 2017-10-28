import java.sql.*;
class dbtest
{public static void main(String s[])
{try
{Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","abhis","password1234");
System.out.println("connection created");
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
catch(ClassNotFoundException e)
{e.printStackTrace();
}
catch(SQLException e)
{e.printStackTrace();
}
}
}