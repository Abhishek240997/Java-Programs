class prime
{public static void main(String s[])
{int a,n;
n=13;
for(a=2;a<=n/2;a++)
{if(n%a==0)
{System.out.println("number is not prime");
break;}
else
{System.out.println("number is prime");
break;}
}
}
}