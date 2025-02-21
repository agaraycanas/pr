package t04.c.ej09;

public class Main {

	public static int numVecesChar(String s,char c) {
		int n=0;
		for (int i=0;i<s.length();i++) {
			if (s.charAt(i) == c) {
				n++;
			}
		}
		return n;
	}
	
	public static void main(String[] args) {
		String s = "aaabbbAAA";
		System.out.println(numVecesChar(s, 'a'));
		System.out.println(numVecesChar(s, 'b'));
		System.out.println(numVecesChar(s, 'c'));

	}

}
