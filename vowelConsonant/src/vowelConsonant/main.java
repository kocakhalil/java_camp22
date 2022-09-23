package vowelConsonant;

public class main {

	public static void main(String[] args) {
		
		char character = 'Ü';

		switch (character) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(character + " is vowel");
            break;
        default:
            System.out.println(character + " is consonant");

		}
	}
}
