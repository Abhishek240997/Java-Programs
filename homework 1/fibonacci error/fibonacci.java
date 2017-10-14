class fibonacci
{public static void main(String s[])
{int n,i;
int []a;
a=new int[5];
n=5;
a[0]=1;
a[1]=a[0];
System.out.print(a[0]);
System.out.print(a[1]);
for(i=2;i<n;i++)
{a[i]=a[i-1]+a[i-2];
System.out.print(a[i]);
}
}
}