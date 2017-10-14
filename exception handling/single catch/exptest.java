class exptest
{public static void main(String s[])
{int x,y,z;
try
{x=Integer.parseInt(s[0]);
y=Integer.parseInt(s[1]);
z=x/y;
System.out.println("result: "+z);
}
catch(ArithmeticException e)
{System.out.println("second value cannot be zero");
}
System.out.println("thank you");
}
}