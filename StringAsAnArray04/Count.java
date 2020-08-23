package StringAsAnArray04;

public class Count {

	private String text;

	public Count(String text) {
		super();
		this.text = text;
	}

	public int numbers() {
		int count = 0;

		char[] arrayText = text.toCharArray();

		for (int i = 0; i < arrayText.length - 1; i++) {

			if (Character.isDigit(arrayText[i]) && !Character.isDigit(arrayText[i + 1])) {
				count++;
			}
		}

		if (Character.isDigit(arrayText[arrayText.length - 1])) {
			count++;
		}

		return count;

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
