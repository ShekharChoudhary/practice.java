package practice.java.puzzles;

import java.util.LinkedHashSet;
import java.util.Set;

public class PermutationTest {

	public static void main(String[] args) {
		String str = "AAB";
		int n = str.length();
		Permutation per = new Permutation();
		per.permute(str,0,n-1);
	}
}

class Permutation{

	Set<String> set = new LinkedHashSet<>();
	public void permute(String str, int startIndex, int endIndex) {
		int initialValue = 0;
		for(int i =initialValue;i<=endIndex;i++) {
			String value = str;
			value = swap(value,initialValue,i);
			value = swap(value,initialValue+1,endIndex);
			
		}
		for (String val : set) {
			System.out.println(val);
		}
	}
	private String swap(String value, int i, int endIndex) {
		char [] charArr = value.toCharArray();
		char temp = charArr[i];
		charArr[i]=charArr[endIndex];
		charArr[endIndex] = temp;
		value = String.valueOf(charArr);
		set.add(value);
		return value;
	}
	
	
	
}
