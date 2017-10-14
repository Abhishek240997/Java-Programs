import p1exp.invalidmarksexception;
class student
{int rollno,marks;
student(int rollno)
{this.rollno=rollno;
}
void exam(int marks)throws invalidmarksexception
{if(marks<0||marks>100)
{throw new invalidmarksexception("marks should be within 0-100");
}
this.marks=marks;
}
void report()
{System.out.println("rollno : "+rollno);
System.out.println("marks : "+marks);
}
}