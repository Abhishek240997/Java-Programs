class test
{static student st;
static void m1()
{st=new student();
}
static void m2()
{st.admission(101);
st.exam(85);
st.report();
}
public static void main(String s[])
{m1();
m2();
}
}