class digit
{public static void main(String s[])
{int a,b,r;
a=4321;
b=0;
while(a!=0)
{r=a%10;
b=r+b;
a=a/10;
}
System.out.println("the sum is"+b);
}
}