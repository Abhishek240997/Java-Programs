class test
{test(float ft)
{System.out.println("first constructor");
}
test(int x)
{System.out.println("second constructor");
}
public static void main(String s[])
{new test(5);
new test(5.5f);
new test('A');
}
}