class test
{public static void main(String s[])
{int a=0,b,c=0;
b=s.length-1;
for(int i=0;i<s.length;i++)
{int x=Integer.parseInt(s[i]);
int y=Integer.parseInt(s[0]);
int z=Integer.parseInt(s[b]);
if(y==x)
{a=a+1;}
if(z==x)
{c=c+1;}
}
System.out.println(s[0]+"has frequency"+a);
System.out.println(s[b]+"has frequency"+c);
}
}

