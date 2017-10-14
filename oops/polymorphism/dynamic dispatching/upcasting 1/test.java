class a
{void m1()
{System.out.println("m1 in the a");
}
static void check(a ref)
{ref.m1();
}
}
class b extends a
{void m1()
{System.out.println("m1 in the b");
}
}
class c extends a
{void m1()
{System.out.println("m1 in the c");
}
}
class test
{public static void main(String s[])
{a.check(new b());
a.check(new c());
}
} 