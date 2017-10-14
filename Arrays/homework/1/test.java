class test
{public static void main(String s[])
{int []a=new int[5];
for(int i=0;i<a.length;i++)
{a[i]=(int)(Math.random()*100);
System.out.println(a[i]);
}
demo.max(a);
demo.min(a);
}
}
class demo
{int x=0;
static int []b;
static int []c;
static void max(int []temp)
{b=temp;
for(int j=0;j<b.length;j++)
{if(b[0]<b[j])
{b[0]=b[j];
}
}
System.out.println("maximum value is "+b[0]);
}
static void min(int []temp1)
{c=temp1;
for(int k=0;k<c.length;k++)
{if(c[0]>c[k])
{c[0]=c[k];
}
}
System.out.println("minimum value is "+c[0]);
}
}