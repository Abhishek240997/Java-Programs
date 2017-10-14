class a
{int x,y;
void seta(int val)
{x=val;
y=val+100;
}
}
class b extends a
{int a,b;
void setb(int val)
{a=val;
b=val+200;
}
void show()
{System.out.println("a= "+a);
System.out.println("b= "+b);
System.out.println("x= "+x);
System.out.println("y= "+y);
}
}
class test
{public static void main(String s[])
{b ref=new b();
ref.setb(50);
ref.seta(100);
ref.show();
}
}