public class A {
	String name;

	public A(String s) {
		name = s;
	}

	public void doSomething(String s) {
		...
	}
}

public class B extends A {
	int x;

	public B(String s, int num) {
		super(s);
		x = num;
	}

	public void doSomething(String s) {
		...
	}
}

/*
in order to stop doSomething(String s) from class B
overriding doSomething(String s) from class A
we add final in doSomething(String s) of class A
this stops function overriding in cases its required
*/

public class A {
	String name;

	public A(String s) {
		name = s;
	}

	public final void doSomething(String s) {
		...
	}
}

public class B extends A {
	int x;

	public B(String s, int num) {
		super(s);
		x = num;
	}

	public void doSomething(String s) {
		...
	}
}