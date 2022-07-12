package logicalProgrmas;

import java.util.Arrays;

public class CompareArray {

	public static void main(String[] args) {
		// compare arrays
	
		int a[]= {10,20,30};
		int b[]= {50,60,30};
		int c[]= {10,20,30};
		
		String str1[]= {"Aa","bb"};
		String str2[]= {"dg","hp"};
		String str3[]= {"Aa","bb"};

		System.out.println("comparing integer arrays");
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(a, c));
		System.out.println(Arrays.equals(c, b));
		System.out.println("comparing string arrays");
		System.out.println(Arrays.equals(str1, str2));
		System.out.println(Arrays.equals(str1, str3));
		System.out.println(Arrays.equals(str3, str2));

	
	}
}
