package leetcode17;

public class Main {
	public static void main(String[] args) {
		String digits = "23";
		
		System.out.println("Input: " + digits);
		
		FindAllPossibleLetterCombinationsFunction solution = new FindAllPossibleLetterCombinationsFunction();
		
		System.out.println("Solution: " + solution.letterCombinations2(digits));
	}
}
