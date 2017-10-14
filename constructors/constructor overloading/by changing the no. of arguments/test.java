class area
{int x,y,z,res,type;
area(int x)
{this.x=x;
type=1;
}
area(int x,int y)
{this.x=x;
this.y=y;
type=2;
}
area(int x,int y,int z)
{this.x=x;
this.y=y;
this.z=z;
type=3;
}
void calc()
{if(type==1)
{res=x*x;
}
if(type==2)
{res=x*y;
}
if(type==3)
{int s=(x+y+z)/2;
res=(int)(Math.sqrt(s*(s-x)*(s-y)*(s-z)));
}
}
void show()
{if(type==1)
{System.out.println("area of square: "+res);
}
if(type==2)
{System.out.println("area of rectangle: "+res);
}
if(type==3)
{System.out.println("area of triangle: "+res);
}
}
}
class test
{public static void main(String s[])
{area sqr,rec,tri;
sqr=new area(5);
rec=new area(5,6);
tri=new area(5,6,7);
sqr.calc();
rec.calc();
tri.calc();
sqr.show();
rec.show();
tri.show();
}
}
