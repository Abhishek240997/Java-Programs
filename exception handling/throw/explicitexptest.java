class explicitexptest
{public static void main(String s[])
{int x,y,z;
x=Integer.parseInt(s[0]);
y=Integer.parseInt(s[1]);
if(y==0)
throw new ArithmeticException("second value cannot be zero");
z=x/y;
System.out.println("result= "+z);
}
}