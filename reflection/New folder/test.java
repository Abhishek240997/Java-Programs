class test
{static void m1(animal a)
{if(a.getClass().getName().equals("dog"))
{System.out.println("This is the dog instance");
}
if(a.getClass().getName().equals("cat"))
{System.out.println("this is the cat instance");
}
}
/*Class c = a.getClass();
String name = c.getName();
if(name.equals("dog"))
{System.out.println("this is dog instance");
}
if(name.equals("cat"))
{System.out.printlnl("this is cat instance");
}*/
public static void main(String s[])
{m1(new dog());
m1(new cat());
}
}