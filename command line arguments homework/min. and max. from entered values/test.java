class test
{public static void main(String s[])
{int y=0,z=0;
for(int i=1;i<s.length;i++)
{int x=Integer.parseInt(s[i]);
y=Integer.parseInt(s[0]);
z=y;
if(y<x)
{y=x;}
if(z>x)
{z=x;}
}
System.out.println("maximum value is "+y);
System.out.println("minimum value is "+z);
}
}