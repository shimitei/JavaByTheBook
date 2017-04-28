package stringmanipulation;

public class Split {

	/**
	 * カンマ区切りで分割。
	 */
	public String[] splitComma(String s) {
		//limitを指定しない場合は、末尾の空文字列が省略されてしまう
		return s.split(",", -1);
	}
}
