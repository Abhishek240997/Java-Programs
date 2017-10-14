class mythread extends Thread
{int time;
mythread(ThreadGroup tg,String name,int t)
{super(tg,name);
this.time = t;
start();
}
public void run()
{String name = getName();
System.out.println(name+"thread started");
try
{System.out.println(name+"thread is going into sleep");
sleep(time*1000);
}
catch(InterruptedException e)
{System.out.println(name+"thread gets interrupted");
}
}
}
class threadgrouptest
{public static void main(String s[])
{mythread mth1,mth2,mth3;
ThreadGroup group = new ThreadGroup("test group");
mth1 = new mythread(group,"lazy1",3);
mth2 = new mythread(group,"lazy2",5);
mth3 = new mythread(group,"lazy3",7);
try
{Thread.sleep(1000);
}
catch(Exception e)
{System.out.println("main is awakened and interrupting the member threads ...");
group.interrupt();
}
}
}