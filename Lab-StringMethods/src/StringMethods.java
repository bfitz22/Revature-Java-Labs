
public class StringMethods {
	public static void main(String[] args) {
		String s1 = "coffee";
		String s2 = new String ("coffee");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		String s3 = "supercalifragilisticexpialidocious";
		
		System.out.println(s3.length());
		System.out.println(s3.indexOf("c"));
		System.out.println(s3.indexOf("z"));
		
		char[] strArray = s3.toCharArray();
		int count = 0;
		
		for(char ele: strArray) {
			if ('i' == ele) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
