class test
{int x;
test(int val)
{System.out.println("object created");
x=val;
System.out.println("reference id is "+this);
}
void show()
{System.out.println("X= "+x);
}
}
class demo
{public static void main(String s[])
{test t1,t2;
t1=new test(5);
t1.show();
}
}