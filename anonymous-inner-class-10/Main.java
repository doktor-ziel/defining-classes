abstract class Foo {
	public abstract void bar();
}

class Outer {
	public void method() {
		int variable = 10;
				
		Foo i = new Foo() {
			@Override
			public void bar() {
				System.out.println(variable);
			}
			
			public void f() {
				System.out.println(variable);
			}
		};
		
		i.bar();
	}
}

public class Main {
	
	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();
	}
}