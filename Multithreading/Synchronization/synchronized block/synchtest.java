class resource
{int data[] = {1,2,3,4,5,6,7,8,9,10};
void update()
{System.out.println("I'm in update");
synchronized(this)
{
for(int i=0;i<=9;i++)
{data[i]+=10;
System.out.println("updated value :"+data[i]);
}
}
}
void display()
{System.out.println("I'm in display");
synchronized(this)
{
for(int i=9;i>=0;i--)
{System.out.println("value :"+data[i]);
}
}
}
}
class mythread extends Thread
{resource r;
mythread(String name,resource r)
{super(name);
this.r = r;
start();
}
public void run()
{String nm = getName();
synchronized(r)
{
if(nm.equals("first"))
r.update();
if(nm.equals("second"))
r.display();
}
}
}
class synchtest
{public static void main(String s[])
{resource r= new resource();
new mythread("first",r);
new mythread("second",r);
}
}