class a
{a()
{System.out.println("constructor in a");
}
}
class b extends a
{b()
{}
}
class c extends b
{c()
{System.out.println("constructor in c");
}
public static void main(String s[])
{new c();
}
}