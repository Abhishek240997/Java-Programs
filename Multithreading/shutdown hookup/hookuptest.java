class ShutdownHook extends Thread
{public void run()
{System.out.println("hookup thread started");
System.out.println("cleaning task can be performed here");
}
}
class hookuptest
{public static void main(String s[])
{System.out.println("main started");
ShutdownHook hk = new ShutdownHook();
Runtime r = Runtime.getRuntime();
r.addShutdownHook(hk);
System.out.println("main thread is about to finish");
}
}