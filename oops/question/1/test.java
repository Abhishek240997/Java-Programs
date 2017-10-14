class test
{int x,y;
void set(int val)
{x=val;
y=val+50;
}
void change(int a)
{x-=a;
y-=a;
}
void show()
{System.out.println("X= "+x);
System.out.println("Y= "+y);
}
}
class demo
{public static void main(String s[])
{test t1,t2;
t1=new test();
t1.set(50);
t2=t1;
t2.change(60);
t2=new test();
t2.change(10);
t1.show();
t2.show();
}
}