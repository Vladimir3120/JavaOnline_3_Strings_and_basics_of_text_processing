package StringAsAnArray05;

public class Editor {

	public Editor() {
		super();
	}

	public String spaceDelete(String text) {

		text = text.trim();

		boolean isSpace = false;

		char[] arrayText = text.toCharArray();

		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < arrayText.length; i++) {

			if (Character.isWhitespace(arrayText[i])) {

				if (!isSpace) {
					builder.append(" ");
				}
				isSpace = true;

			} else {
				builder.append(arrayText[i]);
				isSpace = false;
			}
		}

		return builder.toString();
	}

}