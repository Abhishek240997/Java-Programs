class a
{void m1()
{System.out.println("m1 in the a");
}
}
class b extends a
{void m1()
{super.m1();
System.out.println("m1 in the b");
}
}
class c extends b
{void m1()
{super.m1();
System.out.println("m1 in the c");
//((a)this).m1();
}
}
class test
{public static void main(String s[])
{a ref=new c();
ref.m1();
}
}