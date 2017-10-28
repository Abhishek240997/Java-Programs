class a
{static
{System.out.println("a class loaded");
}
a()
{System.out.println("object of a class created");
}
}
class b
{static 
{System.out.println("b class loaded");
}
public static void main(String s[])
{a ref = new a();
Class c = ref.getClass();
System.out.println("loaded class name : "+c.getName());
//Object obj = c.newInstance();
}
}