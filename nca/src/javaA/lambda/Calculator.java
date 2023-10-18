package javaA.lambda;

public class Calculator implements Addition,Power{
	public int add(int x, int y) {
		return x + y;
	}
	public long square(int x) {
		return x* x;
	}
}
