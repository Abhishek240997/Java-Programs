class a
{Animal m1()
{System.out.println("m1 in a");
return(new Animal());
}
}
class b extends a
{Cat m1()
{System.out.println("m1 in b");
return(new Cat());
}
}
class test
{static void check(a ref)
{Animal al = ref.m1();
}
}
class mymain
{public static void main(String s[])
{test.check(new Cat());
test.check(new Animal());
}
}