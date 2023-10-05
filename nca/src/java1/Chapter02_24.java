package java1;

public class Chapter02_24 {

	public static void main(String[] args) {
		
		String str = "ABCDEFABABC";

		System.out.println(str.concat("abc"));
		System.out.println(str.replace("AB", "ab"));
		System.out.println(str.substring( 3 ));
		System.out.println(str.substring( 3, 7 ));
	}

}
