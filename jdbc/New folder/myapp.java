import java.sql.*;
class myapp
{public static void main(String s[]) throws Exception
{Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");
Statement st = con.createStatement();
ResultSet rs=st.executeQuery("select * from emp");
while(rs.next()){  
System.out.println(rs.getInt(1)+" "+rs.getString(2));  
}  
con.close();
}
}