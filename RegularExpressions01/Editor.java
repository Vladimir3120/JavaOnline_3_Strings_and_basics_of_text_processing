package RegularExpressions01;

import java.util.Scanner;

public class Editor {

	private String text;

	public Editor(String text) {
		super();
		this.text = text;
	}

	public void options() {

		int key = scanner("1 - сортировка абзацов по колличеству предложений" + "\n"
				+ "2 - сортировка слов по длинне в предложении" + "\n"
				+ "3 - сортировка лексем в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту"
				+ "\n" + "4 ->> - Выход");

		switch (key) {
		case 1:
			System.out.println(Creator.sortSentenceLength(text));
			options();
			break;
		case 2:
			System.out.println(Creator.sortWordLength(text));
			options();
			break;
		case 3:

			System.out.println(Creator.sortLetter(text, charSc("Введите букву")));
			options();
			break;

		default:
			if (key > 3)
				break;
		}

	}

	private static int scanner(String message) {
		int n;
		@SuppressWarnings("resources")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(message);

		}
		n = sc.nextInt();
		
		return n;
	}

	private static char charSc(String message) {

		char[] letter;
		@SuppressWarnings("resources")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		while (sc.hasNextInt()) {
			sc.next();
			System.out.println("Введите букву!!!");
		}

		letter = sc.next().toCharArray();

		return letter[0];
	}

	@Override
	public String toString() {
		return "Editor [text=" + text + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Editor other = (Editor) obj;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}

}
