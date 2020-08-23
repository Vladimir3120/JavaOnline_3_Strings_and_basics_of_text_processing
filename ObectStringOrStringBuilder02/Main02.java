package ObectStringOrStringBuilder02;

public class Main02 {

	/*
	 * В строке вставить после каждого символа 'a' символ 'b'.
	 */

	public static void main(String[] args) {

		String text = "Java";

		System.out.println(text);

		Editor editor = new Editor();

		System.out.println(editor.insertLetter(text));

	}

}
