package demo;

public class alphabetAseAndDes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="yash technology";
		
		char[] ch= s1.toCharArray();
		
		System.out.println(ch);
		 for(int i=0; i<ch.length;i++) {
			 for(int j=0;j<ch.length;j++){
				 if(ch[i]>ch[j]) {
				char temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
				//System.out.println(ch);
				 }
			 }
		 }
		
		 for(int k=0;k<ch.length;k++) {
			 System.out.println(ch[k]);
		 }
		 for(int i=0; i<ch.length;i++) {
			 for(int j=0;j<ch.length;j++){
				 if(ch[i]<ch[j]) {
				char temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
				//System.out.println(ch);
				 }
			 }
		 }
		
		 for(int k=0;k<ch.length;k++) {
			 System.out.println(ch[k]);
		 }
		
		
	}

}
