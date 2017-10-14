class test
{public static void main(String s[])
{int []a=new int[5];
for(int i=0;i<a.length;i++)
{a[i]=(int)(Math.random()*100);
System.out.println(a[i]);
}
int b[]={11,22};
a=arrayutil.append(a,b);
System.out.println("array after concatenation"); 
for(int k=0;k<(a.length+b.length);k++)
{System.out.println(a[k]);
}
}
}
class arrayutil
{static int[] append(int[]a1,int[]a2)
{int temp[]=new int[a1.length+a2.length];
int i=0;
while(i<a1.length)
{temp[i]=a1[i];
i++;
}
int j=0;
while(j<a2.length)
{temp[i]=a2[j];
i++;
j++;
}
return(temp);
}
}