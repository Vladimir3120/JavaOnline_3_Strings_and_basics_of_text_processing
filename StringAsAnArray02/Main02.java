package StringAsAnArray02;

public class Main02 {

	/*
	 * Замените в строке все вхождения 'word' на 'letter'.
	 */

	public static void main(String[] args) {

		String text = "This word is new word in the World";
		System.out.println(text);

		Editor editor = new Editor(text);

		System.out.println(editor.name());

	}
}