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
{System.out.println(e);
e.printStackTrace();
System.out.println(e.getMessage());
System.out.println("second value cannot be zero");
}
catch(ArrayIndexOutOfBoundsException e)
{System.out.println(e);
e.printStackTrace();
System.out.println(e.getMessage());
System.out.println("can not access the value from outside the bounds of array");
}
catch(NumberFormatException e)
{System.out.println(e);
e.printStackTrace();
System.out.println(e.getMessage());
System.out.println("invalid format of value");
}
System.out.println("thank you");
}
}