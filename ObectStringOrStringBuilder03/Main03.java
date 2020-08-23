package ObectStringOrStringBuilder03;

public class Main03 {

	/*
	 * Проверить, является ли заданное слово палиндромом.
	 */

	public static void main(String[] args) {

		String madam = "Madam";
		String java = "java";
		String topot = "topot";

		Palindrom palindrom = new Palindrom();

		palindrom.chek(madam);
		palindrom.chek(java);
		palindrom.chek(topot);

	}
}
