package Day1;

public class Example10 {
	public static void main(String[] args) {
		int x=3;
		x++;
		System.out.println(x);
		++x;
		System.out.println(x);
		
		int i = x++;
		System.out.println(i + " " +x);
		int j = ++x;
		System.out.println(j + " " +x);
	}

}
