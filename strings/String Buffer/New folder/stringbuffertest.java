class stringbuffertest
{public static void main(String s[])
{StringBuffer sb = new StringBuffer(12);
sb.ensureCapacity(25);
System.out.println(sb.capacity());
}
} 