class a
{static void m1()
{System.out.println("m1 in the a");
}
}
class b extends a
{/*static
{System.out.println("B class loaded");
}*/
static void m1(){
System.out.println("m1 in the b");
}
}
class test
{public static void main(String s[])
{a.m1();                                                     
}
}