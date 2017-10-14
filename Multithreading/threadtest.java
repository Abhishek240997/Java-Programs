class threadtest
{public static void main(String s[])
{System.out.println("main thread started");
Thread th = Thread.currentThread();//current thread reference id returned and stored in th
System.out.println("Thread Name: "+th.getName());
System.out.println("Thread priority: "+th.getPriority());
try
{System.out.println("Moving the thread into sleep");
Thread.sleep(5000);
}
catch(InterruptedException e)
{}
System.out.println("Thread is awakened");
System.out.println("changing the name and priority");
th.setName("My Main");
th.setPriority(Thread.MAX_PRIORITY);
System.out.println("New Name and priority");
System.out.println("Thread Name: "+th.getName());
System.out.println("Thread Priority: "+th.getPriority());
System.out.println(th);
}
}