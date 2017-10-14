import p1exp.invalidmarksexception;
class school
{public static void main(String s[])
{student st=new student(101);
int x=Integer.parseInt(s[0]);
try
{st.exam(x);
st.report();
}
catch(invalidmarksexception e)
{e.printStackTrace();
}
}
}