import mypack.mysql.*;
class myapp
{public static void main(String s[]) throws Exception
{Class.forName("abc.abcdriver");
myconnection con = mymanager.getcon();
System.out.println("connection object prepared");
mystatement st = con.createstate();
System.out.println("statement object prepared");
System.out.println(st.m1());
}
}