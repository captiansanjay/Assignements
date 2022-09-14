package demo;

public class StringBuilderNBufferSpeedTest {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Yash");
		for (int i = 0; i < 10000; i++) {
			sb.append("Technologies");
		}
		System.out.println("Time of StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
		startTime = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder("Java");
		for (int i = 0; i < 10000; i++) {
			sb2.append("Tpoint");
		}
		System.out.println("Time of StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
	}

}
