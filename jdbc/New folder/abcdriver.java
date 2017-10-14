package abc;
import mypack.mysql.*;
public class abcdriver implements mydriver
{static
{mymanager.d=new abcdriver();
}
public myconnection connect()
{return (new abcconnection());
}
}
