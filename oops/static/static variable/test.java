class test
{int x;
static int y;
void m1(int val)
{x=val;
y=y+val;}
void show()
{System.out.println("X= "+x);
System.out.println("Y= "+y);
}
}
class demo
{public static void main(String s[])
{test t1,t2;
t1=new test();
t2=new test();
t1.m1(50);
t2.m1(60);
t1.show();
t2.show();
System.out.println("Y= "+t1.y);
}
}