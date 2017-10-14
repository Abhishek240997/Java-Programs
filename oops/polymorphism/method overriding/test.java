class a
{void m1()
{System.out.println("m1 in the a");
}
}
class b extends a
{void m1()
{System.out.println("m1 in the b");
}
public static void main(String s[])
{b ref=new b();
ref.m1();
}
}