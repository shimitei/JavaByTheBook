package syntacticsugar;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TestForEach {

	/**
	 * 拡張for文。
	 * 普通のforやIteratorの出番は無くて良い。
	 */
	@Test
	public void testArray() {
		final Integer[] array = { 1, 2, 3 };

		Integer sum = 0;
		for (Integer i : array) {
			sum += i;
		}
		assertTrue(sum == 6);
	}

	/**
	 * Mapのすべてのkey,valueの処理。
	 */
	@Test
	public void testMap() {
		@SuppressWarnings("serial")
		final Map<String, Integer> map = new HashMap<String, Integer>() {
			//HashMap<String, Integer>を継承した匿名クラスに
			//初期化ブロックで初期化
			{
	            put("りんご", 1);
	            put("みかん", 2);
	            put("ばなな", 3);
			}
        };

        Integer sum = 0;
		for (Map.Entry<String, Integer> e : map.entrySet()) {
		    final Integer value = e.getValue();
			sum += value;
		}
		assertTrue(sum == 6);
	}
}
