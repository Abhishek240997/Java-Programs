class commtest
{public static void main(String s[])
{int sum;
sum=0;
for(int i=0;i<s.length;i++)
{int x=Integer.parseInt(s[i]);
sum=sum+x;
}
System.out.println("sum= "+sum);
}
}