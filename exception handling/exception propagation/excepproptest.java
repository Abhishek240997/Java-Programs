class excepproptest
{public static void main(String s[])
{int x,y,z;
try
{x=Integer.parseInt(s[0]);
y=Integer.parseInt(s[1]);
z=calc(x,y);
System.out.println("result = "+z);
}
catch(ArithmeticException e)
{e.printStackTrace();
}
finally
{System.out.println("finally in main");
}
System.out.println("thank you");
}
static int calc(int a,int b)
{try
{System.out.println("welcome in calc");
int c;
c=a/b;
return(c);
}
finally
{System.out.println("finally in calc");
}
}
}