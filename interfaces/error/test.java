interface i1
{void showdata();
}
class test implements i1
{int x,y;
void setdata(int val1,int val2)
{x=val1;
y=val2;
}
public void showdata()
{System.out.println("X= "+x);
System.out.println("Y= "+y);
}
static void invoker(i1 ref)
{System.out.println("values: "+ref);//ref calls the toString which has been overridden from object class
}
public String toString()
{return(x+":"+y);
}
}
class demo
{public static void main(String s[])
{test t=new test();
t.setdata(55,66);
t.invoker(t);
}
}
