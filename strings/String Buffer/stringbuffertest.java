class stringbuffertest
{public static void main(String s[])
{StringBuffer sb1 = new StringBuffer();
StringBuffer sb2 = new StringBuffer(25);
StringBuffer sb3 = new StringBuffer("ABC");
System.out.println(sb1.capacity());
System.out.println(sb2.capacity());
System.out.println(sb3.capacity());
}
}