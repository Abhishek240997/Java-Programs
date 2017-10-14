class a
{void m1(float f)
{System.out.println("first m1 in the a");
}
void m1(double d)
{System.out.println("second m1 in the a");
}
static void check(a ref)
{ref.m1(5);
}
}
class b extends a
{void m1 (int x)
{System.out.println("m1 in the b");
}
}
class c extends a
{void m1(float ft)
{System.out.println("m1 in c");
}
}
class test
{public static void main(String s[])
{a.check(new b());
a.check(new c());
}
}