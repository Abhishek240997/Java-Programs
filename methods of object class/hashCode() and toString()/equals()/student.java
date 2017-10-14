class student
{int rollno,marks;
void admission(int r)
{rollno=r;
System.out.println(rollno+"has registered");
}
void exam(int m)
{marks=m;
System.out.println(marks+"alloted to"+rollno);
}
void report()
{System.out.println("rollno: "+rollno);
System.out.println("marks: "+marks);
}
public int hashCode()
{return(marks);
}
public String toString()
{return(rollno+":"+marks);
}
}