package StringAsAnArray02;

public class Editor {

	private String text;
	private static String word = "word";
	private static String letter = "letter";

	public Editor(String text) {
		super();
		this.text = text;
	}

	public String name() {

		String[] arrayText = text.split(" ");

		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < arrayText.length; i++) {

			if (arrayText[i].equals(word)) {

				builder.append(letter);
				builder.append(" ");

			} else {
				builder.append(arrayText[i]);
				builder.append(" ");

			}

		}

		return this.text = builder.toString();

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