class resource
{int key;
boolean b;
void login()
{String nm = Thread.currentThread().getName();
System.out.println(nm+"is starting login");
synchronized(this)
{
try
{if(!b)
{System.out.println(nm+"is going into waiting section....");
wait();}
System.out.println(nm+"gets logged in with"+key+"key");
}
catch(Exception e)
{e.printStackTrace();
}
}
}
synchronized void keygen()
{key = (int)(Math.random()*100);
System.out.println(key+"key generated");
b = true;
notifyAll();
}
}
class mythread extends Thread
{resource r;
mythread(resource r,String nm)
{super(nm);
this.r = r;
start();
}
public void run()
{String name = getName();
if(name.equals("admin"))
r.keygen();
else
r.login();
}
}
class notifyalltest
{public static void main(String s[])
{resource r=new resource();
new mythread(r,"user1");
new mythread(r,"user2");
new mythread(r,"user3");
new mythread(r,"admin");
new mythread(r,"user4");
}
}