package StringAsAnArray01;

import java.util.Arrays;

public class Main01 {

	public static void main(String[] args) {

		String[] camelCase = { "helloJava", "hotJava", "bestPractice" };

		System.out.println("camelCase=" + Arrays.toString(camelCase));

		Editor editor = new Editor(camelCase);

		editor.snakeCase();

		System.out.println("snakeCase=" + Arrays.toString(camelCase));
		
		System.out.println(editor);

	}
}
