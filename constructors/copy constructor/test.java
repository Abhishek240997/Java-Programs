class test
{int x;
test(int x)
{this.x=x;
System.out.println("first object created");
}
test(test t)
{this.x=t.x;
System.out.println("second object created");
}
void show()
{System.out.println("X= "+x);
}
public static void main(String s[])
{test t1=new test(5);
test t2=new test(t1);
t1.show();
t2.show();
}
}