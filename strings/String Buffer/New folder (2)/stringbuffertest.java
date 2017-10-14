class stringbuffertest
{public static void main(String s[])
{StringBuffer sb = new StringBuffer(5);
sb.append("ABCDEF");
System.out.println(sb.capacity());
}
}