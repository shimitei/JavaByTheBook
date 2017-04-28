package stringmanipulation;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class Joining {

	/**
	 * Listの内容をカンマ区切りの文字列に連結する。
	 */
	public String joinWithComma(List<String> list) {
		//Java8のString.joinとは仕様が違う（["1",null,"3"]等）
		return StringUtils.join(list, ",");
	}
}
