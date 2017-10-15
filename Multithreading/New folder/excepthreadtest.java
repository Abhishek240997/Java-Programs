class mythread extends Thread
{int x,y;
mythread(int x,int y)
{this.x = x;
this.y = y;
start();
}
public void run()
{String name = Thread.currentThread().getName();
System.out.println(name+"started");
int z = x/y;
System.out.println("Result calculated in "+name);
try{Thread.sleep(5000);}
catch(InterruptedException e)
{e.printStackTrace();}
System.out.println("Result = "+z+"in"+name);
}
}
class excepthreadtest
{public static void main(String s[])
{new mythread(4,2);
new mythread(4,0);
try{Thread.sleep(3000);}
catch(Exception e)
{}
System.out.println("main is about to terminate");
}
}