package ObectStringOrStringBuilder04;

public class Editor {

	private String text;

	public Editor() {
		super();
	}

	public String createNewWord(String text) {

		char[] ch = text.toCharArray();
		String newWord = "";

		newWord = newWord.concat(
				String.copyValueOf(ch, 7, 1).concat(String.copyValueOf(ch, 3, 2).concat(String.copyValueOf(ch, 7, 1))));

		return newWord;

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
