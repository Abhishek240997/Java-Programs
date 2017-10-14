class employee
{double basicsalary,tax,da,ta,hra,netsalary;
int code;
void join(int c,int b)
{code = c;
basicsalary = b;
}
void calc()
{ta=0.05*basicsalary;
da=0.06*basicsalary;
hra=0.1*basicsalary;
tax=(basicsalary+ta+hra)*0.1;
netsalary=(basicsalary+da+ta+hra)-tax;
}
void show()
{System.out.println(code+"tax is "+tax);
System.out.println(code+"net salary is "+netsalary);
}
}
