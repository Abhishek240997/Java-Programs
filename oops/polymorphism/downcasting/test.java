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
void m3()
{System.out.println("m3 in the b");
}
}
class downcast
{public static void main(String s[])
{a ref=new b();
ref.m1();
ref.m2();
b ref2=(b)ref;
ref2.m3();
}
}