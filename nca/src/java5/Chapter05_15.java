package java5;

public class Chapter05_15 {

	public static void main(String[] args) {

		if(args.length > 0) {
			String s = args[0].substring(0,1);
			switch(s) {
			case "a":
				System.out.println("頭文字は「a」");
				break;
			case "b":
				System.out.println("頭文字は「b」");
				break;
			case "c":
				System.out.println("頭文字は「c」");
				break;
			default:
				System.out.println("頭文字は「a,b,c」以外");
				break;
			}
		}
	}

}
