package com.testing.unitTesting;

//import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.*;

//@SpringBootTest spins up the entire spring boot container
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
	
	@Test
//	@Disabled this annotation is used if you dont want to test partiular method
	void testProduct() {
		int expect = 12;
		
		int result = calculator.doMultipy(4, 3);
		
		assertThat(result).isEqualTo(expect);
	}
}
