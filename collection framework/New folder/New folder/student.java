class student
{String name;
int rollno,marks;
student(int rollno,int marks,String name)
{this.rollno=rollno;
this.marks=marks;
this.name=name;
}
public String tostring()
{return(marks+":"+rollno+":"+name);
}
}