class school
{public static void main(String s[])
{student st1,st2;
st1=new student();
st2=new student();
st1.admission(101);
st2.admission(102);
st1.exam(85);
st2.exam(65);
st1.report();
st2.report();
System.out.println(st1);//internally invokes the toString method
System.out.println(st2);
System.out.println(st1.hashCode());
System.out.println(st2.hashCode());
System.out.println(st1.toString());
System.out.println(st2.toString());
}
}