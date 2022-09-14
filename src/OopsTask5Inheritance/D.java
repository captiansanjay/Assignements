package OopsTask5Inheritance;

public class D extends C{
	
	void div(int a,int b) {
		int result=a/b;
		
		System.out.println("Division="+result);
		
		
		
	}
	
	public static void main(String[] args) {
		D d=new D();
		d.sum(10, 10);
		d.sub(20, 5);
		d.mul(10, 10);
		d.div(10, 5);
	}

}
