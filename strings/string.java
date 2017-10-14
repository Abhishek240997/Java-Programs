import java.util.*;
class string
{public static void main(String s[])
{int vowel=0;
System.out.println("enter the string");
Scanner sc=new Scanner(System.in);
String name=sc.nextLine();
char ch[]=name.toCharArray();
for(int i=0;i<ch.length;i++)
{if((ch[i]=='a')||(ch[i]=='e')||(ch[i]=='i')||(ch[i]=='o')||(ch[i]=='u'))
{vowel++;}
}
System.out.println(+vowel);
}
}
