import java.util.*;
class arraylisttest
{public static void main(String s[])
{ArrayList al=new ArrayList();
student std=new student(101,85,"ABC");
al.add(std);
al.add(new student(102,75,"XYZ"));
al.add(new student(103,65,"MNO"));
al.add(new student(104,90,"ABC"));
al.add(new student(105,100,"DEF"));
System.out.println("list of values :");
for(Object ob:al)
{System.out.println(ob);
}
System.out.println("contains 101 85 ABC "+al.contains(std));
System.out.println("contains 101 85 ABC "+al.contains(new student(101,85,"ABC")));
System.out.println("remove 102 75 DEF: "+al.remove(new student(102,75,"XYZ")));
}
}
