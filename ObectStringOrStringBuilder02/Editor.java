package ObectStringOrStringBuilder02;

public class Editor {

	public Editor() {
		super();
	}

	public String insertLetter(String text) {

		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < text.length(); i++) {

			if (text.charAt(i) == 'a') {
				builder.append("ab");

			} else {
				builder.append(text.charAt(i));
			}
		}
		return builder.toString();
	}
}
