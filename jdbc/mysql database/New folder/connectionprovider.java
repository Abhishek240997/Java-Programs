import java.sql.*;
class connectionprovider
{private static Connection con;
static
{try
{Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","password1234");
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