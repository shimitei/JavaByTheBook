package syntacticsugar;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestArrays {

	@Test
	public void testStringArray() {
		final String[] array1 = new String[2];
		array1[0] = "str1";
		array1[1] = "str2";

		//String以外の配列でも同様に記述可能
		assertArrayEquals(array1, new String[] { "str1", "str2" });
		//初期化時はnew String[]を省略可能
		final String[] array2 = { "str1", "str2" };
		assertArrayEquals(array1, array2);
		//代入では省略できない
		//String[] array3;
		//array3 = { "str1", "str2" };
	}
}
