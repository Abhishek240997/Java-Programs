class test
{static void m1(int ...x)
{System.out.println("first m1");
}
static void m1(int x)
{System.out.println("second m1");
}
public static void main(String s[])
{m1(5);
}
}