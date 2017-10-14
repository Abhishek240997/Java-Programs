class exptest
{public static void main(String s[])
{int x,y,z;
try
{x=Integer.parseInt(s[0]);
y=Integer.parseInt(s[1]);
z=x/y;
System.out.println("Result: "+z);
}
catch(Exception e)
{e.printStackTrace();
}
System.out.println("thank you");
}
}