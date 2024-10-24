package firstmavenproject;

import org.junit.Assert;
import org.junit.Test;


public class AppTest {
	@Test
	public void greetings() {
		Assert.assertEquals("Hello World", new String("Hello World"));
	}
	
	@Test
	public void checkEquals() {
		Assert.assertEquals(5==6, 7==8);
	}
}
