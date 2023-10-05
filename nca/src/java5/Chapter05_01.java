package java5;

public class Chapter05_01 {

	public static void main(String[] args) {
		int x = (int)(Math.random()*100);
		if(x%7==0){
			System.out.println("xの値："+x+"は7の倍数です");
		}else {
			System.out.println("xの値："+x+"は7の倍数ではないです");
		}
	}

}
