abstract class Foo {
	public abstract void bar();
}

class Outer {
	public void method() {
		int variable = 10;
		
		class Inner extends Foo {
			@Override
			public void bar() {
				System.out.println(variable);
			}
		}
		
		Inner i = new Inner();
		i.bar();
	}
}

public class Main {
	
	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();
	}
}