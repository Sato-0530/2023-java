package java5;

public class Chapter05_12 {

	public static void main(String[] args) {

		int x = (int)(Math.random()*10) % 4;
		
		switch(x) {
		case 1:
			System.out.println(Math.random()*10 % 4);
			System.out.println("余りは1");
			break;
		case 2:
			System.out.println(Math.random()*10 % 4);
			System.out.println("余りは2");
			break;
		case 3:
			System.out.println(Math.random()*10 % 4);
			System.out.println("余りは3");
			break;
		default:
			System.out.println(Math.random()*10 % 4);
			System.out.println("余りはなし");
			break;
		}
	}

}
