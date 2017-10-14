class product
{int code,price;
int qty;
void set(int c,int p,int q)
{code=c;
price=p;
qty=q;
}
void report()
{System.out.println("\ncode: "+code);
System.out.println("\nprice: "+price);
System.out.println("\nqty: "+qty);
}
void sales(int unit,customer c)
{if(qty>=unit)
System.out.println(code+"product sold to "+c.cid+"customer");
else
{System.out.println("insufficient quantity");
}
}
}
class customer
{int cid;
product p;
void setdetails(int cid,product p)
{this.cid=cid;
this.p=p;
}
void dosales(int unit)
{p.sales(unit,this);
}
void show()
{System.out.println("\n customer id: "+cid);
p.report();
}
}
class market
{static product p1;
static product p2;
static void set(int pnumber,int code,int price,int qty)
{if(pnumber==1)
{p1=new product();
p1.set(code,price,qty);
}
if(pnumber==2)
{p2=new product();
p2.set(code,price,qty);
}
}
}
class test
{public static void main(String s[])
{customer c1,c2;
c1=new customer();
c2=new customer();
market.set(1,111,1500,100);
market.set(2,222,3000,200);
c1.setdetails(101,market.p1);
c2.setdetails(102,market.p2);
c1.dosales(60);
c2.dosales(100);
c1.show();
c2.show();
}
}