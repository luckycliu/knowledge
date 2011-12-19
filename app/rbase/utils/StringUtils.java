package rbase.utils;

public class StringUtils extends org.apache.commons.lang.StringUtils {
	public static String getMaxSubString(int max, String str) {
		if (str.length() < max)
			return str;
		else {
			return str.substring(0, max) + "...";
		}
	}
}
