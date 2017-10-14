class test 
{private int x;
private test(int val)
{x=val;
}
void show()
{System.out.println("X= "+x);
}
static test m1(int val)
{test t;
t=new test(val);
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
}
}