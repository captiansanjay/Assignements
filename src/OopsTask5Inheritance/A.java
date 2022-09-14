package OopsTask5Inheritance;

abstract class A extends CalcAbs{
	abstract void sub(int a, int b);

	abstract void mul(int a, int b);

	abstract void div(int a, int b);
	
	void sum(int a, int b) {
		
		int result=a+b;
		
		System.out.println("sum="+result);
	}

}
