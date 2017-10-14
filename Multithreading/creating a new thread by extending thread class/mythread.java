class mythread extends Thread
{public void run()
{String name = getName();
System.out.println(name+"Thread Started");
for(int i=1;i<=10;i++)
{System.out.println("Hello"+i);
}
}
}