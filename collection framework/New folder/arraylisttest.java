import java.util.*;
class arraylisttest
{public static void main(String s[])
{ArrayList al=new ArrayList();
al.add("ABC");
al.add("XYZ");
al.add("MNO");
al.add("ABC");
al.add("DEF");
al.add("XYZ");
System.out.println("list of values: ");
for(Object ob:al)
{System.out.println(ob);
}
System.out.println("contains MNO: "+al.contains("MNO"));
System.out.println("remove DEF: "+al.remove("DEF"));
System.out.println("index of XYZ: "+al.indexOf("XYZ"));
System.out.println("last index of XYZ: "+al.lastIndexOf("XYZ"));
}
}