interface testable
{int x=5;
void m1();
void m2();
}
class test implements testable
{public void m1()
{System.out.println("m1 in the test");
}
public void m2()
{System.out.println("m2 in the test");
}
static void m3()
{System.out.println("m3 in the test: "+x);
}
}
class demo
{public static void main(String s[])
{testable t;
t=new test();
t.m1();
t.m2();
//t.m3();
test.m3();
System.out.println(+test.x);
}
}
 