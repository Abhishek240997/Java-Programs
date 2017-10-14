class student
{String name,grade;
int marks;
student(String s)
{name=s;
}
void exam(int m)
{gradecalc(m);
}
private void gradecalc(int m)
{assert(m>=0):"marks must be>=0";
marks=m;
if(m>=80)
grade ="A";
else if(m>=60)
grade="B";
else
grade="C";
}
void show()
{System.out.println(name+" "+marks+" "+grade);
}
}
class asserttest
{public static void main(String s[])
{student st=new student("abc");
st.exam(-50);
st.show();
}
}