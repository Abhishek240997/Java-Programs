import java.lang.reflect.*;
class myjavap
{public static void main(String s[])
{try
{Class c = Class.forName(s[0]);
System.out.println(c.getName()+"class loaded");
Class intr[] = c.getInterfaces();
System.out.println("list of implemented interfaces");
for(int i=0;i<intr.length;i++)
{System.out.println(intr[i]);
Class parent = c.getSuperclass();
System.out.println("parent classname"+parent);
}
Field f[] = c.getFields();
System.out.println("\n list of fields:");
for(Field fd:f)
{System.out.println(fd);
}
Constructor ctr[] = c.getConstructors();
System.out.println("\n list of constructors:");
for(Constructor ct:ctr)
{System.out.println(ct);
}
Method mth[] = c.getDeclaredMethods();
System.out.println("\nlist of methods:");
for(Method m:mth)
{System.out.println(m);
}
}
catch(Exception e)
{e.printStackTrace();
}
}
}