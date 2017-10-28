class b
{static
{System.out.println("b class loaded");
}
public static void main(String s[])
{try
{Class c = Class.forName(s[0]);
System.out.println("loaded class name: "+c.getName());
Object ref = c.newInstance();
}
catch(Exception e)
{e.printStackTrace();
}
}
}
