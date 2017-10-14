class test
{static int x;
{System.out.println("object created");
}
static
{System.out.println("class loaded");
x=10;
}
static void m1()
{System.out.println("value of X: "+x);
}
}
class demo
{public static void main(String s[])
{new test();
new test();
test.m1();
}
}