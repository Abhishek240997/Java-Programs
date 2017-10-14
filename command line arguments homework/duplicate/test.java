class test
{public static void main(String s[])
{int a=0;
for(int i=0;i<s.length-1;i++)
{for(int j=i+1;j<s.length;j++)
{int x=Integer.parseInt(s[i]);
int y=Integer.parseInt(s[j]);
if(x==y)
{a=1;}
}
}
if(a==1)
System.out.println("duplicate number is present");
else
System.out.println("duplicate number is not present");
}
}







