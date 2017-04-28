package stringmanipulation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestJoining {

	/**
	 * カンマで連結
	 */
	@Test
	public void testJoiningCase1() {
		final Joining ex = new Joining();
		final List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");

		final String result = ex.joinWithComma(list);
		assertEquals(result, "1,2,3,4,5,6");
	}

	/**
	 * nullを含む場合
	 */
	@Test
	public void testJoiningCase2() {
		final Joining ex = new Joining();
		final List<String> list = new ArrayList<>();
		list.add("1");
		list.add(null);
		list.add("3");

		final String result1 = ex.joinWithComma(list);
		assertEquals(result1, "1,,3");

		list.add(null);
		final String result2 = ex.joinWithComma(list);
		assertEquals(result2, "1,,3,");
	}

	/**
	 * リストのアイテムが0個、1個で結果にカンマを含まない場合
	 */
	@Test
	public void testJoiningCase3() {
		final Joining ex = new Joining();
		final List<String> list = new ArrayList<>();

		final String result1 = ex.joinWithComma(list);
		assertEquals(result1, "");

		list.add("1");
		final String result2 = ex.joinWithComma(list);
		assertEquals(result2, "1");
	}

	/**
	 * リストがnullの場合
	 */
	@Test
	public void testJoiningCase4() {
		final Joining ex = new Joining();
		final String result = ex.joinWithComma(null);
		assertNull(result);
	}
}
