class Outer {
	public void method() {
		int variable = 10;
		
		class Inner {
			public void method() {
				System.out.println(variable);
			}
		}
		variable++;
		Inner i = new Inner();
		i.method();
	}
}

public class Main {
	
	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();
	}
}