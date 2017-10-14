import java.util.Scanner;
class inputthread extends Thread
{private int[] data = new int[10];
inputthread(String name)
{super(name);
start();
}
public void run()
{Scanner sc = new Scanner(System.in);
System.out.println("Enter 10 values");
for(int i=0;i<data.length;i++)
{data[i] = sc.nextInt();
}
}
int[] getdata()
{return(data);
}
}
class interruptthread extends Thread
{Thread mainth;
interruptthread(Thread th)
{mainth = th;
start();
}
public void run()
{System.out.println("Interrupt Thread is going into sleep");
try
{Thread.sleep(20000);
}
catch(InterruptedException e)
{
}
mainth.interrupt();
}
}
class jointest
{public static void main(String s[])
{Thread th = Thread.currentThread();
interruptthread irth = new interruptthread(th);
inputthread ith = new inputthread("Reader");
System.out.println("Main is going to join the input thread");
try
{ith.join();
}
catch(InterruptedException e)
{e.printStackTrace();
}
int sum = 0;
int data[] = ith.getdata();
for(int i = 0;i<data.length;i++)
{sum = sum + data[i];
}
System.out.println("sum of values :"+sum);
}
}