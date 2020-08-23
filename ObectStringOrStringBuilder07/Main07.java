package ObectStringOrStringBuilder07;

public class Main07 {

	/*
	 * Вводится строка. Требуется удалить из нее повторяющиеся символы и все
	 * пробелы. Например, если было введено "abc cde def", то должно быть выведено
	 * "abcdef".
	 */

	public static void main(String[] args) {

		String text = "abc cde def";
		System.out.println(text);

		Editor editor = new Editor(text);

		text = editor.deleteSpace();
		text = editor.deleteDoubleElemet();

		System.out.println(text);
	}
}
