class Outer {
	private int field01 = 1;
	private static int field02 = 2;
	
	public void foo() {
		Inner.field02 = 200;
	}
	
	static class Inner {
		private int field01 = 10;
		private static int field02 = 20;

		public void method() {
			System.out.println(field01);
			System.out.println(field02);
			System.out.println(Outer.field02);
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Outer.Inner i = new Outer.Inner();
		i.method();
	}
}