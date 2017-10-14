import java.util.*;
class treesettest
{public static void main(String s[])
{TreeSet ts=new TreeSet();
ts.add("ABC");
ts.add("XYZ");
ts.add("MNO");
ts.add("ABC");
ts.add("DEF");
ts.add("XYZ");
System.out.println("list of values: ");
for(Object ob:ts)
{System.out.println(ob);
}
}
}