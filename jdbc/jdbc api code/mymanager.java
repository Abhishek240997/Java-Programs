package mypack.mysql;
public class mymanager
{public static mydriver d;
public static myconnection getcon()
{myconnection con=d.connect();
return(con);
}
}