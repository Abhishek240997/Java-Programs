class test
{public static void main(String s[])
{employee t1,t2,t3;
t1=new employee();
t2=new employee();
t3=new employee();
t1.join(101,15000);
t2.join(102,20000);
t3.join(103,30000);
t1.calc();
t2.calc();
t3.calc();
t1.show();
t2.show();
t3.show();
}
}