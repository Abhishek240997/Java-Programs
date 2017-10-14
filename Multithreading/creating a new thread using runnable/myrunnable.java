class myrunnable implements Runnable
{public void run()
{Thread th= Thread.currentThread();
String name = th.getName();
System.out.println(name+"Thread Started");
for(int i=1;i<=10;i++)
{System.out.println("Hello "+i);
}
}
}