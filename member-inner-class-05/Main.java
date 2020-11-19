

class Outer {
	private int field = 10;
	
	void method() {
		Inner i = new Inner();
		i.foo();
	}
	
	class Inner {
		private int field = 5;
		
		void foo() {
			System.out.println(field);
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.foo();
	}
}