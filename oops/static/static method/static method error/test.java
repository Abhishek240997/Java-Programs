class test
{
static int x;
int y;
static void m1(int val)
{x=50;
y=60;
show();
}
void show()
{System.out.println("y= "+y);
}
}
class demo
{public static void main(String s[])
{test t1,t2;
t1=new test();
t2=new test();
test.m1(50);
}
}