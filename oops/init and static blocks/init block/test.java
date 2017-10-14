class test
{int x;
{System.out.println("first init block");
}
test()
{System.out.println("constructor invoked");
x=10;
}
{System.out.println("init block invoked");
x=20;
}
void show()
{System.out.println("X= "+x);
}
public static void main(String s[])
{test t=new test();
t.show();
}
}