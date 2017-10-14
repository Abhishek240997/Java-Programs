class test
{student st;
void m1()
{st=new student();
}
void m2()
{st.admission(101);
st.exam(85);
st.report();
}
public static void main(String s[])
{test t;
t=new test();
t.m1();
t.m2();
}
}
