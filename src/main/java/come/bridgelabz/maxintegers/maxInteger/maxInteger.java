package come.bridgelabz.maxintegers.maxInteger;

public class maxInteger {

	public static Integer maxInt(Integer one, Integer two, Integer three) {
		Integer max = one;
		if (two.compareTo(max) > 0)
			max = two;
		if (three.compareTo(max) > 0)
			max = three;
		return max;

	}

	public static Float maxFloat(Float one, Float two, Float three) {
		Float max = one;
		if (two.compareTo(max) > 0)
			max = two;
		if (three.compareTo(max) > 0)
			max = three;
		return max;

	}

	public static String maxString(String one, String two, String three) {
		String max = one;
		if (two.compareTo(max) > 0)
			max = two;
		if (three.compareTo(max) > 0)
			max = three;
		return max;

	}
	
	public static <T extends Comparable<T>> T maxGeneric(T one, T two, T three) {
		T max = one;
		if (two.compareTo(max) > 0)
			max = two;
		if (three.compareTo(max) > 0)
			max = three;
		return max;

	}
	
	

}
