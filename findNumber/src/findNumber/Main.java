package findNumber;

public class Main {

	public static void main(String[] args) {
		
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int willFound = 2;
		boolean isFound = false;

		for (int number : numbers) {
			if (number == willFound) {
				isFound = true;
				break;
			}
		}

		if (isFound) {
			System.out.println(willFound+": available");
		} 
		
		else {
			System.out.println(willFound+": not available");
		}
	}
}
