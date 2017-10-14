class threadtest2
{public static void main(String s[])
{System.out.println("Main Method Started");
mythread th = new mythread();
th.start();
for(int i=1;i<=10;i++)
{System.out.println("Main: "+i);
}
System.out.println("Main is about to terminate");
}
}