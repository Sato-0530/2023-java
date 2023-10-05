package java1;

public class Chapter02_18 {

	public static void main(String[] args) {
		
		String str1 = "2 + 4 = " + 2 + 4 + "ではありません";
		String str2 = "2 + 4 = " + ( 2 + 4 ) + "です";
		String str = "Java";
		String str3 = str + str + "!";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}

}
