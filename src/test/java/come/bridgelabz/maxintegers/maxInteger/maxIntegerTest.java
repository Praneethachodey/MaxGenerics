package come.bridgelabz.maxintegers.maxInteger;

import org.junit.*;

public class maxIntegerTest {

	@Test
	public void maxIntAtOne() {
		Integer max = maxInteger.maxInt(67, 10, 25);
		Assert.assertSame(max, 67);
	}

	@Test
	public void maxIntAtTwo() {
		Integer max = maxInteger.maxInt(10, 67, 25);
		Assert.assertSame(max, 67);
	}

	@Test
	public void maxIntAtThree() {
		Integer max = maxInteger.maxInt(10, 25, 67);
		Assert.assertSame(max, 67);
	}

	@Test
	public void maxFloatAtFirst() {
		Float max = maxInteger.maxFloat(67.25f, 10.22f, 25.67f);
		Assert.assertEquals(max, 67.25, 0.0);
	}

	@Test
	public void maxFloatAtTwo() {
		Float max = maxInteger.maxFloat(10.22f, 67.25f, 25.67f);
		Assert.assertEquals(max, 67.25, 0.0);
	}

	@Test
	public void maxFloatAtThree() {
		Float max = maxInteger.maxFloat(10.22f, 25.67f, 67.25f);
		Assert.assertEquals(max, 67.25, 0.0);
	}
	
	@Test
	public void maxStringAtOne() {
		String max = maxInteger.maxString("Peach", "Banana", "Apple");
		Assert.assertEquals("Peach",max);
	}
	
	@Test
	public void maxStringAtTwo() {
		String max = maxInteger.maxString("Banana", "Peach", "Apple");
		Assert.assertEquals("Peach",max);
	}
	
	@Test
	public void maxStringAtThree() {
		String max = maxInteger.maxString("Apple", "Banana", "Peach");
		Assert.assertEquals("Peach",max);
	}

}
