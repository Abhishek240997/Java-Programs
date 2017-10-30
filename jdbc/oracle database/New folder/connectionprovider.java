import java.sql.*;
class connectionprovider
{private static Connection con;
static
{try
{Class.forName("oracle.jdbc.driver.OracleDriver");
con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","abhishek","abc123");
System.out.println("connection created");
}
catch(Exception e)
{e.printStackTrace();
}
}
static Connection get()
{return(con);
}
}