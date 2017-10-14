class test
{static int x;
int y;
static void m1(test t)
{t.y=100;
test t2=new test();
t2.y=t.y;
x=t.y+t2.y;
}
void show()
{System.out.println("Y= "+y);
System.out.println("X= "+x);
}
}
class demo
{public static void main(String s[])
{test t1,t2;
t1=new test();
t2=new test();
test.m1(t1);
test.m1(t2);
t1.show();
t2.show();
System.out.println("X= "+test.x);
}
}