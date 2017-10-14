class threadtest
{public static void main(String s[])
{System.out.println("main method started");
myrunnable r= new myrunnable();
Thread th = new Thread(r);
th.start();
for(int i=1;i<=10;i++)
{System.out.println("Main:"+i);
}
System.out.println("Main is about to terminated");
}
}