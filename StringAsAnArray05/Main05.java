package StringAsAnArray05;

public class Main05 {

	/*
	 * Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов
	 * заменить на одиночные пробелы. Крайние пробелы в строке удалить.
	 */

	public static void main(String[] args) {

		String text = "Hello    hot  Java   ";

		Editor editor = new Editor();

		System.out.println(editor.spaceDelete(text));

	}
}
