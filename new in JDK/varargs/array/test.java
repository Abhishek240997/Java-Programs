class test
{static void m1(int[] ...x)
{
for(int[] i:x)
{for(int j:i)
{
System.out.println(j);
}
}
}
public static void main(String s[])
{int a[] = {3,4,5,6,7};
int b[] = {2,3,4,5};
int c[] = {5,6,7,8,2,1};
m1(a,b,c);
}
}