package ObectStringOrStringBuilder07;

public class Editor {

	private String text;

	public Editor(String text) {
		super();
		this.text = text;
	}

	public String deleteSpace() {

		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < text.length(); i++) {

			if (text.charAt(i) == ' ') {
				builder.append("");
			} else {
				builder.append(text.charAt(i));
			}

		}

		return text = builder.toString();

	}

	public String deleteDoubleElemet() {

		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < text.length(); i++) {

			if (text.indexOf(text.charAt(i)) == i) {
				builder.append(text.charAt(i));
			}
		}

		return text = builder.toString();

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
