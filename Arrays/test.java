class test
{public static void main(String s[])
{int []a;
a=new int[5];
System.out.println(a);
System.out.println("list of default values: ");
for(int i=0;i<a.length;i++)
{System.out.println(a[i]);
}
for(int i=0;i<a.length;i++)
{a[i]=(int)(Math.random()*100);
}
System.out.println("\n list of values");
for(int i=0;i<a.length;i++)
{System.out.println(a[i]);
}
}
}