package OopsTask5Inheritance;

abstract class B extends A{

	abstract void mul(int a, int b);

	abstract void div(int a, int b);
	void sub(int a,int b) {
		int result=a-b;
		
		System.out.println("sub="+result);
		
	}

}
