package javaA.lambda;

public class RambdaMain {
	public static void main (String[] args) {
		int a = 100;
		int b = 20;
		long ans;
		/*通常*/
		Calculator calc1 = new Calculator();
		ans = calc1.add(a,  b);
		System.out.println("①a＋bの答えは、"+ ans + "です。");
		ans = calc1.square(a);
		System.out.println("①aの二乗の答えは、" + ans + "です。");
		
		

		/*無名クラス*/
		Addition addition2 = new Addition() {
			public int add(int x, int y) {
				return x + y;
			}
		};
		System.out.println("②a＋bの答えは"+ addition2.add(a, b) + "です。");
		
		Power power2 = new Power() {
			public long square(int x) {
				return x * x; 
			}
		};
		System.out.println("②aの二乗の答えは、"+ power2.square(a) + "です。");
		
		Subtraction subtraction = new Subtraction() {
			public int sub(int x, int y) {
				return x - y;
			}
		};
		System.out.println("②a-bの答えは、"+ subtraction.sub(a, b) + "です。");
		
		Multiplication multiplication = new Multiplication() {
			public int mult(int x ,int y) {
				return x * y;
			}
		};
		System.out.println("②a×bの答えは、"+ multiplication.mult(a, b) + "です。");
		
		Division division = new Division() {
			public int div(int x , int y) {
				return (y==0) ? 0 : x / y;
			}
		};
		System.out.println("②a÷bの答えは、"+ division.div(a, b) + "です。");
		
		
		/*ラムダ式*/
		Addition addition3 = (x, y) -> x + y;
		System.out.println("③a＋bの答えは"+ addition3.add(a, b) + "です。");
		
		Power power3 = x -> x * x;
		System.out.println("③aの二乗の答えは、"+ power3.square(a) + "です。");
		
		Subtraction subtraction3 = (x , y) -> x - y;
		System.out.println("③a-bの答えは、"+ subtraction3.sub(a, b) + "です。");
		
		Multiplication multiplication3 = (x ,y) -> x * y;
		System.out.println("③a×bの答えは、"+ multiplication3.mult(a, b) + "です。");
		
		Division division3 = (x , y) -> (y==0) ? 0 : x / y;
		System.out.println("③a÷bの答えは、"+ division3.div(a, b) + "です。");
	}
}
