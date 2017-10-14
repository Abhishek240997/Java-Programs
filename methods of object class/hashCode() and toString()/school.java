class school
{public static void main(String s[])
{student st;
st=new student();
st.admission(101);
st.exam(85);
st.report();
System.out.println(st);
System.out.println(st.hashCode());
System.out.println(st.toString());
}
}