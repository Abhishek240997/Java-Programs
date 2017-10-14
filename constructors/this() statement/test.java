class a
{a()
{System.out.println("default constructor of a");
}
a(int x)
{this();
System.out.println("parametric constructor of a");
}
}
class b extends a
{b()
{super(5);
System.out.println("default constructor of b");
}
b(int x)
{this();
System.out.println("parametric constructor of b");
}
}
class c extends b
{c()
{super (5);
System.out.println("default constructor of c");
}
c(int x)
{System.out.println("parametric constructor of c");
}
public static void main(String s[])
{new c();
new c(5);
}
}