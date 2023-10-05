package java5;

public class Chapter05_09 {

	public static void main(String[] args) {
		if((args.length > 0)) {
			if(args.length % 2 == 0) {
				System.out.println("引数の個数は偶数である");
			} else {
				System.out.println("引数の個数は奇数である");
			}
		}
	}

}
