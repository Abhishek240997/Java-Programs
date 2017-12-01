class test
{static void m1(int ...x)
{for(int i = 0;i<x.length;i++)
{System.out.println(x[i]);
}
}
public static void main(String s[])
{m1(4,5,6);
m1(2,3,4,5,6);
}
}