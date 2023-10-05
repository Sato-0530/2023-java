package java5;

public class Chapter05_21 {

	public static void main(String[] args) {

		int i;
		for(i = 0; i < args.length; i++) {
			System.out.println("第" + (i+1) + "引数：" + args[i]);
		}
	}

}
