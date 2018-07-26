
public class StringCompare {

	public static void main(String[] args)
	{
		String a = "A";
		String b = "A";
		String test = new String(a);
		System.out.println("test"+test);
		System.out.println("compare a= b" + a==b);
		System.out.println(a.equals(b));
		String c = b;
		System.out.println("Value of C=" + c);
	}
}
