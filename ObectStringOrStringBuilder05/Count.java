package ObectStringOrStringBuilder05;

public class Count {

	private String text;

	public Count() {
		super();
	}

	public int letter(String text) {

		text = text.toLowerCase();

		int letter = 0;

		for (int i = 0; i < text.length(); i++) {

			if (text.charAt(i) == 'a') {
				letter++;
			}
		}

		return letter;

	}

	@Override
	public String toString() {
		return "Count [text=" + text + "]";
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
		Count other = (Count) obj;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}

}
