class a
{void m1()
{System.out.println("m1 in the a");
}
void m2()
{System.out.println("m2 in the a");
}
}
class b extends a
{void m1()
{System.out.println("m1 in the b");
}
static void m3()
{System.out.println("m3 in the b");
}
}
class c extends a
{void m1()
{System.out.println("m1 in c");
}
}
class demo
{static void check(a ref)
{ref.m1();
ref.m2();
if(ref instanceof b)
{b refb=(b)ref;
b.m3();
System.out.println(ref instanceof c);
System.out.println(ref instanceof b);
System.out.println(ref instanceof a);
}
}
}
class downcasttest
{public static void main(String s[])
{demo.check(new b());
demo.check(new c());
}
}