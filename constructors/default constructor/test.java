class test
{int x;
test()
{System.out.println("object created");
x=20;
System.out.println("reference id is "+this);
}
void show()
{System.out.println("X= "+x);
}
}
class demo
{public static void main(String s[])
{test t1,t2;
t1=new test();
t2=new test();
t1.show();
t2.show();
}
}