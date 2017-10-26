import java.io.*;
class systeminputtest
{public static void main(String s[])
{try
{BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
FileOutputStream fout = new FileOutputStream("Student.txt");
while(true)
{System.out.println("Enter the name, rollno., marks and grade (separated with space)");
String str = br.readLine();
str = str + "\n";
fout.write(str.getBytes());
System.out.println("do you want to store more record (Y/N)");
String option = br.readLine();
if(option.equalsIgnoreCase("n"))
break;
}
fout.close();
FileInputStream fin = new FileInputStream("student.txt");
br = new BufferedReader(new InputStreamReader(fin));
while(true)
{String str = br.readLine();
if(str==null)
break;
System.out.println(str);
}
fin.close();
}
catch(Exception e)
{e.printStackTrace();
}
}
}
