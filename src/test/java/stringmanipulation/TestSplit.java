package stringmanipulation;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSplit {

	/**
	 * String.splitの注意点。 末尾の区切りが空の場合に省略される。
	 * 省略したくない場合はlimitを指定する。
	 */
	@Test
	public void testSplitWarning1() {
		//limit省略
		assertArrayEquals("1,2,".split(","), new String[] { "1", "2" });
		assertArrayEquals("1,2,,".split(","), new String[] { "1", "2" });
		//limit指定
		assertArrayEquals("1,2,".split(",", -1), new String[] { "1", "2", "" });
		assertArrayEquals("1,2,,".split(",", -1), new String[] { "1", "2", "", "" });
	}

	/**
	 * カンマ区切り分割
	 */
	@Test
	public void testSplitCase1() {
		final Split ex = new Split();
		assertArrayEquals(ex.splitComma("1,2,3,4,5,6"), new String[] { "1", "2", "3", "4", "5", "6" });
	}

	/**
	 * 分割結果に空文字列を含む場合
	 */
	@Test
	public void testSplitCase2() {
		final Split ex = new Split();
		assertArrayEquals(ex.splitComma("1,,3"), new String[] { "1", "", "3" });
		assertArrayEquals(ex.splitComma("1,,3,"), new String[] { "1", "", "3", "" });
	}

	/**
	 * カンマを含まない場合
	 */
	@Test
	public void testSplitCase3() {
		final Split ex = new Split();
		assertArrayEquals(ex.splitComma(""), new String[] { "" });
		assertArrayEquals(ex.splitComma("1"), new String[] { "1" });
	}
}
