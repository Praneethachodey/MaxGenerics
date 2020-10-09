package come.bridgelabz.maxintegers.maxInteger;

import org.junit.*;

public class maxIntegerTest {
	
@Test
public void maxAtOne() {
	Integer max = maxInteger.maxInt(67, 10, 25);
	Assert.assertSame(max,67);
}

@Test
public void maxAtTwo() {
	Integer max = maxInteger.maxInt(10, 67, 25);
	Assert.assertSame(max,67);
}

@Test
public void maxAtThree() {
	Integer max = maxInteger.maxInt(10, 25, 67);
	Assert.assertSame(max,67);
}

}
