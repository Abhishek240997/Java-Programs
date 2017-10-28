package abc;
import mypack.mysql.*;
public class abcconnection implements myconnection
{public mystatement createstate()
{return (new abcstatement());
}
}