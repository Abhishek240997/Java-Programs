class test
{private static test t;
private int x;
private test(int val)
{x=val;
System.out.println("object created");
}
void show()
{System.out.println("X= "+x);
}
static test m1(int val)
{if(t==null)
{t=new test(val);
}
return(t);
}
}
class demo
{public static void main(String s[])
{test t1,t2;
t1=test.m1(55);
t2=test.m1(66);
t1.show();
t2.show();
System.out.println(t1==t2);
}
}