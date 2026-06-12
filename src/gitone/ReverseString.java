package gitone;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="lavanya";
		
		char ch[]=str.toCharArray();
		
		String rev="";
		
		for (int i = 0; i < ch.length; i++) {
			
			rev=ch[i]+rev;
			
		}
		System.out.println(rev);
	}
}
