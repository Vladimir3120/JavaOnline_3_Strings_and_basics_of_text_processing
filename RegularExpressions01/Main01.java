package RegularExpressions01;

public class Main01 {

	/*
	 * Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее
	 * выполнять с текстом три различных операции: отсортировать абзацы по
	 * количеству предложений; в каждом предложении отсортировать слова по длине;
	 * отсортировать лексемы в предложении по убыванию количества вхождений
	 * заданного символа, а в случае равенства – по алфавиту.
	 */

	public static void main(String[] args) {
		String text = "There are a lot of people who wants to move and live in the UK. Most of all people are even dreaming of it, but certainly they don’t know everything about the weather in Britain."
				+ "\n"
				+ "In the spring the weather is mild in some parts of Britain. It rains a lot, especially in the west and in the centre of England. You can never be right about the weather for a day. You can get wet through and in twenty minutes the sun appears. If you go out without an umbrella, this means it will be raining for sure."
				+ "\n"
				+ "In summer the weather is better. The south and the east parts are the warmest parts. Average temperatures can reach 30 degrees on some days. At the end of summer it is getting foggy more often."
				+ "\n"
				+ "In autumn it’s windy and foggy; and it rains quite often. This season can be called neither too cold nor warm."
				+ "\n"
				+ "In winter there are a few sunny days. In the south of England you can see blue sky sometimes. But as a rule it is very cold, and the sky is often cloudy. Especially it can be noticed in the north and east. Winter is not very pleasant in these regions.";

		Editor editor = new Editor(text);
		editor.options();
	}

}
