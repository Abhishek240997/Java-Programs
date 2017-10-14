class test
{public static void main(String s[])
{int a,sum=0;
for(int i=0;i<s.length-1;i++)
{int x=Integer.parseInt(s[i]);
int y=Integer.parseInt(s[i+1]);
a=x-y;
sum=sum+a;
}
System.out.println("the sum of difference of each consecutive value is"+sum);
}
}