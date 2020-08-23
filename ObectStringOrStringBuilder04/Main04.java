package ObectStringOrStringBuilder04;

public class Main04 {

	/*
	 * С помощью функции копирования и операции конкатенации составить из частей
	 * слова “информатика” слово “торт”.
	 */

	public static void main(String[] args) {

		String word = "информатика";

		Editor editor = new Editor();

		String tort = editor.createNewWord(word);

		System.out.println(tort);
	}
}
