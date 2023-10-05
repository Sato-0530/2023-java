package java1;

public class Chapter02_21 {

	public static void main(String[] args) {
		
		String str = "abcdef";
		// 比較文字列（引数）が大きければマイナス値、小さければプラス値、同等であれば0を戻り値として返す
		System.out.println(str.compareTo("abc"));
		System.out.println(str.compareTo("abcdef"));
		System.out.println(str.compareTo("abcdefA"));
	}

}
