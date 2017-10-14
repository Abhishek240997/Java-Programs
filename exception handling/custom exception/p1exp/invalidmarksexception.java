package p1exp;
public class invalidmarksexception extends Exception
{String msg;
public invalidmarksexception()
{msg= " ";
}
public invalidmarksexception(String msg)
{this.msg=msg;
}
public String toString()
{return("invalid marks exception: "+msg);
}
}