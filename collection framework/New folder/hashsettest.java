import java.util.*;
class hashsettest
{public static void main(String s[])
{HashSet hs=new HashSet();
hs.add("ABC");
hs.add("XYZ");
hs.add("MNO");
hs.add("ABC");
hs.add("DEF");
hs.add("XYZ");
System.out.println("list of values: ");
for(Object ob:hs)
{System.out.println(ob);
}
}
}