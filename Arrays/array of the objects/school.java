class school
{public static void main(String s[])
{student []st=new student[5];
for(int i=0;i<st.length;i++)
{st[i]=new student();
st[i].admission(101+i);
int marks=(int)(Math.random()*100);
st[i].exam(marks);
System.out.println(st);
}
}
}