class test 
{static int x;
synchronized static void m1()
{String th = Thread.currentThread().getName();
System.out.println("m1  called in "+th);
for(int i=1;i<=10;i++)
{int temp=(int)(Math.random()*100);
System.out.println(temp+" value in "+th);
x = x+temp;
}
System.out.println("Sum="+x);
}
}
class mythread extends Thread
{mythread()
{start();}
public void run()
{test.m1();
}
}
class staticsync
{static test t;
public static void main(String s[])
{t = new test();
new mythread();
new mythread();
} 
}