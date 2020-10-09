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
	
	@Test
	public void maxGenericsInteger() {
		Integer max = maxInteger.maxGeneric(67, 10, 25);
		Assert.assertSame(67,max);
	}
	
	@Test
	public void maxGenericsFloat() {
		Float max = maxInteger.maxGeneric(67.25f, 10.67f, 25.98f);
		Assert.assertEquals(67.25,max,0.0);
	}
	
	@Test
	public void maxGenericsString() {
		String max = maxInteger.maxGeneric("Apple", "Peach", "Banana");
		Assert.assertSame("Peach",max);
	}
	
	@Test
	public void maxGenericsClassInteger() {
		maxInteger<Integer> maximum = new maxInteger<>(1, 10, 100);
		Integer max = maximum.testMaximum();
		Assert.assertSame(100,max);
	}

	@Test
	public void maxGenericsClassFloat() {
		maxInteger<Float> maximum = new maxInteger<>(1.09f, 10.11f, 100.25f);
		Float max = maximum.testMaximum();
		Assert.assertEquals(100.25f,max,0.0);
	}
	
	@Test
	public void maxGenericsClassString() {
		maxInteger<String> maximum = new maxInteger<>("Apple","Peach","Banana");
		String max = maximum.testMaximum();
		Assert.assertSame("Peach",max);
		
	}


}
