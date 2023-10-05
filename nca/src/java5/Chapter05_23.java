package java5;

public class Chapter05_23 {

	public static void main(String[] args) {

		int[][] data = new int[][] {
			{4,12,7,6,5},
			{9,27,3,1,0},
			{12,1,2,3,6}
		};
		
		String str = "";		
		for(int j = 0; j < data.length; j++) {
			str = "";
			for(int i = 0; i < data[j].length; i++) {
				str = str + data[j][i] + "　";
			}
			System.out.println(str);
		}

	}

}
