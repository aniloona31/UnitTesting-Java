package com.testing.unitTesting;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class UnitTestingApplicationTests {

	private Calculator calculator = new Calculator();
	
	@Test
	void contextLoads() {
	}

	@Test
	void testSum() {
		int expect = 33;
		
		//actual;
		int result = calculator.doSum(12, 11, 10);
		
//		we have to check if actual result matches with expected result 
//		to do so we will use a library called as AssertJ
		assertThat(result).isEqualTo(expect);
	}
}
