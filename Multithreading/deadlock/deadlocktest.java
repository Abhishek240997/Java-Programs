class resource
{int sum;
synchronized void sumcalc()
{String tname = Thread.currentThread().getName();
for(int i = 1;i<=10;i++)
{int x = (int)(Math.random()*100);
sum = sum+x;
}
System.out.println("Sum of"+tname+"="+sum);
if(tname.equals("user1"))
{System.out.println("try to get the sum of user 2, may be in deadlock....");
int othersum = myfactory.r2.getsum();
System.out.println("total sum in user1 :"+(sum+othersum));
}
if(tname.equals("user2"))
{System.out.println("try to get the sum of user1, may by in deadlock.... ");
int othersum = myfactory.r1.getsum();
System.out.println("Totl sum in user2 :"+(sum+othersum));
}
}
synchronized int getsum()
{return(sum);
}
}
class myfactory
{static resource r1,r2;
static
{r1 = new resource();
r2 = new resource(); 
}
}
class mythread extends Thread
{mythread(String name)
{super(name);
start();
}
public void run()
{if(this.getName().equals("user1"))
myfactory.r1.sumcalc();
if(this.getName().equals("user2"))
myfactory.r2.sumcalc();
}
}
class deadlocktest
{public static void main(String s[])
{new mythread("user1");
new mythread("user2");
}
}