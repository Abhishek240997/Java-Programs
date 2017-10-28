import java.lang.reflect.*;
class student
{private int rollno,marks;
private student (int rollno)
{this.rollno = rollno;
System.out.println("student enrolled");
}
private void report()
{System.out.println("rollno: "+rollno);
System.out.println("marks:"+marks);
}
}
class accesstest2
{public static void main(String s[])
{try
{Class c = Class.forName("student");
Constructor ctr = c.getDeclaredConstructor(new Class[]{int.class});
ctr.setAccessible(true);
student st = (student)ctr.newInstance(new Object[]{101});
Field fd = c.getDeclaredField("marks");
fd.setAccessible(true);
fd.setInt(st,95);
Method m = c.getDeclaredMethod("report");
m.setAccessible(true);
m.invoke(st);
}
catch(Exception e)
{e.printStackTrace();
}
}
}