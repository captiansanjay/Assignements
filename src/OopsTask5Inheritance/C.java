package OopsTask5Inheritance;

abstract class C extends B {

	abstract void div(int a, int b);

	void mul(int a, int b) {
		int result = a * b;

		System.out.println("multiplication=" + result);
	}

}
