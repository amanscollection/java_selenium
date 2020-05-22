package test;

import org.junit.Test;

public class AppTest {

	@Test
	public void MyClass() {
		
		AppTest tester = new AppTest();
		assertEquals("Hello World", tester.equals("Hello"));
	}

	private void assertEquals(String string, boolean equals) {
		// TODO Auto-generated method stub
		
	}

}
