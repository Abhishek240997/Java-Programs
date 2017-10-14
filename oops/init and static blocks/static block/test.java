class test
{static int x;
static
{System.out.println("class loaded");
x=10;
}
static void m1()
{System.out.println("value of X: "+x);
}
public static void main(String s[])
{test.m1();
}
}