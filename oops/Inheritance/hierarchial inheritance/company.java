class employee
{int code,tax,netsalary;
void set(int c)
{code=c;
}
void show()
{System.out.println("code= "+code);
System.out.println("tax= "+tax);
System.out.println("netsalary= "+netsalary);
}
}
class parttimeemp extends employee
{int rate,noh;
void set(int c,int r,int noh)
{set(c);
this.rate=r;
this.noh=noh;
}
void calc()
{tax=((noh*rate)*10)/100;
netsalary=noh*rate-tax;
}
void show()
{super.show();
System.out.println("no. of hours: "+noh);
System.out.println("rate per hour: "+rate);
}
}
class fulltimeemp extends employee
{int basic,hra,ta;
fulltimeemp(int c,int basic)
{this.set(c);
this.basic=basic;
}
void calc()
{hra=(basic*12)/100;
ta=(basic*10)/100;
tax=((basic+hra+ta)*12)/100;
netsalary=basic+hra+ta-tax;
}
void show()
{super.show();
System.out.println("basic: "+basic);
System.out.println("hra: "+hra);
System.out.println("ta: "+ta);
}
}
class company
{public static void main(String s[])
{parttimeemp pe=new parttimeemp();
fulltimeemp fe=new fulltimeemp(102,10000);
pe.set(101,100,150);
pe.calc();
fe.calc();
pe.show();
fe.show();
}
}