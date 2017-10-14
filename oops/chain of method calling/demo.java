class demo
{static student m1()
{return(new student());
}
}
class  student
{int rollno,marks;
student admission(int r)
{rollno=r;
return(this);}
student exam(int m)
{marks=m;
return(this);
}
void report()
{System.out.println("rollno: "+rollno);
System.out.println("marks: "+marks);
}
}
class school
{public static void main(String s[])
{demo.m1().admission(101).exam(85).report();
}
}